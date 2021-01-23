import java.util.ArrayList;

public class Golfer implements Subject {
    
    private ArrayList<Observer> observers;
    private String name;

    public Golfer(String aName)
    {
         name = aName;
         observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer)
    {

    }

    public void removeObserver(Observer observer)
    {

    }

    public void notifyObservers(int strokes, int par)
    {

    }

    public void enterScore(int strokes, int par)
    {

    }

    public String getName()
    {

    }
}
