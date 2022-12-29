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
        move(5);
        
        bounce();
        if (Greenfoot.mouseClicked(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int rx = mouse.getX() - getX();
            int ry = mouse.getY() - getY();
            int angle = (int) (Math.atan2(rx,ry)*180.0/Math.PI);
            setRotation(angle);
        }
    }
    public void run(){
        for (int i = 0 ; i <= 4 ; i++){
            move(5);
        if (isAtEdge()){
            setLocation(getX()+100, getY()+100);
            dx = dx;
            dy = -dy;
            }
        }
        if(isAtEdge()){
            
        }
    }
    public void bounce(){
        if (isAtEdge()){
            if(getX()<= 5 || getX()>=580){
                setLocation(getX()-1, getY());
                
            }
        }
        if(isAtEdge()){
            
            if(getY() <=5 || getY()>= 855){
                
                
            }
        }
        if(getY() >= 800){
            dx = 0;
            dy = 0;
        }
    }
}
