/**
 * Write a description of class ScoreObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ObserverInterface  
{
    public void updateScore();
    public int getScore();
    public void resetScore();
    public void updateLevel();
    public int getLevel();
    public void resetLevel();
}
