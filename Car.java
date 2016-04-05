import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor implements Subject
{
    int count=0;
    private List<ObserverInterface> observers = null;
    Score score = new Score();
    Level level = new Level();
    Actor coin = null;
    static boolean isLevel2 = false;
    
    int count1=0;
    int count2=0;
    int count3=0;
    int x=1;
    CarSmoke dem1=new CarSmoke(1);
    CarSmoke dem2=new CarSmoke(2);
    CarSmoke dem3=new CarSmoke(3);
    Imagerepository fire=new Fire();
    Imagerepository fire1=new Fire();
    Imagerepository fire2=new Fire();
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        moveWorld();
    }  
    
    public void moveWorld() {
        if(!isLevel2) {
            createTrafficObjectsLevel1();
        }
        
        if(isLevel2) {
            createTrafficObjectsLevel2();
        }
        coin = getOneObjectAtOffset(0, 0, Coin.class);
        observers = new ArrayList<ObserverInterface>();
        
        if(isTouching(OtherCar.class) || isTouching(Truck.class)) {
            Greenfoot.playSound("laugh4.wav");
            Greenfoot.setWorld(new GameOver());
            Greenfoot.stop();
        }

        if (coin != null) {
           attach(new Score());
           attach(new Level());
           notifyObserver();
       } else {
           checkKeyAndMove();
        }   
    }
    
    public void attach(ObserverInterface score) {
        observers.add(score);
    }
    
    public void notifyObserver() {
        if(observers != null) {
            ObserverInterface scoreObv = observers.get(0);
            ObserverInterface levelObv = observers.get(1);

            Greenfoot.playSound("coin.wav");
            scoreObv.updateScore();
            score.score = scoreObv.getScore();
            getWorld().addObject(score, 201, 20);
            getWorld().removeObject(coin);
            
            level.level = levelObv.getLevel();
            getWorld().addObject(level, 401, 20);
            
            if(levelObv.getLevel() == 1 && scoreObv.getScore() == 3) {
                Greenfoot.setWorld(new Level2());
                scoreObv.resetScore();
                levelObv.updateLevel();
                isLevel2 = true;
                count = 0;
                Greenfoot.start();
            }
            
            if(levelObv.getLevel() == 2 && scoreObv.getScore() == 5) {
                Greenfoot.playSound("cheers.wav");
                Greenfoot.setWorld(new Win());
                Greenfoot.stop();
            }
        }
    }
    
    public void createTrafficObjectsLevel1() {
        if (count == 40) {
           int number =  Greenfoot.getRandomNumber(3) + 1;
           if(number == 1) {
               getWorld().addObject(TrafficFactory.createTraffic("OtherCar"), Greenfoot.getRandomNumber(180) + 200, 0);
           }
           
           if(number == 2) {
               getWorld().addObject(TrafficFactory.createTraffic("Coin"), Greenfoot.getRandomNumber(180) + 200, 0);
           }
           
           if(number == 3) {
               getWorld().addObject(TrafficFactory.createTraffic("Truck"), Greenfoot.getRandomNumber(180) + 200, 0);
           }
           count=0;
       } else {
           count++;
       }
    }
    
    public void createTrafficObjectsLevel2() {
        if (count == 25) {
           int number =  Greenfoot.getRandomNumber(3) + 1;
           if(number == 1) {
               getWorld().addObject(TrafficFactory.createTraffic("OtherCar"), Greenfoot.getRandomNumber(180) + 200, 0);
           }
           
           if(number == 2) {
               getWorld().addObject(TrafficFactory.createTraffic("Coin"), Greenfoot.getRandomNumber(180) + 200, 0);
           }
           
           if(number == 3) {
               getWorld().addObject(TrafficFactory.createTraffic("Truck"), Greenfoot.getRandomNumber(180) + 200, 0);
           }
           count=0;
       } else {
           count++;
       }
    }
    
    public void checkKeyAndMove() {
        if (getX()>=170 && getX()<=430 ) {
            if (Greenfoot.isKeyDown("left")) {
                move(-3); 
                
                getWorld().removeObjects(getWorld().getObjects(Fire.class));
            }
            
            if (Greenfoot.isKeyDown("right")) {
                move(3); 
                
                getWorld().removeObjects(getWorld().getObjects(Fire.class));
            }
            
            if (Greenfoot.isKeyDown("up")) {
                setLocation(getX(),getY() - 2); 
                
                getWorld().removeObjects(getWorld().getObjects(Fire.class));
            }
            
            if (Greenfoot.isKeyDown("down")) {
                setLocation(getX(),getY() + 4); 
                
                getWorld().removeObjects(getWorld().getObjects(Fire.class));
            }
        } else if (getX()<170){
            if (Greenfoot.isKeyDown("right")) {
                move(3); 
                
                getWorld().removeObjects(getWorld().getObjects(Fire.class));
            }
               
            if (Greenfoot.isKeyDown("up")) {
                setLocation(getX(),getY() - 2); 
                
                getWorld().removeObjects(getWorld().getObjects(Fire.class));
            }
            
            if (Greenfoot.isKeyDown("down")) {
                setLocation(getX(),getY() + 4); 
                
                getWorld().removeObjects(getWorld().getObjects(Fire.class));
            }
        } else {
            if (Greenfoot.isKeyDown("left")) {
                move(-3); 
                
                getWorld().removeObjects(getWorld().getObjects(Fire.class));
            }
                
            if (Greenfoot.isKeyDown("up")) {
                setLocation(getX(),getY() - 2); 
                
                getWorld().removeObjects(getWorld().getObjects(Fire.class));
            }
            
            if (Greenfoot.isKeyDown("down")) {
                setLocation(getX(),getY() + 4); 
                
                getWorld().removeObjects(getWorld().getObjects(Fire.class));
            }
        }
        
        if(count1 == 5) {
            fire=dem1.addimages();
            getWorld().addObject(fire,getX(),getY()+50);
            count1=0;
        }
        
        if(count2 == 7) {
            fire1=dem2.addimages();
            getWorld().addObject(fire1,getX(),getY()+50);
            count2=0;
        }
        
        if(count3 == 10) {
            fire2=dem3.addimages();
            getWorld().addObject(fire2,getX(),getY()+50);
            count3=0;
        }
        
        count1++;
        count2++;
        count3++;
    }
    
    public void nextLevel() {
    }
    
    public void isCrash() {
    }
    
    public void win() {
    }
}
