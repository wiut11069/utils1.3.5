public class StringUtils {
    public static boolean isPositiveNumber(String str) throws Exception {
        if (str.length() < 1)
            throw new EmptyInputException("Empty Input!");
        for (int i = 0; i < str.length(); i++) {
            if ((i != 0 || str.length() == 1) && str.charAt(i) == 45)
                throw new WrongInputException("Input is not numeric!");
            else if ((str.charAt(i) < 48 || str.charAt(i) > 57) && str.charAt(i) != 45)
                throw new WrongInputException("Input is not numeric!");
        }

        if (org.apache.commons.lang3.StringUtils.startsWith(str, "-")){
            return false;
        }
        return true;
    }
}
