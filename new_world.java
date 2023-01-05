import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class new_world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class new_world extends World
{
    static int level = 1;
    static score skor = new score("Skor : ");
    static score hp = new score("Hp: ");
    static GreenfootSound bg = new GreenfootSound("lv2.mp3");
    /**
     * Constructor for objects of class new_world.
     * 
     */
    public void started(){
        bg.playLoop();
    }
    public new_world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 900, 1); 
        prepare();
       
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        generate_kotak1();
        gun gun = new gun();
        addObject(gun,274,762);
        addObject(skor,292,20);
        addObject(hp, 300, 850);
        skor.setValue(0);
        hp.setValue(5);
        started();
    }

    public static int main(int num_1, int num_2) {
    Random random = new Random();
    int min = num_1;
    int max = num_2;
    int randomNumber = random.nextInt((max - min) + 1) + min;
    return randomNumber;
    }
    void generate_rbt_1(){
        for (int i = 0;i<=5;i++){
            rbt_1 rbt = new rbt_1();
            addObject(rbt, 20,20);
        }
    }
     void generate_kotak1()
    {
        if(level==1){
        for(int i = 0; i < 8; i++)
        {
            lvl1 kotak = new lvl1();
            kotak.hp = main(1, 10);
            addObject(kotak,Greenfoot.getRandomNumber(550), main(90,600));
            kotak.avoidOverlap();
        }
    }   
    }
}



