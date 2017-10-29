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
    private ArrayList<root.Ride.Ride> expiredRides;

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





}
