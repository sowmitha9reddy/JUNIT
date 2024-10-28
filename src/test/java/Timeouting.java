import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
@Timeout(value = 1, unit = TimeUnit.SECONDS) // Applies to all test methods in this class
public class Timeouting {

        @Test
        void testMethodOne() throws InterruptedException {
            Thread.sleep(500); // This test will pass
        }

        @Test
        void testMethodTwo() throws InterruptedException {
            Thread.sleep(1500); // This test will fail
        }
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS) // Test fails if it takes longer than 1 second
    void testWithTimeout() throws InterruptedException {
        // Simulating a long-running task
        Thread.sleep(500); // Sleep for 500 milliseconds
        assertEquals(2, 1 + 1);
    }

    @Test
    @Timeout(500) // Test fails if it takes longer than 500 milliseconds (default to TimeUnit.MILLISECONDS)
    void testWithDefaultTimeout() throws InterruptedException {
        // Simulating a longer task
        Thread.sleep(600); // Sleep for 600 milliseconds
        assertEquals(2, 1 + 1); // This assertion will not be reached due to the timeout
    }


}
