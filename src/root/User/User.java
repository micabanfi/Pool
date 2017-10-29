package root.User;

import root.Ride.Ride;

import java.util.ArrayList;

public class User {
    private Credential credential;
    private Person person;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Ride> expiredRides;
    private ArrayList<Ride> activeRides;

    public User(Credential credential, Person person){
        this.credential=credential;
        this.person=person;
    }

    public ArrayList<Ride> getActiveRides(){
        return activeRides;
    }

    public ArrayList<Ride> getExpiredRides(){
        return expiredRides;
    }

    public Person getPerson(){
        return person;
    }

    public Credential getCredential(){
        return credential;
    }



    public void addRide(Ride ride){
        activeRides.add(ride);
    }

    public void removeRide(Ride ride){
        activeRides.remove(ride);
    }

    public void sendToHistory(Ride ride){
        activeRides.remove(ride);
        expiredRides.add(ride);
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }

    public boolean equalCredentials(Credential credential){
        return credential.equals(this.credential);
    }
}
