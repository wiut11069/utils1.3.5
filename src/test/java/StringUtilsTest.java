import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
public class StringUtilsTest {

    /**
     * @throws Exception //
     */
    @Test
    public void testIsNumberPositive() throws Exception {
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPositiveNumber("1"));
    }

    /**
     * @throws Exception //
     */
    @Test
    public void testIsNumberNegative() throws Exception {
        StringUtils utils = new StringUtils();
        assertFalse(utils.isPositiveNumber("-1"));
    }

    /**
     *
     */
    //Checks for non-numeric or wrong input cases
    @Test
    public void testWrongInputException(){
        StringUtils utils = new StringUtils();
        WrongInputException exception = assertThrows(WrongInputException.class, () -> {
            utils.isPositiveNumber("-.");
        });
        String expectedMessage = "Input is not numeric!";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     *
     */
    //Checks for letter input cases
    @Test
    public void testLetterInputException(){
        StringUtils utils = new StringUtils();
        WrongInputException exception = assertThrows(WrongInputException.class, () -> {
            utils.isPositiveNumber("asd");
        });
        String expectedMessage = "Input is not numeric!";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     *
     */
    //Checks for null input cases
    @Test
    public void testNullPointerException(){
        StringUtils utils = new StringUtils();
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            utils.isPositiveNumber(null);
        });
        String expectedMessage = "Cannot invoke \"String.length()\" because \"str\" is null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     *
     */
    //Checks for Empty input cases
    @Test
    public void testEmptyInputException(){
        StringUtils utils = new StringUtils();
         EmptyInputException exception = assertThrows(EmptyInputException.class, () -> {
            utils.isPositiveNumber("");
        });
        String expectedMessage = "Empty Input!";
        String actualMessage = exception.getMessage();
        System.out.println(actualMessage);
        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * @throws Exception //
     */
    //Checks for double inputs
    @Test
    public void testIsDoublePositive() throws Exception {
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPositiveNumber("1.20"));
    }

    /**
     *
     */
    //Checks for wrong double inputs
    @Test
    public void testWrongDoubleInput(){
        StringUtils utils = new StringUtils();
        WrongInputException exception = assertThrows(WrongInputException.class, () -> {
            utils.isPositiveNumber("1.2.0");
        });
        String expectedMessage = "Input is not numeric!";
        String actualMessage = exception.getMessage();
        System.out.println(actualMessage);
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
