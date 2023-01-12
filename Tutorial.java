import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends Actor
{
    /**
     * Act - do whatever the Tutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image = getImage();
        image.scale(140, 100);
        setImage(image);
        if(isTouching(Pointer.class) && Greenfoot.mouseClicked(null))
        {
            TitleScreen world = new TitleScreen();
            world.tutorial();
        }
    }
}
