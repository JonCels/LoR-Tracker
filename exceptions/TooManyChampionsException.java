package lor_wintracker.exceptions;

public class TooManyChampionsException extends RuntimeException{
    public TooManyChampionsException(){
        super();
    }
    
    public TooManyChampionsException(String errorMessage){
        super(errorMessage);
    }
}