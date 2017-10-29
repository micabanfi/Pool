import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class Tester{

    public static void main(String[] args){
        //creo vehiculo.
        //hay que chequar patente?
        Vehicle vehicle1=new Vehicle("Fiat","500","Blanco",2015,"ABC123",4,false,true);

        //creo persona
        Person person1=new Person("Micaela","Banfi","Informatica","1234567890",false,true);

        //creo la credential
        Credential credential1=new Credential("mica","1234");

        //le agrego vehicle1 a person1
        //person1.addVehicle(vehicle1);

        //creo el user
        User user1=new User(credential1,person1);
    }

}
