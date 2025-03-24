package testng;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class demo {

    @Test(testName = "testszh")
    public void testHello() {
        String greeting = "Hello, World!";
        assertEquals("Hello, World!", greeting);
        System.out.println();
    }
}


