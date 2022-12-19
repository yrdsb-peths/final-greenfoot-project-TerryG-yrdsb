import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (Terry) 
 * @version (Dec 19/22)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    SimpleTimer bulletCooldown = new SimpleTimer();
    public void act()
    {
        String facing = "";
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(3);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-3);
            facing = "up";
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+3);
            facing = "down";
        }
        shoot();
    }
    
    public void shoot()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if(bulletCooldown.millisElapsed() < 1000)
            {
                return;
            }
            bulletCooldown.mark();
            
            Bullet bullet = new Bullet();
            MyWorld world = (MyWorld) getWorld();
            world.addObject(bullet,getX(),getY());
        }
    }
}
