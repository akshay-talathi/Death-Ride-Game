import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeathRideWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Levels
{
    int lineCount = 0;
    /**
     * Constructor for objects of class DeathRideWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(590, 600, 1); 
        setPaintOrder(Car.class, Traffic.class, Background.class);
        prepare();
    }

    public void act() {
        background();
        displayDivider();
    }

    public void background()
    {
        if(Greenfoot.getRandomNumber(50)<1)
        {
            addObject(new Background(), Greenfoot.getRandomNumber(110), 0);
        }
        if(Greenfoot.getRandomNumber(50)<1)
        {
            addObject(new Background(), Greenfoot.getRandomNumber(110)+520, 0);
        }
    }
    
    public void displayDivider()
    {
       lineCount++;
       if (lineCount == 25)
       {
         addObject(new Line(),300,0);
         lineCount = 0;
       }
    }
    
    private void prepare() {
        Car car = new Car();
        addObject(car, 327, 369);
        car.setLocation(334, 537);

        addObject(new Line(),300,0);
        addObject(new Line(),300,90);
        addObject(new Line(),300,180);
        addObject(new Line(),300,270);
        addObject(new Line(),300,360);
        addObject(new Line(),300,450);
        addObject(new Line(),300,540);

        addObject(new Background(), Greenfoot.getRandomNumber(150), Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150), Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150), Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150), Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150), Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150)+440, Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150)+440, Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150)+440, Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150)+440, Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150)+440, Greenfoot.getRandomNumber(600));

        Score score = new Score();
        addObject(score, 193, 24);
        score.setLocation(201, 20);
        
        Level level = new Level();
        addObject(level, 193, 24);
        level.setLocation(401, 20);
    }
}
