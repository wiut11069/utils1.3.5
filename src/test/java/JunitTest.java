import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JunitTest {
    @Test
    public void testIsNumberPositive() throws Exception {
        assertFalse(StringUtils.isPositiveNumber("-1"));
        assertTrue(StringUtils.isPositiveNumber("12"));
    }

    @Test
    public void testWrongInputException(){
        WrongInputException exception = assertThrows(WrongInputException.class, () -> {
            StringUtils.isPositiveNumber("1-");
        });
        String expectedMessage = "Input is not numeric!";
        String actualMessage = exception.getMessage();
        System.out.println(actualMessage);
        assertTrue(actualMessage.contains(expectedMessage));
    }

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
