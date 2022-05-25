public class StringUtils {
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

    //Checks for blank input
    public static void isBlank(String str) throws EmptyInputException {
        if (str.length() < 1) {
            throw new EmptyInputException("Empty Input!");
        }
    }

    //Checks if input is positive
    public static boolean isPositive(String str) throws Exception {
        boolean positive = !org.apache.commons.lang3.StringUtils.startsWith(str, "-");
        if (!positive) {
            if (str.length() < 2 || str.charAt(1) == 46) {
                throw new WrongInputException("Input is not numeric!");
            }
        }
        return positive;
    }

    //Checks for non-numeric characters, safe for non-integer numerics
    public static void containsCharacters(String str, Integer index) throws Exception {
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
