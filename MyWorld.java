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
    int health;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,500, 1);
        Player player = new Player(10);
        addObject(player,getWidth()/8,getHeight()/2);
        EnemyShort enemyShort = new EnemyShort(0);
        addObject(enemyShort,getWidth()/8 * 6,getHeight()/2);
        Door door = new Door();
        addObject(door, getWidth()/8 * 7,getHeight()/2);

        healthbar  = new Label("hp:"+ health,50);
        addObject(healthbar, 60, 25);
        prepare();
    }

    public void gameOver()
    {
        clearAll();
        Label gameOver = new Label("You Died", 100);
        addObject(gameOver, getWidth()/2, getHeight()/2);
    }

    public void setHealth(int hp)
    {
        health = hp;
        healthbar.setValue("hp:"+hp);
    }

    public void setLevel(int level)
    {
        clearAll();
        healthbar  = new Label("hp:" + health,50);
        addObject(healthbar, 60, 25);
        //set enemy positions
        if(level == 1)
        {
            
        }
    }
    
    public void clearAll()
    {
        List object = getObjects(null);
        removeObjects(object);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

    }
}
