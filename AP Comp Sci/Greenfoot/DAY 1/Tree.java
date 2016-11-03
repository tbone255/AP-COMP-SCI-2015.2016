import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends Actor implements Ageable
{
    private int age;
    private static final String  IMAGE = "tree2.png";
    private final double HRATIO = 1.5;
    private static final int STOP = 100;
    public Tree()
    {
        age = 1;
    }
    
    
    public void age()
    {
        if(age >= STOP  )
        {
            
        }
        else
        {
            age++;
            setImage(IMAGE);
            GreenfootImage img = getImage();
            img.scale(age, (int)(HRATIO * age));
        }
    }
}
