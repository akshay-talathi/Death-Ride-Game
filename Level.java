import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Actor implements ObserverInterface
{
    static int level = 1;
    
    public void act() 
    {
        setImage(new GreenfootImage("Level: "+level, 24, Color.RED, Color.WHITE));
    }    
    
    public Level() {
        setImage(new GreenfootImage("Level: "+level, 24, Color.RED, Color.WHITE));
    }
    
    public void updateLevel() {
        level++;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void resetLevel() {
        level = 1;
    }
    
    public void updateScore() {

    }
    
    public int getScore() {
        return 0;
    }
    
    public void resetScore() {

    }
}
