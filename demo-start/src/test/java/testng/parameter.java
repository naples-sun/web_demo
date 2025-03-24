package testng;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter{
@Parameters({ "first-name" })
@Test
public void parameter(String firstName) {
    System.out.println("Invoked testString " + firstName);
    assert "Cedric".equals(firstName);
}
}