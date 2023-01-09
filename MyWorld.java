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
    Label healthbar;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,500, 1);
        Player player = new Player();
        addObject(player,getWidth()/8,getHeight()/2);
        healthbar  = new Label("hp:10",50);
        addObject(healthbar, 60, 25);
    }
    
    public void gameOver()
    {
        List object = getObjects(null);
        removeObjects(object);
        Label gameOver = new Label("You Died", 100);
        addObject(gameOver, getWidth()/2, getHeight()/2);
    }
    
    public void setHealth(int hp)
    {
        healthbar.setValue("hp:"+hp);
    }
}
