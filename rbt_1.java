import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rbt_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rbt_1 extends Actor
{
    /**
     * Act - do whatever the rbt_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dy = -4;
    public void act()
    {
        // Add your action 
        setLocation(getX(),getY()+dy);
        setRotation(90);
        if(isAtEdge()){
            dy = -dy;
        }
        if(Greenfoot.mouseDragged(this)){
            Greenfoot.getMouseInfo();
        }
        if (Greenfoot.mouseDragEnded(this)){
            Greenfoot.stop();
        }
        if (Greenfoot.mouseDragged(this)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
        }
        if (Greenfoot.mouseDragEnded(this)){
            setLocation(getX(),getY()-1);
        }

    }
    public void Positioning(){     
        if(Greenfoot.mouseDragged(this)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        if (Greenfoot.mouseDragEnded(this)){
            Actor choice = getOneIntersectingObject(rbt_1.class);
            
            if (choice != null && getOneIntersectingObject(rbt_1.class) == null){ 
                setLocation(choice.getX(), choice.getY());
            }
            else
                setLocation(getX(),getY());
        }
    }
    void robotMove(int x, int y)
    {
        setLocation(x, y);
        if(getY() <= 850 )
            setLocation(getX(), 0);
        }
}
