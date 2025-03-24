package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DPTest {
//    @DataProvider(name = "test1")
//    public Object[][] createData1() {
//        return new Object[][] {
//                { "Cedric", 36},
//                { "Anne", 37},
//        };
//    }
//
//    @Test(dataProvider = "test1")
//    public void verifyData1(String n1, Integer n2) {
//        System.out.println(n1 + " " + n2);
//    }

    @DataProvider(name = "dp")
    public Object[][] createData(Method m) {
        System.out.println(m.getName());  // print test method name
        return new Object[][] { new Object[] { "Cedric" }};
    }

    @Test(dataProvider = "dp")
    public void test1(String s) {
//        System.out.println(s);
    }

    @Test(dataProvider = "dp")
    public void test2(String s) {
//        System.out.println(s);
    }
}
