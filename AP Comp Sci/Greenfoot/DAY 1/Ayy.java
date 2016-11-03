import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayy extends Actor implements TurnAroundable
{
    private double velocity;
    private final double ACCERLERATION = 1.0;
    private final double FRICTION = .9;

    /**
     * Act - do whatever the Ayy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            velocity += ACCERLERATION;
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            velocity += -ACCERLERATION;
        }
        
        move( ( int )( velocity + .5) );
        velocity *= FRICTION;
        
        if(this.isTouching(Ayy2.class))
        {
            getWorld().removeObject(this);
            System.out.println("Blue died");
        }
    }    
    
    public void turnAround()
    {
        turn(180);
    }
    
    public void turnAroundable()
    {
        
    }
}
