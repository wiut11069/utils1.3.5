/**
 *
 */
public class WrongInputException extends Exception{
    /**
     * @param errorMessage //
     */
    //Purpose of this Exception is to differentiate the thrown exceptions
    public WrongInputException(String errorMessage) {
        super(errorMessage);
    }
}
