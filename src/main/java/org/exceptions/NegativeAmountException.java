package org.exceptions;

public class NegativeAmountException extends RuntimeException{
    public NegativeAmountException (String message){
        super(message);
    }
}
