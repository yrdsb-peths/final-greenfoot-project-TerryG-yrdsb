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
        /**
        Player player = new Player(10);
        addObject(player,getWidth()/8,getHeight()/2);
        EnemyShort enemyShort = new EnemyShort(0);
        addObject(enemyShort,getWidth()/8 * 6,getHeight()/2);
        Door door = new Door();
        addObject(door, getWidth()/8 * 7,getHeight()/2);
        **/
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
    public void setBossHealth(int hp)
    {
        health = hp;
        healthbar.setValue("boss hp:"+hp);
    }

    public void clearAll()
    {
        List object = getObjects(null);
        removeObjects(object);
    }
    
    /**
     * EVERYTHING UNDER HERE IS JUST LEVEL GENERATION.
     * IT'S MESSY AND UNIMPORTANT.
     */
    private void prepare()
    {
        
    }
    
    int level;
    public void setLevel()
    {
       level += 1;
       clearAll();
       healthbar  = new Label("hp:" + health,50);
       addObject(healthbar, 60, 25);
       //set enemy positions
       if(level == 1)
       {
            Player player = new Player(health);
            addObject(player,getWidth()/8,getHeight()/2);
            Door door = new Door();
            addObject(door, getWidth()/8 * 7,getHeight()/2);
            EnemyLong enemyLong = new EnemyLong(0);
            addObject(enemyLong,761,257);
            Sandbag sandbag = new Sandbag();
            addObject(sandbag,432,454);
            Sandbag sandbag2 = new Sandbag();
            addObject(sandbag2,424,37);
            Sandbag sandbag3 = new Sandbag();
            addObject(sandbag3,425,128);
            Sandbag sandbag4 = new Sandbag();
            addObject(sandbag4,430,366);
       }
       if(level == 2)
       {
            Player player = new Player(health);
            addObject(player,getWidth()/8,getHeight()/2);
            EnemyLong enemyLong = new EnemyLong(0);
            addObject(enemyLong,754,263);
            Sandbag sandbag = new Sandbag();
            addObject(sandbag,470,156);
            Sandbag sandbag2 = new Sandbag();
            addObject(sandbag2,472,337);
            EnemyShort enemyShort = new EnemyShort(0);
            addObject(enemyShort,514,158);
            EnemyShort enemyShort2 = new EnemyShort(0);
            addObject(enemyShort2,516,340);
            Door door = new Door();
            addObject(door,662,249);
       }
       if(level == 3)
       {
            Player player = new Player(health);
            addObject(player,getWidth()/8,getHeight()/2);
            Door door = new Door();
            addObject(door,700,249);
            Wall wall = new Wall();
            addObject(wall,625,240);
            EnemyLong enemyLong = new EnemyLong(0);
            addObject(enemyLong,679,242);
            EnemyShort enemyShort = new EnemyShort(0);
            addObject(enemyShort,442,152);
            EnemyShort enemyShort2 = new EnemyShort(0);
            addObject(enemyShort2,441,340);
            EnemyLong enemyLong2 = new EnemyLong(315);
            addObject(enemyLong2,666,25);
            EnemyLong enemyLong3 = new EnemyLong(45);
            addObject(enemyLong3,696,468);
            Sandbag sandbag = new Sandbag();
            addObject(sandbag,357,126);
            Sandbag sandbag2 = new Sandbag();
            addObject(sandbag2,350,47);
            Sandbag sandbag3 = new Sandbag();
            addObject(sandbag3,348,447);
            Sandbag sandbag4 = new Sandbag();
            addObject(sandbag4,346,367);
            sandbag2.setLocation(354,52);
       }
       if(level == 4)
       {
           Player player = new Player(health);
           addObject(player,46,460);
           Wall wall = new Wall();
           addObject(wall,200,475);
           Wall wall2 = new Wall();
           addObject(wall2,200,425);
           Wall wall3 = new Wall();
           addObject(wall3,200,375);
           Wall wall4 = new Wall();
           addObject(wall4,200,325);
           Wall wall5 = new Wall();
           addObject(wall5,200,275);
           Wall wall6 = new Wall();
           addObject(wall6,200,225);
           Wall wall7 = new Wall();
           addObject(wall7,375,25);
           Wall wall8 = new Wall();
           addObject(wall8,375,75);
           Wall wall9 = new Wall();
           addObject(wall9,375,125);
           Wall wall10 = new Wall();
           addObject(wall10,375,175);
           Wall wall11 = new Wall();
           addObject(wall11,375,225);
           Wall wall12 = new Wall();
           addObject(wall12,375,275);
           Wall wall13 = new Wall();
           addObject(wall13,550,475);
           Wall wall14 = new Wall();
           addObject(wall14,550,425);
           Wall wall15 = new Wall();
           addObject(wall15,550,375);
           Wall wall16 = new Wall();
           addObject(wall16,550,325);
           Wall wall17 = new Wall();
           addObject(wall17,550,275);
           Wall wall18 = new Wall();
           addObject(wall18,550,225);
           EnemyLong enemyLong = new EnemyLong(0);
           addObject(enemyLong,771,325);
           EnemyLong enemyLong2 = new EnemyLong(0);
           addObject(enemyLong2,767,241);
           EnemyLong enemyLong3 = new EnemyLong(0);
           addObject(enemyLong3,764,165);
       }
       if(level == 5)
       {
            Player player = new Player(health);
            addObject(player,getWidth()/8,getHeight()/2);
            Door door = new Door();
            addObject(door, getWidth()/8 * 7,getHeight()/2);
            EnemyLong enemyLong = new EnemyLong(0);
            addObject(enemyLong,761,257);
            Sandbag sandbag = new Sandbag();
            addObject(sandbag,432,454);
            Sandbag sandbag2 = new Sandbag();
            addObject(sandbag2,424,37);
            Sandbag sandbag3 = new Sandbag();
            addObject(sandbag3,425,128);
            Sandbag sandbag4 = new Sandbag();
            addObject(sandbag4,430,366);
            WallBreakable wallBreakable = new WallBreakable();
            addObject(wallBreakable,430,251);
            door.setLocation(508,132);
            EnemyShort enemyShort = new EnemyShort(315);
            addObject(enemyShort,508,132);
            EnemyShort enemyShort2 = new EnemyShort(45);
            addObject(enemyShort2,510,369);
       }
       if(level == 6)
       {
            Player player = new Player(10);
            addObject(player,35,233);
            Door door = new Door();
            addObject(door, getWidth()/8 * 7,getHeight()/2);
            Wall wall = new Wall();
            addObject(wall,285,252);
            Wall wall2 = new Wall();
            addObject(wall2,285,201);
            Wall wall3 = new Wall();
            addObject(wall3,284,291);
            EnemyRocket enemyRocket = new EnemyRocket();
            addObject(enemyRocket,755,240);
            EnemyShort enemyShort = new EnemyShort(0);
            addObject(enemyShort,680,204);
            EnemyShort enemyShort2 = new EnemyShort(0);
            addObject(enemyShort2,680,282);
       }
       if(level == 7)
       {
            Player player = new Player(health);
            addObject(player,59,251);
            Door door = new Door();
            addObject(door, getWidth()/16 * 15,getHeight()/2);
            Wall wall = new Wall();
            addObject(wall,231,127);
            Wall wall2 = new Wall();
            addObject(wall2,232,373);
            EnemyLong enemyLong = new EnemyLong(0);
            addObject(enemyLong,726,131);
            EnemyLong enemyLong2 = new EnemyLong(0);
            addObject(enemyLong2,727,371);
            EnemyRocket enemyRocket = new EnemyRocket();
            addObject(enemyRocket,721,253);
            Sandbag sandbag = new Sandbag();
            addObject(sandbag,666,249);
            EnemyShort enemyShort = new EnemyShort(0);
            addObject(enemyShort,454,198);
            EnemyShort enemyShort2 = new EnemyShort(0);
            addObject(enemyShort2,455,315);
       }
    }
}
