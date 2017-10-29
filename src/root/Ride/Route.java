package root.Ride;

public class Route {
    private String from;
    private String to;
    private String through;

    public Route(String from,String to,String through){
        this.from=from;
        this.to=to;
        this.through=through;
    }

    @Override
    public String toString(){
        return "From:"+from+" To:"+to+" Through:"+through;
    }

}
