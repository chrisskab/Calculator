import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by kurtis on 2015-10-05.
 * All the tests from the example input
 */
public class TestCalculator {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        calculator.setCommand("add(1,2)");
        assertEquals("add(1,2) = 3 ", 3L, calculator.execute());
    }

    
}
