/**
 * A display of the current round of golf
 * @author Connor Downey
 */
public class RoundScoreDisplay implements Observer{
    
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    /**
     * Creates a new display for the round
     * @param golfer Subject named golfer
     */
    public RoundScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        this.strokesTotal = 0;
        this.parTotal = 0;
        golfer.registerObserver(this);
    }

    /**
     * Updates the total strokes and total par of the round
     * @param strokes Number of strokes on this hole
     * @param par Par on this hole
     */
    public void update(int strokes, int par)
    {
        strokesTotal += strokes;
        parTotal += par;
        displayRoundScore();
    }

    /**
     * Displays the current round stroke total, par total, and difference of those two
     */
    private void displayRoundScore()
    {
        System.out.println("Round stats:\nPar: "
        +parTotal+"\nStrokes: "+strokesTotal);
        int result = strokesTotal-parTotal;
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
    }
}
