import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy1 here.
 * 
 * @author (Terry) 
 * @version (Dec 19/22)
 */
public class EnemyShort extends Actor
{
    /**
     * Act - do whatever the enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    SimpleTimer bulletCooldown = new SimpleTimer();

    int health = 5;
    int rotate;
    public EnemyShort(int degrees)
    {
        rotate = degrees;
    }
    
    public void act()
    {
        GreenfootImage image = getImage();
        image.scale(80, 80);
        setImage(image);
        setRotation(rotate);
        if(isTouching(Bullet.class))
        {
            health = health - 1;
            removeTouching(Bullet.class);
        }
        if(health == 0)
        {
            MyWorld world = (MyWorld) getWorld();
            world.addScore();
            world.removeObject(this);
        }
        shoot();
    }
    
    //This lets the enemy shoot bullets
    public void shoot()
    {
        if(bulletCooldown.millisElapsed() < 1000)
        {
                return;
        }
        bulletCooldown.mark();
        BulletShort bullet = new BulletShort();
        MyWorld world = (MyWorld) getWorld();
        
        world.addObject(bullet,getX(),getY());
        bullet.setRotation(rotate-180);
    }
}
