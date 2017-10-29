import java.util.ArrayList;

public class User {
    private Credential credential;
    private Person person;
    private ArrayList<Ride> ridesHistory;
    private ArrayList<Ride> ridesToDo;

    public User(Credential credential,Person person){
        this.credential=credential;
        this.person=person;
    }

    public void addRide(Ride ride){
        ridesToDo.add(ride);
    }

    public void moveRide(Ride ride){
        ridesHistory.add(ride);
    }
}
