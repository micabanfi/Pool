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
import java.util.Date;


public class State {
    private ArrayList<User> users;
    private ArrayList<Ride> currentRides;
    private ArrayList<Ride> expiredRides;

    public State() {
        this.users = new ArrayList<>();
        this.currentRides = new ArrayList<>();
        this.expiredRides = new ArrayList<>();
    }

    public User login(Credential cred) throws InvalidCredentials{
        return authorize(cred);
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

    public ArrayList<Ride> getCurrentRides() { return currentRides; }

    public ArrayList<Ride> getExpiredRides() { return expiredRides; }

    public User register(User user) throws InvalidFields{
        if (AddtoList(user))
            return user;
        throw new InvalidFields("Invalid User");
    }

   // Metodo de Prueba
   private <T> boolean AddtoList(T ent){
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


   public Ride saveNewRide(Ride ride) throws InvalidFields{
       if (AddtoList(ride))
           return ride;
       throw new InvalidFields("Invalid Ride");
   }
// tenemos que settear una/entender la timezone para/de todo el proyecto
   public void refreshRides(){
       boolean aux = true;
       Date currentDate = new Date();
       for (int i = 0; aux ; i++) {
           Ride ride = currentRides.get(i);
           if (ride.getDate().before(currentDate)){
               currentRides.remove(i);
               expiredRides.add(ride);
           }
           else{
               aux = false;
           }
       }
   }

    public Ride modifyRide(Ride ride) throws InvalidFields{
        for(int i = 0; i < users.size(); i++){
            Ride aux = currentRides.get(i);
            if (aux.equals(ride)){
                currentRides.remove(i);
                currentRides.add(ride);
                return ride;
            }
        }
        throw new InvalidFields("No Ride With The Same Characteristics.");

    }

    

}
