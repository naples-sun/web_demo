package testng;
import org.testng.annotations.Test;

public class DiffClazzTest {
    @Test(dataProvider = "create", dataProviderClass = StaticProvider.class)
    public void test(Integer n) {
        System.out.println(n);
    }
}