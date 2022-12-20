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
    String facing = "";
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
            facing = "right";
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-3);
            facing = "up";
        }
        else if(Greenfoot.isKeyDown("down"))
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
            if(facing.equals("up"))
            {
                world.addObject(bullet,getX(),getY());
                bullet.setRotation(270);
            }
            if(facing.equals("down"))
            {
                world.addObject(bullet,getX(),getY());
                bullet.setRotation(90);
            }
            if(facing.equals("left"))
            {
                world.addObject(bullet,getX(),getY());
                bullet.setRotation(180);
            }
            if(facing.equals("right"))
            {
                world.addObject(bullet,getX(),getY());
                bullet.setRotation(0);
            }
        }
    }
}
