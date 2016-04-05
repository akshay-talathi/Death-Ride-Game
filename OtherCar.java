import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OtherCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OtherCar extends Traffic
{
    /**
     * Act - do whatever the OtherCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World world;
    public void act() 
    {  
            setLocation(getX(),getY() + 7);
            world = getWorld();
            if (isAtEdge()) {
                world.removeObject(this);
            }
    }   
    
    
}
