package pl.kurs.java.exceptions;

public class IncorrectDistanceException extends RuntimeException {

    public IncorrectDistanceException() {
    }

    public IncorrectDistanceException(String message) {
        super(message);
    }
}
