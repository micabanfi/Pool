package root.User;

import java.util.ArrayList;

public class Person {
    private String name;
    private String surname;
    private String phone;
    private Rating rating;
    private Preferences preferences;
    private ArrayList<Vehicle> vehicles;

    public Person(String name, String surname, String career, String phone,boolean smoke,boolean food){
        this.name=name;
        this.surname=surname;
        this.phone=phone;
        this.preferences = new Preferences(career, smoke, food);
        //inicializar raiting
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }
}
