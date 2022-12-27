import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletLong extends Actor
{
    /**
     * Act - do whatever the BulletEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer move = new SimpleTimer();
    int count = 0;
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        
        move(10);
        if(getY() >= world.getHeight()-1 || getX() >= world.getWidth()-1 || getY() <= 1 || getX() <= 1)
        {
            world.removeObject(this);
        }
    }
}
