package root.State;

import root.AlreadyRated;
import root.InvalidCredentials;
import root.InvalidFields;
import root.User.Credential;
import root.Ride.Ride;
import root.User.Person;
import root.User.User;

import java.util.ArrayList;
import java.util.HashMap;

public class State {
    private ArrayList<User> users;
    private ArrayList<Ride> currentRides;
    private ArrayList<root.Ride.Ride> expiredRides;

    public User login(Credential cred) throws InvalidCredentials{
        return authorize(cred);
    }

    public User register(User user) throws InvalidFields{

    }

    public User authorize(Credential cred) throws InvalidCredentials{
        User user;
        //Busca al usuario que coincida con la credencial
        for (int i = 0; i < users.size(); i++) {
            User aux = users.get(i);
            if (aux.equalCredentials(cred)) {
                return aux;
            }
        }
        throw new InvalidCredentials();
    }


    /*
    public State() {
       this.users = new ArrayList<>();
       this.currentRides = new ArrayList<>();
   }

   public boolean login(Credential credential) {
       for (int i = 0; i < users.size(); i++) {
           User aux = users.get(i);
           if (aux.equalCredentials(credential)) {
               //Habria que dejar que el usuario acceda a su informacion
               return true;
           }
       }
       return false;
   }

   public boolean register(User user) {
       if (!(users.contains(user))) {
           users.add(user);
           return true;
       }
       return false;
   }

   public ArrayList<Ride> getCurrentRides() { return currentRides; }

   // Metodo de Prueba
   public <T> boolean AddtoList(T ent){
       boolean flag = false;
       if (ent instanceof  User){
           if (!(users.contains(ent))) {
               users.add((User)ent);
               flag = true;
           }
       }
       if (ent instanceof  Ride){
           if (!(currentRides.contains(ent))) {
               currentRides.add((Ride)ent);
               flag = true;
           }
       }
       return flag;
   }
     */

    public void rateRide(Credential cred, Ride ride, Integer rating) throws InvalidCredentials, AlreadyRated{
        User user = authorize(cred);
        ArrayList<Ride> expiredRides = user.getExpiredRides();

        //Validacion de rating

        //

        if(expiredRides.contains(ride)){
            Ride aux = expiredRides.get(expiredRides.indexOf(ride));
            HashMap<Person, Integer> ratings = aux.getRatings();
            if(ratings.containsKey(user.getPerson())){
                if(ratings.get(user.getPerson()) == null)
                    ratings.put(user.getPerson(), rating);
                else
                    throw new AlreadyRated();
            }
        }
    }

    

}
