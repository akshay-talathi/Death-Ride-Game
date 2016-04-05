import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuWorld extends World 
{
    /**
     * Constructor for objects of class MenuWorld.
     * 
     */
    public MenuWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    public void act()  
    {

    } 

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        ImageProxyInterface controlproxyimage = new ControlProxyImage("help.jpg");
        PlayNow playnow = new PlayNow();
        addObject(playnow, 276, 51);
        playnow.setLocation(281, 59);
        controlproxyimage.display();
        addObject(controlproxyimage, 282, 542);
        playnow.setLocation(496, 568);
        controlproxyimage.setLocation(109, 506);
        playnow.setLocation(496, 568);
        playnow.setLocation(496, 568);
        playnow.setLocation(496, 568);
        playnow.setLocation(496, 568);
        playnow.setLocation(496, 568);
        playnow.setLocation(496, 568);
        playnow.setLocation(496, 568);
        playnow.setLocation(496, 568);
        playnow.setLocation(496, 568);
        playnow.setLocation(494, 550);
        controlproxyimage.setLocation(118, 560);
        controlproxyimage.setLocation(108, 560);
        playnow.setLocation(481, 562);
    }
}
