import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ant extends Actor implements Ageable
{
    private int age;
    private static final int DEATH_AGE = 50;
    
    public Ant()
    {
        age = 0;
    }
   
    public void age()
    {
       age++;
       if(age == DEATH_AGE)
       {
            getWorld().removeObject(this);
       }
    }
}
