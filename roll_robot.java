import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roll_robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roll_robot extends Actor
{
    /**
     * Act - do whatever the roll_robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage [] images = new GreenfootImage[8];
    int delay = 20, num =0;
    
    public roll_robot(){
        Anime();
    }
    public void act()
    {
        if(delay==0)delay=20;
        if(delay==1){
            setImage(images[num]);
            num++;
            if (num>=images.length)num=0;
        }
        if(delay>0)delay--;
    }
    public void Anime(){
        for (int i = 0 ; i < images.length ; i++){
            images[i] = new GreenfootImage ("rb_"+i+".png");
        }
        setImage(images[0]);
    }
}