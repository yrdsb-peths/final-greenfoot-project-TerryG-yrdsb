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
    Label bossBar;
    int health;
    int bossHealth;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,500, 1);
        Player player = new Player(15);
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
    
    public void setBossHealth(int hp)
    {
        bossHealth = hp;
        bossBar.setValue("boss hp:"+hp);
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
    
    int level = 0;
    public void setLevel()
    {
       level += 1;
       clearAll();
       healthbar  = new Label("hp:" + health,50);
       bossBar = new Label("boss hp:"+ bossHealth,50);
       //creates the levels
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
           Door door = new Door();
            addObject(door,708,389);
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
            Player player = new Player(health);
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
       if(level == 8)
       {
            Sandbag sandbag = new Sandbag();
            addObject(sandbag,186,462);
            Sandbag sandbag2 = new Sandbag();
            addObject(sandbag2,186,356);
            Sandbag sandbag3 = new Sandbag();
            addObject(sandbag3,185,250);
            Sandbag sandbag4 = new Sandbag();
            addObject(sandbag4,184,146);
            Sandbag sandbag5 = new Sandbag();
            addObject(sandbag5,350,29);
            Sandbag sandbag6 = new Sandbag();
            addObject(sandbag6,352,124);
            Sandbag sandbag7 = new Sandbag();
            addObject(sandbag7,352,234);
            Sandbag sandbag8 = new Sandbag();
            addObject(sandbag8,353,346);
            Sandbag sandbag9 = new Sandbag();
            addObject(sandbag9,496,460);
            Sandbag sandbag10 = new Sandbag();
            addObject(sandbag10,495,344);
            Sandbag sandbag11 = new Sandbag();
            addObject(sandbag11,494,223);
            Sandbag sandbag12 = new Sandbag();
            addObject(sandbag12,641,32);
            sandbag11.setLocation(545,209);
            sandbag10.setLocation(542,331);
            sandbag9.setLocation(550,437);
            sandbag12.setLocation(677,23);
            Sandbag sandbag13 = new Sandbag();
            addObject(sandbag13,678,116);
            Sandbag sandbag14 = new Sandbag();
            addObject(sandbag14,681,229);
            Sandbag sandbag15 = new Sandbag();
            addObject(sandbag15,687,356);
            Door door = new Door();
            addObject(door,754,51);
            Player player = new Player(health);
            addObject(player,79,156);
            BulletHoming bulletHoming = new BulletHoming();
            addObject(bulletHoming,29,472);
            BulletHoming bulletHoming2 = new BulletHoming();
            addObject(bulletHoming2,73,468);
            BulletHoming bulletHoming3 = new BulletHoming();
            addObject(bulletHoming3,130,472);
            BulletHoming bulletHoming4 = new BulletHoming();
            addObject(bulletHoming4,49,438);
            BulletHoming bulletHoming5 = new BulletHoming();
            addObject(bulletHoming5,107,436);
       }
       if(level == 9)
       {
            Sandbag sandbag = new Sandbag();
            addObject(sandbag,209,214);
            Sandbag sandbag2 = new Sandbag();
            addObject(sandbag2,208,295);
            Wall wall = new Wall();
            addObject(wall,186,370);
            Wall wall2 = new Wall();
            addObject(wall2,184,136);
            Player player = new Player(health);
            addObject(player,73,257);
            EnemyRocket enemyRocket = new EnemyRocket();
            addObject(enemyRocket,760,47);
            EnemyRocket enemyRocket2 = new EnemyRocket();
            addObject(enemyRocket2,760,450);
            EnemyLong enemyLong = new EnemyLong(0);
            addObject(enemyLong,761,158);
            EnemyLong enemyLong2 = new EnemyLong(0);
            addObject(enemyLong2,764,343);
            EnemyLong enemyLong3 = new EnemyLong(315);
            addObject(enemyLong3,600,30);
            EnemyLong enemyLong4 = new EnemyLong(45);
            addObject(enemyLong4,600,460);
            WallBreakable wallBreakable = new WallBreakable();
            addObject(wallBreakable,500,26);
            WallBreakable wallBreakable2 = new WallBreakable();
            addObject(wallBreakable2,500,468);
            Sandbag sandbag3 = new Sandbag();
            addObject(sandbag3,442,147);
            Sandbag sandbag4 = new Sandbag();
            addObject(sandbag4,442,363);
            EnemyShort enemyShort = new EnemyShort(0);
            addObject(enemyShort,474,362);
            EnemyShort enemyShort2 = new EnemyShort(0);
            addObject(enemyShort2,472,146);
            EnemyShort enemyShort3 = new EnemyShort(0);
            addObject(enemyShort3,372,252);
            Wall wall3 = new Wall();
            addObject(wall3,562,247);
            EnemyShort enemyShort6 = new EnemyShort(315);
            addObject(enemyShort6,614,287);
            EnemyShort enemyShort7 = new EnemyShort(45);
            addObject(enemyShort7,614,216);
            Door door = new Door();
            addObject(door,745,241);
       }
       if(level == 10)
       {
            Door door = new Door();
            addObject(door,716,253);
            Heal heal = new Heal();
            addObject(heal,401,129);
            Player player = new Player(health);
            addObject(player,82,285);
       }
       if(level == 11)
       {
            Boss boss = new Boss();
            addObject(boss,60,60);
            Player player = new Player(health);
            addObject(player,400,259);
            Wall wall = new Wall();
            addObject(wall,220,160);
            Wall wall2 = new Wall();
            addObject(wall2,590,160);
            Wall wall3 = new Wall();
            addObject(wall3,220,370);
            Wall wall4 = new Wall();
            addObject(wall4,590,370);
            addObject(bossBar, 700, 25);
       }
       addObject(healthbar, 60, 25);
       if(level == 12)
       {
            clearAll();
            Label win = new Label("YOU WIN", 100);
            addObject(win, getWidth()/2, getHeight()/2);
       }
    }
}
