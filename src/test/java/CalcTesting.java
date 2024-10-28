import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalcTesting {



        private final Calc calculator = new Calc();

        @Test
        void testDivideByZeroThrowsException() {

            int a = 10;
            int b = 0;


            ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
                calculator.divide(a, b);
            });
            assertEquals("Cannot divide by zero", exception.getMessage());
        }

        @Test
        void testDivideSuccess() {

            int a = 10;
            int b = 2;


            int result = calculator.divide(a, b);


            assertEquals(5, result);
        }

        @Test
        void testDivideNegativeNumbers() {

            int a = -10;
            int b = 2;

            int result = calculator.divide(a, b);

            assertEquals(-5, result);
        }

        @Test
        void testDividePositiveAndNegativeNumbers() {

            int a = 10;
            int b = -2;


            int result = calculator.divide(a, b);

            // Assert
            assertEquals(-5, result);
        }
    }



