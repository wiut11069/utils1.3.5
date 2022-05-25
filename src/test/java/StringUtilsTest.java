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
        assertTrue(StringUtils.isPositiveNumber("1"));
    }

    /**
     * @throws Exception //
     */
    @Test
    public void testIsNumberNegative() throws Exception {
        assertFalse(StringUtils.isPositiveNumber("-1"));
    }

    /**
     *
     */
    //Checks for non-numeric or wrong input cases
    @Test
    public void testWrongInputException(){
        WrongInputException exception = assertThrows(WrongInputException.class, () -> {
            StringUtils.isPositiveNumber("-.");
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
        WrongInputException exception = assertThrows(WrongInputException.class, () -> {
            StringUtils.isPositiveNumber("asd");
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
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            StringUtils.isPositiveNumber(null);
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
         EmptyInputException exception = assertThrows(EmptyInputException.class, () -> {
            StringUtils.isPositiveNumber("");
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
        assertTrue(StringUtils.isPositiveNumber("1.20"));
    }

    /**
     * 
     */
    //Checks for wrong double inputs
    @Test
    public void testWrongDoubleInput(){
        WrongInputException exception = assertThrows(WrongInputException.class, () -> {
            StringUtils.isPositiveNumber("1.2.0");
        });
        String expectedMessage = "Input is not numeric!";
        String actualMessage = exception.getMessage();
        System.out.println(actualMessage);
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
