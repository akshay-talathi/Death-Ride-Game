import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IteratorPatterndemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarSmoke extends Actor
{
    int i=0;
    GreenfootImage image = null;
    public  CarSmoke(int setImagevalue)
    {
        
        i=setImagevalue;
    }
    World world=getWorld();
    public void act() 
    {  
    }    
     public Imagerepository addimages()
     {
         Fire fire1 = null;
         Fire fire2 = null;
         Fire fire3 = null;
         
         Fireimages names = new Fireimages();

      for(Iter iter = names.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         
         
          if(name.equalsIgnoreCase(String.valueOf(i))&& i==3)
         {
             
             fire3 = new Fire();
             image = new GreenfootImage("fire3.png");  
             fire3.setImage(image);
             return fire3;
            }
          if(name.equalsIgnoreCase(String.valueOf(i))&& i==2)
            {
             
             fire2 = new Fire();
             image = new GreenfootImage("fire2.png");  
             fire2.setImage(image);
             return fire2; 
            }
         
         if(name.equalsIgnoreCase(String.valueOf(i))&& i==1)
         {
             
             fire1 = new Fire();
             image = new GreenfootImage("fire1.png");  
             fire1.setImage(image);
             return fire1;
            }
             
            
      }
      
      image = new GreenfootImage("fire1.png");  
      fire1.setImage(image);
      return fire1;
    }
}