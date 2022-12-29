import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl2 extends kotak
{
    /**
     * Act - do whatever the lvl2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        this.nyawa.setValue(hp);
        getWorld().addObject(this.nyawa, getX(), getY());
        aboutKotak();
    }
    public void aboutKotak(){
        if(isTouching(rbt_1.class)){
        hp--;
        new_world.skor.add(1);
        if(hp == 0){
        getWorld().removeObject(this);
        if(new_world.skor.getValue() >= (new_world.level+1)*55)
                {
                    new_world.level++;
                    String levelup = "level "+ new_world.level;
        }
        }
    }
}
}
