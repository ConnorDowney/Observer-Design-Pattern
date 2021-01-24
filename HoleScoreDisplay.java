/**
 * A display of the current hole of golf
 * @author Connor Downey
 */
public class HoleScoreDisplay implements Observer{
    
    private Subject golfer;
    private int strokes;
    private int par;

    /**
     * Creates a new display for the hole
     * @param golfer Subject named golfer
     */
    public HoleScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        this.strokes = 0;
        this.par = 0;
        golfer.registerObserver(this);
    }

    /**
     * Updates the strokes and par of the round
     * @param strokes Number of strokes on this hole
     * @param par Par on this hole
     */
    public void update(int strokes, int par)
    {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
        
    }

    /**
     * Displays the strokes, par total, and difference of those two on this hole
     */
    private void displayCurrentScore()
    {
        System.out.println();
        System.out.println("Current hole stats:\nPar: "
        +par+"\nStrokes: "+strokes);
        int result = strokes-par;
        if(result<0)
        {
            result*=-1;
            System.out.println(result+" under par");
        }
        else if(result>0)
        {
            System.out.println(result+" over par");
        }
        else
        {
            System.out.println("Made par");
        }
        System.out.println();
    }
}
