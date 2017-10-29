package root;

public class InvalidCredentials extends Exception {
    private static final String MESSAGE = "Usuario o contraseña incorrecto.";

    public InvalidCredentials(){
        super(MESSAGE);
    }
}
