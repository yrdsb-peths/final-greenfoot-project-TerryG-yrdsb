import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletBoss here.
 * 
 * @author (Terry G) 
 * @version (1/17/2022)
 */
public class BulletBoss extends Actor
{
    /**
     * Act - do whatever the BulletBoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        
        move(5);
        if(getY() >= world.getHeight()-1 || getX() >= world.getWidth()-1 || getY() <= 1 || getX() <= 1)
        {
            world.removeObject(this);
        }
    }
}
