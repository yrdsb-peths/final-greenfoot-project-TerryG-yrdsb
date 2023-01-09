import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (Terry) 
 * @version (Dec 19/22)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] walkAnimation= new GreenfootImage[5];
    
    SimpleTimer bulletCooldown = new SimpleTimer();
    SimpleTimer animationTimer = new SimpleTimer();
    
    String facing = "right";
    
    int health = 10;
    
    public Player()
    {
        for(int i = 0; i < walkAnimation.length; i++)
        {
            walkAnimation[i] = new GreenfootImage("images/gunman/gunman" + i +".png");
            walkAnimation[i].scale(100, 100);
        }

        animationTimer.mark();
        //Initial image
        setImage(walkAnimation[0]);
    }
    
    int imageIndex = 0;
    public void animatePlayer()
    {
        if(animationTimer.millisElapsed()<125)
        {
            return;
        }
        animationTimer.mark();
        
        if(Greenfoot.isKeyDown("right"))
        {
            setImage(walkAnimation[imageIndex]);
            imageIndex = (imageIndex + 1) % walkAnimation.length;
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            setImage(walkAnimation[imageIndex]);
            imageIndex = (imageIndex + 1) % walkAnimation.length;
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            setImage(walkAnimation[imageIndex]);
            imageIndex = (imageIndex + 1) % walkAnimation.length;
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            setImage(walkAnimation[imageIndex]);
            imageIndex = (imageIndex + 1) % walkAnimation.length;
        }
        else
        {
            setImage(walkAnimation[0]);
        }
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(3);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(3);
            facing = "right";
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(3);
            facing = "up";
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(3);
            facing = "down";
        }
        if(isTouching(Wall.class))
        {
            move(-5);
        }
        shoot();
        isHit();
        animatePlayer();
        
        if(health == 0)
        {
            MyWorld world = (MyWorld)getWorld();
            world.gameOver();
        }
        
    }
    
    public void shoot()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if(bulletCooldown.millisElapsed() < 750)
            {
                return;
            }
            bulletCooldown.mark();
            
            Bullet bullet = new Bullet();
            MyWorld world = (MyWorld) getWorld();
            if(facing.equals("up"))
            {
                world.addObject(bullet,getX()-20,getY()-35);
                bullet.setRotation(270);
            }
            if(facing.equals("down"))
            {
                world.addObject(bullet,getX()+20,getY()+35);
                bullet.setRotation(90);
            }
            if(facing.equals("left"))
            {
                world.addObject(bullet,getX()-35,getY()+20);
                bullet.setRotation(180);
            }
            if(facing.equals("right"))
            {
                world.addObject(bullet,getX()+35,getY()-20);
                bullet.setRotation(0);
            }
        }
    }
    
    public void isHit()
    {
        if(isTouching(BulletShort.class))
        {
            health = health - 1;
            removeTouching(BulletShort.class);
        }
        if(isTouching(BulletLong.class))
        {
            health = health - 1;
            removeTouching(BulletLong.class);
        }
        if(isTouching(EnemyShort.class))
        {
            health = health - 1;
            move(-50);
        }
        if(isTouching(EnemyLong.class))
        {
            health = health - 1;
            move(-50);
        }
        if(isTouching(EnemyTank.class))
        {
            health = health - 1;
            move(-50);
        }
        MyWorld world = (MyWorld) getWorld();
        world.setHealth(health);
    }
}