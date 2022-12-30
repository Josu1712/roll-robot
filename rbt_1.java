import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rbt_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rbt_1 extends SmoothMover
{
    /**
     * Act - do whatever the rbt_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dx = 5;
    int dy = 5;
    int x = 0;
    public void act()
    {
        // Add your action
        move(20);
        launch();
        bounce_kotak();
        bounce();
    }
    public void run(){
        if (isAtEdge()){
            turn(45);
        }
    }
    public void bounce(){
        if (isAtEdge()){
            turn(-89);
        }
        if(new_world.hp.getValue() == 0){
        Greenfoot.stop();
        }
        if (getY() >= 800){
            gun gun = new gun();
            getWorld().addObject(gun, getX(), getY());
            laser laser = new laser();
            getWorld().addObject(laser,getX(),getY());
            getWorld().removeObject(this);
            new_world.hp.add(-1);
        if(Greenfoot.mouseClicked(null)){
                getWorld().removeObject(laser);
            }
        
        }
    }
    public void bounce_kotak(){
        if(isTouching(kotak.class)){
           turn(-90);
           for( int i = 0 ; i<= 3;i++){
               getWorld().addObject(this, 59, 5);
           }
        }
    }
    public void rest(){
        if(getY() >= 800){
            move(0);
        }
    }
    public void launch(){
        if (Greenfoot.mouseClicked(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int rx = mouse.getX() - getX();
            int ry = mouse.getY() - getY();
            int angle = (int) (Math.atan2(rx,ry)*180.0/Math.PI);
            setRotation(angle);
        }        
    }

}
