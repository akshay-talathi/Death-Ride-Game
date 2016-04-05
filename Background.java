import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background  extends Actor
{
    private Actor collided;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private int collidedOn;
    public Background()
    {
       collidedOn = 0;
       image1 = new GreenfootImage("house-04.png");
       image2 = new GreenfootImage("tulip.png");
       image3 = new GreenfootImage("castle.png");
       image4 = new GreenfootImage("tent.png");
       image5 = new GreenfootImage("mushroom.png");
       image6 = new GreenfootImage("shamrock.png");
       randomImage();
    }
     /**
     * Act - do whatever the House4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveDown();
        check();
    }
    public void moveDown()
    {
          setLocation(getX(), getY() + 3);
    }
    public void randomImage()
    {
       if (Greenfoot.getRandomNumber(6)<1)
       {
          setImage(image1);
       }
       else if (Greenfoot.getRandomNumber(6)<1)
       {
          setImage(image2);
       }
       else if (Greenfoot.getRandomNumber(6)<1)
       {
          setImage(image3);
       }
       else if (Greenfoot.getRandomNumber(6)<1)
       {
          setImage(image4);
       }
       else if (Greenfoot.getRandomNumber(6)<1)
       {
          setImage(image5);
       }
       else
       {
          setImage(image6);
       }
    }
     public void check()
    {
        if (getY()>=(getWorld().getHeight()-1))
        {
           getWorld().removeObject(this);
        }
    }
}
