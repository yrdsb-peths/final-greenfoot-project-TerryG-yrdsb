import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletHoming here.
 * 
 * @author (Terry G) 
 * @version (1/17/2022)
 */
public class BulletHoming extends Actor
{
    /**
     * Act - do whatever the BulletHoming wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
        int PlayerX = player.getX();
        int PlayerY = player.getY();
        turnTowards(PlayerX,PlayerY);
        move(1);
        if(isTouching(Wall.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
        }
    }
}
