package root.Ride;

import root.User.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Ride {
    private Route route;
    private Vehicle vehicle;
    private Person driver;
    private ArrayList<Person> passengers;
    private int availableSeats;
    private HashMap<Person, Integer> ratings;
    private Permissions permissions;
    private Date date;

    public Ride(Route route, Vehicle vehicle, Person driver, ArrayList<Person> passengers, Permissions permissions,Date date){
        this.route=route;
        this.vehicle=vehicle;
        this.driver=driver;
        this.passengers=passengers;
        this.availableSeats=vehicle.getSeats();
        this.permissions = permissions;
        this.date=date;
    }

    public Route getRoute(){
        return route;
    }

    public Person getDriver(){
        return driver;
    }

    public ArrayList<Person> getPassengers(){
        return passengers;
    }

    public int getAvailableSeats(){
        return availableSeats;
    }

    public void incrementAvailableSeats(){
        availableSeats++;
    }

    public void decrementAvailableSeats(){
        availableSeats--;
    }

    public Permissions getPermissions(){
        return permissions;
    }

    public HashMap<Person, Integer> getRatings(){
        return ratings;
    }
}
