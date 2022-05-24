import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JunitTest {
    @Test
    public void testIsNumberPositive() throws Exception {
        assertFalse(StringUtils.isPositiveNumber("-1"));
        assertTrue(StringUtils.isPositiveNumber("12"));
    }

    //Checks for non-numeric or wrong input cases
    @Test
    public void testWrongInputException(){
        WrongInputException exception1 = assertThrows(WrongInputException.class, () -> {
            StringUtils.isPositiveNumber("1-");
        });
        WrongInputException exception2 = assertThrows(WrongInputException.class, () -> {
            StringUtils.isPositiveNumber("asd");
        });
        String expectedMessage = "Input is not numeric!";
        String actualMessage1 = exception1.getMessage();
        String actualMessage2 = exception2.getMessage();
        assertTrue(actualMessage1.contains(expectedMessage));
        assertTrue(actualMessage2.contains(expectedMessage));
    }

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
}
