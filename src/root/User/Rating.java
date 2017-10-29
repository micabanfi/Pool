package root.User;

public class Rating {
    private int positive;
    private int negative;

    public Rating(){
        this.positive=0;
        this.negative=0;
    }

    public void modifyRating(boolean isGood){
        if(isGood)
            positive++;
        else
            negative++;
    }

    public double calculatePercentage(){
        return positive/(positive+negative)*100;
    }

}
