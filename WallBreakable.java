import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyTank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallBreakable extends Actor
{
    /**
     * Act - do whatever the EnemyTank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 10;
    public void act()
    {
        if(isTouching(Bullet.class))
        {
            health = health - 1;
            removeTouching(Bullet.class);
        }
        if(health == 6)
        {
            setImage("images/WallBreakable/Break2.png");
        }
        if(health == 3)
        {
            setImage("images/WallBreakable/Break3.png");
        }
        if(health == 0)
        {
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
        }
    }
}
