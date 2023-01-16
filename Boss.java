import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    SimpleTimer bulletCooldown = new SimpleTimer();
    SimpleTimer bulletCooldown2 = new SimpleTimer();
    int health = 50;
    int rotate;
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        
        move(2);
        if(getX() >= world.getWidth()-10 || getY() >= world.getHeight()-10 || getX() <= 10 || getY() <= 10)
        {
            move(-10);
            rotate += 90;
            setRotation(rotate);
            if(rotate == 360)
            {
                rotate = 0;
            }
        }
        if(isTouching(Bullet.class))
        {
            health = health - 1;
            removeTouching(Bullet.class);
            world.setBossHealth(health);
        }
        if(health == 0)
        {
            world.removeObject(this);
        }
        shoot();
        if(health < 30)
        {
            homingMissle();
        }
    }
    
    public void shoot()
    {
        if(bulletCooldown.millisElapsed() < 750)
        {
                return;
        }
        bulletCooldown.mark();
        BulletBoss bullet = new BulletBoss();
        MyWorld world = (MyWorld) getWorld();
        
        int x = Greenfoot.getRandomNumber(50);
        world.addObject(bullet,getX(),getY());
        bullet.setRotation(rotate+115-x);
    }
    
    public void homingMissle()
    {
        if(bulletCooldown2.millisElapsed() < 10000)
        {
                return;
        }
        bulletCooldown2.mark();
        BulletHoming bullet = new BulletHoming();
        MyWorld world = (MyWorld) getWorld();

        world.addObject(bullet,getX(),getY());
    }
}
