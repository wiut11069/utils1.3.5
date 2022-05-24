public class EmptyInputException extends Exception{
    //Purpose of this Exception is to differentiate the thrown exceptions
    public EmptyInputException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
