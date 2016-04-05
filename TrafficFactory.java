import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrafficFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrafficFactory extends Actor
{
    /**
     * Act - do whatever the TrafficFactory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {  
          
    }   
    
    public static Traffic createTraffic(String trafficObject)
    {            
        if(trafficObject.equalsIgnoreCase(Traffic.TrafficObjects.Truck.toString())) {
             return new Truck();
        } else if(trafficObject.equalsIgnoreCase(Traffic.TrafficObjects.OtherCar.toString())) {
             return new OtherCar();
        } else {
             return new Coin();
        }
    }  
}
