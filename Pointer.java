import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pointer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pointer extends Actor
{
    /**
     * Act - do whatever the Pointer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image = getImage();
        image.scale(1, 1);
        setImage(image);
        MouseInfo info = Greenfoot.getMouseInfo();
        if(info != null)
        {
            int x = info.getX();
            int y = info.getY();
            setLocation(x, y);
        }
    }
}
