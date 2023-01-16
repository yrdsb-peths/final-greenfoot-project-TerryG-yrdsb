import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Actor
{
    int level;
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
        if(isTouching(Player.class) && Greenfoot.isKeyDown("space"))
        {
            MyWorld world = (MyWorld) getWorld();
            world.setLevel();
        }
    }
}
