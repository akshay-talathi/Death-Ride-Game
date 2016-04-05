import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControlsInfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlsInfo extends Actor
{
    /**
     * Act - do whatever the ControlsInfo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(null)) {
          getWorld().removeObject(this);
       }
    }    
}
