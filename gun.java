import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gun extends Actor
{
    /**
     * Act - do whatever the gun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        mouse();
    }
    public void mouse(){
        if(Greenfoot.mouseClicked(null)){
            rbt_1 rbt = new rbt_1();
            getWorld().addObject(rbt, getX(), getY());
            rbt.setRotation(getRotation());
            rbt_2 rbt_2 = new rbt_2();
            getWorld().addObject(rbt_2, getX(), getY());
            rbt_2.setRotation(getRotation());
            rbt_3 rbt_3 = new rbt_3();
            getWorld().addObject(rbt_3, getX(), getY());
            rbt_3.setRotation(getRotation());
            rbt_4 rbt_4 = new rbt_4();
            getWorld().addObject(rbt_4, getX(), getY());
            rbt_4.setRotation(getRotation());
            getWorld().removeObject(this);
        }
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int rx = mouse.getX() - getX();
            int ry = mouse.getY() - getY();
            int angle = (int) (Math.atan2(ry,rx)*180/Math.PI);
            laser laser = new laser();
            getWorld().addObject(laser, getX(), getY());
            getWorld().removeObject(laser);
            setRotation(angle);
        }
    }
}
