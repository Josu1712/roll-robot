import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class loading here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class loading extends World
{
    int i = 0;
    /**
     * Constructor for objects of class loading.
     * 
     */
    public loading()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 900, 1);
         addObject(new loading_frame(),getWidth()/2,getHeight()/2);
    }
     public void act(){
        if(new_world.skor.getValue() == 8)
                {
                    i++;
                    if (i >= 250){
                        Greenfoot.setWorld(new lvl_2());
                        i = 0;
                }
                    if(lvl_2.skor.getValue() == 8)
                    {
                    i++;
                    if (i >= 250){
                        Greenfoot.setWorld(new lvl_3());
                        i = 0;
                    }
                }
            }
    }
}
