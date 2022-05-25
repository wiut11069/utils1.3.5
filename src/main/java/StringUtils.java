/**
 *
 */
public class StringUtils {
    /**
     * @param str //input of method
     * @return boolean
     * @throws Exception //throws WrongInputException or EmptyInputException
     */
    public static boolean isPositiveNumber(String str) throws Exception {
        isBlank(str);
        boolean positive = isPositive(str);
        int index = 0;
        if (!positive){
            index++;
        }
        containsCharacters(str, index);
        return positive;
    }

    /**
     * @param str //input
     * @throws EmptyInputException //for blank input
     */
    //Checks for blank input
    public static void isBlank(String str) throws EmptyInputException {
        if (str.length() < 1) {
            throw new EmptyInputException("Empty Input!");
        }
    }

    /**
     * @param str //input of method
     * @return void
     * @throws WrongInputException //
     */
    //Checks if input is positive
    public static boolean isPositive(String str) throws WrongInputException {
        boolean positive = !org.apache.commons.lang3.StringUtils.startsWith(str, "-");
        if (!positive) {
            if (str.length() < 2 || str.charAt(1) == 46) {
                throw new WrongInputException("Input is not numeric!");
            }
        }
        return positive;
    }

    /**
     * @param str //input of method
     * @param index //starting point for loop
     * @throws WrongInputException //
     */
    //Checks for non-numeric characters, safe for non-integer numerics
    public static void containsCharacters(String str, Integer index) throws WrongInputException {
        int countPoints = 0;
        for (int i = index; i < str.length(); i++) {
            if ((str.charAt(i) < 48 || str.charAt(i) > 57) && str.charAt(i) != 46) {
                throw new WrongInputException("Input is not numeric!");
            }
            if (str.charAt(i) == 46)
                countPoints++;
        }
        if (countPoints > 1)
            throw new WrongInputException("Input is not numeric!");
    }
}
