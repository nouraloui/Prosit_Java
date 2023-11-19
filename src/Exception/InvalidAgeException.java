package tn.esprit.gestionzoo.Exception;

public class InvalidAgeException extends Throwable {

    public InvalidAgeException() {
        super("Age cannot be a negative");
    }
}
