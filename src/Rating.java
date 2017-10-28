public class Rating {
    private int positive;
    private int negative;

    public Rating(){
        this.positive=0;
        this.negative=0;
    }

    public void modifyRating(boolean rate){
        if(rate)
            positive++;
        else
            negative++;
    }

    public double calculatePercentage(){
        return positive/(positive+negative)*100;
    }

}
