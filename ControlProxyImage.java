import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControlsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlProxyImage extends ImageProxyInterface
{
    private boolean controls = false;
    private ControlRealImage realImage;
    private String imageName;
      
    /*public ControlProxyImage(){ 
        display();  
    }*/
    
    public ControlProxyImage(String imageName){
      this.imageName = imageName;
      //display();
   }
      
    /** 
     * Act - do whatever the PlayButton wants to do. This method is called whenever 
     * the 'Act' or 'Run' button gets pressed in the environment. 
     */  
    public void act() {  
        if (Greenfoot.mouseClicked(this)) {  
            controls = true;
            getWorld().addObject(new ControlsInfo(), getWorld().getWidth()/2, getWorld().getHeight()/2);
        }
    }     
    
    public boolean isControls() {  
        return controls;  
    }  
    
    @Override
   public void display() {
      realImage = new ControlRealImage(this, imageName);
      realImage.display();
   }
   
   public void showImage() {
      GreenfootImage image = new GreenfootImage(imageName);  
      setImage(image);
   }
}
