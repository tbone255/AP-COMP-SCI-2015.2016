import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayy2 extends Actor implements TurnAroundable
{
    private double velocity;
    private final double ACCERLERATION = 1.0;
    private final double FRICTION = .9;
    private final int TURN = 5;
    
    /**
     * Act - do whatever the Ayy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("a"))
        {
            turn(-TURN);
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            turn(TURN);
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            velocity += ACCERLERATION;
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            velocity += -ACCERLERATION;
        }
        move( ( int )( velocity + .5) );
        velocity *= FRICTION;
        
        if(this.isTouching(Ayy.class))
        {
            getWorld().removeObject(this);
            System.out.println("Red died");
        }
    }    
    
    public void turnAround()
    {
        turn(180);
        move(5);
    }
    
    public void turnAroundable()
    {
        
    }
    
}
