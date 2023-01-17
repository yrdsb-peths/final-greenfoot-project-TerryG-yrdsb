import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (Terry G) 
 * @version (1/17/2022)
 */
public class PlayButton extends Actor
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image = getImage();
        image.scale(225, 150);
        setImage(image);
        if(isTouching(Pointer.class))
        {
            image.scale(250,175);
            setImage(image);
        }
        if(isTouching(Pointer.class) && Greenfoot.mouseClicked(null))
        {
            TitleScreen world = new TitleScreen();
            world.play();
        }
    }
}
