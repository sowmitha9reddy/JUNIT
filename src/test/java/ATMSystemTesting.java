import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ATMSystemTesting {


    static Stream<Integer> providePins() {
        return Stream.of(1234, 5678, 1111, 2222, 12345);
    }

    @ParameterizedTest
    @MethodSource("providePins")
    void testValidateWithMultipleValues(int pin) {
        ATM atm = new ATM();
        atm.accessInput(pin);


        if (pin == 1234) {
            assertDoesNotThrow(atm::validate);
        } else {

            InvalidInputException exception = assertThrows(InvalidInputException.class, atm::validate);
            assertEquals("Invalid Input", exception.getMessage());
        }
    }
}
