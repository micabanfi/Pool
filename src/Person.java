import java.util.ArrayList;

public class Person {
    private String name;
    private String surname;
    private String carrer;
    private String phone;
    private boolean smoke;
    private boolean food;
    private Rating rating;
    private ArrayList<Vehicle> vehicles;

    public Person(String name, String surname, String carrer, String phone,boolean smoke,boolean food){
        this.name=name;
        this.surname=surname;
        this.carrer=carrer;
        this.phone=phone;
        this.smoke=smoke;
        this.food=food;
        //inicializar raiting
    }
}
