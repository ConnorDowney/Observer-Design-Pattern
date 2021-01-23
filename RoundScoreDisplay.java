public class RoundScoreDisplay implements Observer{
    
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    public RoundScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        this.strokesTotal = 0;
        this.parTotal = 0;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par)
    {
        strokesTotal += strokes;
        parTotal += par;
        displayRoundScore();
    }

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
