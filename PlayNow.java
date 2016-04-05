import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayNow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayNow extends Actor
{
    private boolean play = false;
      
    public PlayNow(){ 
        setPlayImage();  
    }
      
    /** 
     * Act - do whatever the PlayButton wants to do. This method is called whenever 
     * the 'Act' or 'Run' button gets pressed in the environment. 
     */  
    public void act() {  
        if (Greenfoot.mouseClicked(this)) {  
            /*play = true;  
            setPlayImage();  
            System.out.println("Play Now -> " +play);*/
            Greenfoot.setWorld(new Level1());  
            Greenfoot.start();
        }  
    }      
    
    public boolean playGame() {
        return play;  
    }  
      
    private void setPlayImage() {  
        GreenfootImage image = new GreenfootImage("playnow.jpg");  
        setImage(image);  
    }  
}
