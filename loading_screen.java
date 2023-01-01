import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class loading_screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class loading_screen extends World
{
    static GreenfootSound bg = new GreenfootSound("bg0.mp3"); 
    /**
     * Constructor for objects of class loading_screen.
     * 
     */
    public void started(){
        bg.playLoop();
    }
    public void act(){
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new new_world());
            bg.stop();
        }
    }
    public loading_screen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 900, 1,false); 
        addObject(new frame(), getWidth()/2, getHeight()/2);
        addObject(new roll_robot(),getWidth()/2,getHeight()/2);
        addObject(new start(),getWidth()/2,800);
    }
}
