package root.Client;

import root.InvalidCredentials;
import root.InvalidFields;
import root.User.Credential;
import root.User.Person;
import root.State.State;
import root.User.User;

public class Client {
    private State state;
    private User user;

    public Client(State state){
        this.state = state;
    }

    public void login() {
        Credential cred;

        //ALGO...

        try {
            this.user = state.login(cred);
        }catch(InvalidCredentials e){
            //Error al iniciar sesion.
        }
    }

    public void register(){
        Credential cred;
        Person person;
        User user;

        //ALGO...

        try {
            this.user = state.register(user, cred);
        }catch (InvalidFields e){
            //Error al registrar
        }
    }

    public void currentTrips(){}

    public void poolHistory(){}

    public void myProfile(){}

    public void home(){}

    public void ratePool(){}

    public void sendRequest(){}

    public void acceptRequest(){}

    public void newTrip(){}

}
