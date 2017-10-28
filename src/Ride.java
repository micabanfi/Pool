import java.util.ArrayList;

public class Ride {
    private Route route;
    private Vehicle vehicle;
    private Person driver;
    private ArrayList<Person> passengers;
    private int availableSeats;

    public Ride(Route route,Vehicle vehicle,Person driver,ArrayList<Person> passengers,int available_seats){
        this.route=route;
        this.vehicle=vehicle;
        this.driver=driver;
        this.passengers=passengers;
        this.availableSeats=vehicle.getSeats();

    }
}
