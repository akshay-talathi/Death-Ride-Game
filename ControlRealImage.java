import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControlRealImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlRealImage extends ImageProxyInterface
{
    /**
     * Act - do whatever the ControlRealImage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
        
   private String imageName;
   private ControlProxyImage image;
   
   public ControlRealImage(ControlProxyImage image, String imageName){
      this.imageName = imageName;
      this.image = image;
   }

   @Override
   public void display() {
      image.showImage();
   }
    
    
    
}
