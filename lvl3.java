import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl3 extends kotak
{
    /**
     * Act - do whatever the lvl3 wants to do. This method is called whenever
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
        lvl_3.skor.add(1);
        if(hp == 0){
        getWorld().removeObject(this);
        if(lvl_3.skor.getValue() == 8)
                {
                    new_world.level++;
                    String levelup = "level "+ new_world.level;
                    Greenfoot.setWorld(new coming_soon());
        }
        }
    }

}
}