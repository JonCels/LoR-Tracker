package exceptions;

public class InvalidCardNumberException extends RuntimeException{
    public InvalidCardNumberException(){
        super();
    }
    
    public InvalidCardNumberException(String errorMessage){
        super(errorMessage);
    }
}