import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends Actor
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage [] images = new GreenfootImage[2];
    int delay = 100, num =0;
    
    public start(){
        Anime();
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new new_world());
            loading_screen.bg.stop();
        }
        if(delay==0)delay=100;
        if(delay==1){
            setImage(images[num]);
            num++;
            if (num>=images.length)num=0;
        }
        if(delay>0)delay--;
    }
    public void Anime(){
        for (int i = 0 ; i < images.length ; i++){
            images[i] = new GreenfootImage ("start_"+i+".png");
        }
        setImage(images[0]);
    }
}
