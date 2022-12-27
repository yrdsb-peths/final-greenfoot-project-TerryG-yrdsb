import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600,500, 1);
        Player player = new Player();
        addObject(player,getWidth()/8,getHeight()/2);
    }
    
    public void gameOver()
    {
        List object = getObjects(null);
        removeObjects(object);
        Label gameOver = new Label("You Died", 100);
        addObject(gameOver, 300, 250);
    }
}
