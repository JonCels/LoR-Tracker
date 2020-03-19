package exceptions;

public class TooManyDuplicatesException extends RuntimeException{
    public TooManyDuplicatesException(){
        super();
    }
    
    public TooManyDuplicatesException(String errorMessage){
        super(errorMessage);
    }
}