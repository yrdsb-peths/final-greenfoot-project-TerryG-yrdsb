import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Return here.
 * 
 * @author (Terry G) 
 * @version (1/17/2022)
 */
public class Return extends Actor
{
    /**
     * Act - do whatever the Return wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image = getImage();
        image.scale(140, 100);
        setImage(image);
        if(isTouching(Pointer.class))
        {
            image.scale(175,130);
            setImage(image);
        }
        if(isTouching(Pointer.class) && Greenfoot.mouseClicked(null))
        {
            TitleScreen title = new TitleScreen();
            Greenfoot.setWorld(title);
        }
    }
}
