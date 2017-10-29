package root.User;

import java.util.ArrayList;
import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private String phone;
    private Rating rating;
    private String gender;
    private Date birthDate;
    private Preferences preferences;
    private ArrayList<Vehicle> vehicles;

    public Person(String name, String surname, String career, String phone,boolean smoke,boolean food,String gender,Date birthDate){
        this.name=name;
        this.surname=surname;
        this.phone=phone;
        this.preferences = new Preferences(career, smoke, food);
        this.gender=gender;
        this.birthDate=birthDate;
        //inicializar raiting
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }
}
