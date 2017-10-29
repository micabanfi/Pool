package root.User;

public class Credential {
    private String password;
    private String userName;

    public Credential(String userName,String password){
        this.password=password;
        this.userName=userName;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (!(obj instanceof Credential))
            return false;
        Credential aux = (Credential) obj;

        return this.userName.equals(aux.userName) && this.password.equals(aux.password);
    }
}
