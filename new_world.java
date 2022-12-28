import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class new_world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class new_world extends World
{
    static int level = 0;
    /**
     * Constructor for objects of class new_world.
     * 
     */
    public new_world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(584, 900, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        generate_kotak1();
        rbt_1 rbt_1 = new rbt_1();
        addObject(rbt_1,283,797);
    }
    
    
     void generate_kotak1()
    {
        if(level==0){
        for(int i = 0; i < 3; i++)
        {
            kotak kotak = new kotak();
            addObject(kotak,Greenfoot.getRandomNumber(400), 70);
            kotak.avoidOverlap();
        }     
    }   
    }
    
}




