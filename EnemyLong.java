import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyLong extends Actor
{
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer bulletCooldown = new SimpleTimer();

    int health = 3;
    public void act()
    {
        if(isTouching(Bullet.class))
        {
            health = health - 1;
            removeTouching(Bullet.class);
        }
        if(health == 0)
        {
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
        }
        shoot();
    }
    
    public void shoot()
    {
        if(bulletCooldown.millisElapsed() < 1000)
        {
                return;
        }
        bulletCooldown.mark();
        BulletLong bullet = new BulletLong();
        MyWorld world = (MyWorld) getWorld();
        
        world.addObject(bullet,getX(),getY());
        bullet.setRotation(180);
    }
}