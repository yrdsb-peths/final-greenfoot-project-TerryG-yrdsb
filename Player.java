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
    GreenfootSound PEW = new GreenfootSound("pew-sound.mp3");
    SimpleTimer bulletCooldown = new SimpleTimer();
    SimpleTimer animationTimer = new SimpleTimer();
    int health;
    String facing = "right";
    
    public Player(int hp)
    {
        for(int i = 0; i < walkAnimation.length; i++)
        {
            walkAnimation[i] = new GreenfootImage("images/gunman/gunman" + i +".png");
            walkAnimation[i].scale(80, 80);
        }

        animationTimer.mark();
        //Initial image
        setImage(walkAnimation[0]);
        health = hp;
    }
    
    //This will animate the player but only when walking
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
        shoot();
        isHit();
        block();
        heal();
        animatePlayer();
        
        if(health == 0)
        {
            MyWorld world = (MyWorld)getWorld();
            world.gameOver();
        }
    }
    
    //This will allow the player to shoot a bullet when pressing space.
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
                PEW.play();
                world.addObject(bullet,getX()-20,getY()-35);
                bullet.setRotation(270);
            }
            if(facing.equals("down"))
            {
                PEW.play();
                world.addObject(bullet,getX()+20,getY()+35);
                bullet.setRotation(90);
            }
            if(facing.equals("left"))
            {
                PEW.play();
                world.addObject(bullet,getX()-35,getY()+20);
                bullet.setRotation(180);
            }
            if(facing.equals("right"))
            {
                PEW.play();
                world.addObject(bullet,getX()+35,getY()-20);
                bullet.setRotation(0);
            }
        }
    }
    
    /**
    This will subtract 1 from the players health when hit by a enemy or bullet
    as well as subtracting it from the healthbar label
    */
    public void isHit()
    {
        MyWorld world = (MyWorld) getWorld();
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
        if(isTouching(BulletBoss.class))
        {
            health = health - 1;
            removeTouching(BulletBoss.class);
        }
        if(isTouching(BulletHoming.class))
        {
            health = health - 1;
            removeTouching(BulletHoming.class);
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
        if(isTouching(Boss.class))
        {
            health = health - 1;
            setLocation(world.getWidth()/2,world.getHeight()/2);
        }
        
        world.setHealth(health);
    }
    
    //This will block the player from walking thround walls and sandbags
    public void block()
    {
        if(isTouching(Wall.class))
        {
            move(-5);
        }
        if(isTouching(WallBreakable.class))
        {
            move(-5);
        }
        if(isTouching(Sandbag.class))
        {
            move(-5);
        }
    }
    
    //This will heal the player by 10 when pressing space on a health kit
    public void heal()
    {
        if(isTouching(Heal.class) && Greenfoot.isKeyDown("space"))
        {
            health += 10; 
            removeTouching(Heal.class);
        }
    }
}