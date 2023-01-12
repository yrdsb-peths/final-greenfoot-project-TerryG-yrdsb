import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        Pointer pointer = new Pointer();
        addObject(pointer,0,0);
        PlayButton play = new PlayButton();
        addObject(play,getWidth()/2,getHeight()/2);
        prepare();
    }

    public void play()
    {
        MyWorld game = new MyWorld();
        Greenfoot.setWorld(game);
    }
    
    public void tutorial()
    {
        Controls tutorial = new Controls();
        Greenfoot.setWorld(tutorial);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("shooter game maybe", 100);
        addObject(label,400,50);
        Label label2 = new Label("press play to start", 60);
        addObject(label2,400,125);
        Tutorial tutorial = new Tutorial();
        addObject(tutorial,400,400);
    }
}
