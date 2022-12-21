import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (Terry) 
 * @version (Dec 19/22)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
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
