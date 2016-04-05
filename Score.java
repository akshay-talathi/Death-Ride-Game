import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor implements ObserverInterface
{
    static int score = 0;
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Score: "+score, 24, Color.RED, Color.WHITE));
    }    
    
    public Score() {
        setImage(new GreenfootImage("Score: "+score, 24, Color.RED, Color.WHITE));
    }
    
    public void updateScore() {
        score++;
    }
    
    public int getScore() {
        return score;
    }
    
    public void resetScore() {
        score = 0;
    }
    
     public void updateLevel() {

    }
    
    public int getLevel() {
        return 0;
    }
    
    public void resetLevel() {

    }
}
