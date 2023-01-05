import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kotak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kotak extends Actor
{
    int hp=1, inithp=1;
    int point = 1;
    Counter nyawa = new Counter();
    
    
    /**
     * Act - do whatever the kotak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){

    }
    
    public void avoidOverlap(){
        while(isTouching(kotak.class) ||  getX() < 30){
        setLocation(Greenfoot.getRandomNumber(400), 90);
        }
    }
    
    public void maju(){
        setLocation(getX(), getY() + 20);
    }
}
