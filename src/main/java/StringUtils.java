public class StringUtils {
    public static boolean isPositiveNumber(String str) throws Exception {
        if (str.length() < 1) //checks for blank input
            throw new EmptyInputException("Empty Input!");
        for (int i = 0; i < str.length(); i++) {
            if ((i != 0 || str.length() == 1) && str.charAt(i) == 45) // checks for "-" sign in the middle and at the end
                throw new WrongInputException("Input is not numeric!");
            else if ((str.charAt(i) < 48 || str.charAt(i) > 57) && str.charAt(i) != 45) // checks if char is a number
                throw new WrongInputException("Input is not numeric!");
        }
        if (org.apache.commons.lang3.StringUtils.startsWith(str, "-")){
            return false;
        }
        return true;
    }
}
