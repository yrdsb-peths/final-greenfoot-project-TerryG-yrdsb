import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyRocket here.
 * 
 * @author (Terry G) 
 * @version (1/17/2022)
 */
public class EnemyRocket extends Actor
{
    /**
     * Act - do whatever the EnemyRocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
        SimpleTimer bulletCooldown = new SimpleTimer();

    int health = 5;
    
    public void act()
    {
        GreenfootImage image = getImage();
        image.scale(80, 80);
        setImage(image);
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
    
    //This lets the enemy shoot homing rockets
    public void shoot()
    {
        if(bulletCooldown.millisElapsed() < 8000)
        {
                return;
        }
        bulletCooldown.mark();
        BulletHoming bullet = new BulletHoming();
        MyWorld world = (MyWorld) getWorld();
        
        world.addObject(bullet,getX()-20,getY()-20);
    }
}
