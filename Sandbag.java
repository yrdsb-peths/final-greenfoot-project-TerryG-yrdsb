import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sandbag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sandbag extends Actor
{
    /**
     * Act - do whatever the Sandbag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image = getImage();
        image.scale(30, 90);
        setImage(image);
    }
}
