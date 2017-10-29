package root.State;

import root.InvalidCredentials;
import root.InvalidFields;
import root.User.Credential;
import root.Ride.Ride;
import root.User.User;

import java.util.ArrayList;

public class State {
    private ArrayList<User> users;
    private ArrayList<Ride> currentRides;
    //private ArrayList<root.Ride.Ride> expiredRides;

    public User login(Credential cred) throws InvalidCredentials{
        return autorize(cred);
    }

    public User register(User user) throws InvalidFields{

    }

    public User autorize(Credential cred) throws InvalidCredentials{
        User user;
        //Busca al usuario que coincida con la credencial

        return user;
    }


}
