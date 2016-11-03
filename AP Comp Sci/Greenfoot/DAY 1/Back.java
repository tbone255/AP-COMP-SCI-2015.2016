import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends World
{

    /**
     * Constructor for objects of class Back.
     * 
     */
    public Back()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Ayy ayy = new Ayy();
        addObject(ayy, 198, 230);
        Ayy2 ayy2 = new Ayy2();
        addObject(ayy2, 206, 327);
        Ayy ayy3 = new Ayy();
        addObject(ayy3, 456, 181);
        Ayy2 ayy22 = new Ayy2();
        addObject(ayy22, 473, 283);
        removeObject(ayy22);
        removeObject(ayy2);
        removeObject(ayy);
        removeObject(ayy3);
        Ant ant = new Ant();
        addObject(ant, 429, 174);
        Ant ant2 = new Ant();
        addObject(ant2, 532, 183);
        ant2.setLocation(732, 574);
        ant2.setLocation(728, 574);
        ant.setLocation(626, 572);
        Ant ant3 = new Ant();
        addObject(ant3, 534, 580);
        Ant ant4 = new Ant();
        addObject(ant4, 425, 578);
        Ant ant5 = new Ant();
        addObject(ant5, 332, 582);
        Ant ant6 = new Ant();
        addObject(ant6, 235, 585);
        Ant ant7 = new Ant();
        addObject(ant7, 134, 580);
        Ant ant8 = new Ant();
        addObject(ant8, 38, 579);
        Ant ant9 = new Ant();
        addObject(ant9, 76, 537);
        Ant ant10 = new Ant();
        addObject(ant10, 182, 527);
        Ant ant11 = new Ant();
        addObject(ant11, 285, 531);
        Ant ant12 = new Ant();
        addObject(ant12, 386, 528);
        Ant ant13 = new Ant();
        addObject(ant13, 477, 528);
        Ant ant14 = new Ant();
        addObject(ant14, 595, 525);
        Ant ant15 = new Ant();
        addObject(ant15, 694, 521);
        Ant ant16 = new Ant();
        addObject(ant16, 795, 535);
        Ant ant17 = new Ant();
        addObject(ant17, 737, 480);
        Ant ant18 = new Ant();
        addObject(ant18, 628, 482);
        Ant ant19 = new Ant();
        addObject(ant19, 529, 488);
        Ant ant20 = new Ant();
        addObject(ant20, 433, 485);
        Ant ant21 = new Ant();
        addObject(ant21, 334, 487);
        Ant ant22 = new Ant();
        addObject(ant22, 224, 487);
        Ant ant23 = new Ant();
        addObject(ant23, 134, 480);
        Ant ant24 = new Ant();
        addObject(ant24, 32, 475);
        ant19.setLocation(525, 477);
        ant18.setLocation(628, 478);
        ant14.setLocation(575, 525);
        ant15.setLocation(673, 524);
        ant16.setLocation(778, 525);
        ant6.setLocation(227, 578);
        ant5.setLocation(323, 577);
        ant9.setLocation(76, 535);
        ant9.setLocation(76, 526);
        Person person = new Person();
        addObject(person, 73, 75);
        Person person2 = new Person();
        addObject(person2, 222, 83);
        Person person3 = new Person();
        addObject(person3, 386, 88);
        Person person4 = new Person();
        addObject(person4, 553, 91);
        Person person5 = new Person();
        addObject(person5, 727, 91);
        Person person6 = new Person();
        addObject(person6, 173, 239);
        Person person7 = new Person();
        addObject(person7, 354, 243);
        Person person8 = new Person();
        addObject(person8, 535, 250);
        Person person9 = new Person();
        addObject(person9, 689, 252);
        Person person10 = new Person();
        addObject(person10, 69, 382);
        Person person11 = new Person();
        addObject(person11, 272, 397);
        Person person12 = new Person();
        addObject(person12, 471, 398);
        Person person13 = new Person();
        addObject(person13, 615, 399);
        person13.setLocation(616, 389);
        person12.setLocation(470, 389);
        person11.setLocation(279, 377);
        person10.setLocation(72, 381);
        person6.setLocation(172, 225);
        person10.setLocation(69, 366);
        person.setLocation(73, 71);
        person2.setLocation(215, 71);
        person3.setLocation(357, 70);
        person4.setLocation(498, 69);
        person5.setLocation(639, 69);
        person9.setLocation(725, 211);
        person8.setLocation(580, 212);
        person7.setLocation(437, 212);
        person6.setLocation(293, 213);
        person11.setLocation(150, 215);
        person10.setLocation(72, 357);
        person12.setLocation(214, 357);
        person13.setLocation(357, 355);
        Tree tree = new Tree();
        addObject(tree, 481, 377);
        Tree tree2 = new Tree();
        addObject(tree2, 582, 379);
        Tree tree3 = new Tree();
        addObject(tree3, 686, 377);
        Tree tree4 = new Tree();
        addObject(tree4, 781, 380);
        Tree tree5 = new Tree();
        addObject(tree5, 532, 332);
        Tree tree6 = new Tree();
        addObject(tree6, 651, 336);
        Tree tree7 = new Tree();
        addObject(tree7, 736, 335);
        tree5.setLocation(523, 325);
        tree.setLocation(475, 373);
        tree2.setLocation(574, 376);
        tree6.setLocation(626, 328);
        tree3.setLocation(678, 376);
        tree7.setLocation(726, 325);
        tree4.setLocation(781, 376);
        removeObject(person13);
        removeObject(person12);
        removeObject(person10);
        removeObject(person11);
        removeObject(person6);
        removeObject(person7);
        removeObject(person8);
        removeObject(person9);
        tree5.setLocation(76, 271);
        tree.setLocation(175, 273);
        tree2.setLocation(279, 272);
        tree6.setLocation(370, 272);
        tree3.setLocation(475, 278);
        tree7.setLocation(567, 277);
        tree4.setLocation(671, 273);
        Tree tree8 = new Tree();
        addObject(tree8, 782, 281);
        tree2.setLocation(275, 272);
        tree6.setLocation(376, 273);
        tree3.setLocation(474, 275);
        tree7.setLocation(573, 273);
        tree8.setLocation(777, 275);
    }
    
    public void act()
    {
        List ageable = getObjects(Ageable.class);
        for(Object o: ageable)
        {
            ((Ageable)o).age();
        }
    }
    
    public void spinAll()
    {
        List obj = getObjects(TurnAroundable.class);     
        
        for (Object o: obj)
        {
            ((TurnAroundable)o).turnAroundable();
        }
    }
}
