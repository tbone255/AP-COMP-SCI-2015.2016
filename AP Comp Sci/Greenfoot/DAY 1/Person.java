import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor implements Ageable
{
   private int age = 0;    
   
   public void age()
   {
       age++;
       if(age > 100)
       {
           getWorld().removeObject(this);
       }
       GreenfootImage img = getImage();
       img.scale(img.getWidth() + 1, img.getHeight() + 1);
   }
}
