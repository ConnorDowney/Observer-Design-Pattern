import java.util.ArrayList;

/**
 * A Golfer
 * @author Connor Downey
 */
public class Golfer implements Subject {
    
    private ArrayList<Observer> observers;
    private String name;

    /**
     * Creates a new Golfer with the given name
     * @param name The name of the golfer
     */
    public Golfer(String name)
    {
         this.name = name;
         observers = new ArrayList<Observer>();
    }

    /**
     * Adds a new observer to the arraylist
     * @param observer The observer that needs to be added
     */
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    /**
     * Removes an observer from the arraylist
     * @param observer The observer that needs to be removed
     */
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    /**
     * Calls the update method from Observer which updates the hole and round scores
     * @param strokes The number of strokes on this hole
     * @param par The par of this hole
     */
    public void notifyObservers(int strokes, int par)
    {
        for(Observer observer : observers)
        {
            observer.update(strokes, par);
        }
    }

    /**
     * Calls the notifyObservers method with the strokes and par given
     * @param strokes The strokes on this hole
     * @param par The par of this hole
     */
    public void enterScore(int strokes, int par)
    {  
        notifyObservers(strokes, par);
    }

    /**
     * Gets the name of the golfer
     * @return a String of the name of the golfer
     */
    public String getName()
    {
        return this.name;
    }
}
