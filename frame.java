import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class frame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class frame extends Actor
{
    /**
     * Act - do whatever the frame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage [] images = new GreenfootImage[16];
    int delay = 3, num =0;
    
    public frame(){
        Anime();
    }
    public void act()
    {
        if(delay==0)delay=3;
        if(delay==1){
            setImage(images[num]);
            num++;
            if (num>=images.length)num=0;
        }
        if(delay>0)delay--;
    }
    public void Anime(){
        for (int i = 0 ; i < images.length ; i++){
            images[i] = new GreenfootImage ("skeleton-animation_"+i+".png");
        }
        setImage(images[0]);
    }
}