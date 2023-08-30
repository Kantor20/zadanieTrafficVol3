package pl.kurs.java.exceptions;

public class IllegalCurrentHourException extends RuntimeException {
    public IllegalCurrentHourException (){

    }

    public IllegalCurrentHourException(String message) {
        super(message);
    }
}
