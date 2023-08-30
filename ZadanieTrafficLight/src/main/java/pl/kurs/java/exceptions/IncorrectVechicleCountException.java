package pl.kurs.java.exceptions;

public class IncorrectVechicleCountException extends RuntimeException {
    public IncorrectVechicleCountException(){

    }

    public IncorrectVechicleCountException(String message){
        super(message);
    }
}

