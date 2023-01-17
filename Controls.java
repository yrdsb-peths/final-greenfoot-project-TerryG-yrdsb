import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controls here.
 * 
 * @author (Terry G) 
 * @version (1/17/2022)
 */
public class Controls extends World
{

    /**
     * Constructor for objects of class Controls.
     * 
     */
    public Controls()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
        Pointer pointer = new Pointer();
        addObject(pointer,0,0);
        Return button = new Return();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("use arrow keys to move", 75);
        addObject(label,355,97);
        label.setLocation(getWidth()/2,68);
        Label label2 = new Label("press space to shoot", 75);
        addObject(label2,392,148);
        label2.setLocation(getWidth()/2,136);
        Label label3 = new Label("press space when on a", 75);
        addObject(label3,380,255);
        label3.setLocation(getWidth()/2,233);
        Label label4 = new Label("portal to go to the next level", 75);
        addObject(label4,419,301);
        label4.setLocation(getWidth()/2,289);
        Return button = new Return();
        addObject(button,380,397);
    }
}
