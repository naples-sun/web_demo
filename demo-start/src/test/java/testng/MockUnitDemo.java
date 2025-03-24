package testng;

import org.mockito.Mockito;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
// mock单元测试demo
public class MockUnitDemo{
    @Test
    public void test0() {
        //1、创建mock对象（模拟依赖的对象）
        final List mock = Mockito.mock(List.class);

        //2、使用mock对象（mock对象会对接口或类的方法给出默认实现）
        List a = new ArrayList<>();
        System.out.println(a.add("1"));
        System.out.println(a);
        System.out.println("mock.add result => " + mock.add("first"));  //false
        System.out.println("mock.size result => " + mock.size());       //0

        //3、打桩操作（状态测试：设置该对象指定方法被调用时的返回值）
        Mockito.when(mock.get(0)).thenReturn("second");
        Mockito.doReturn(66).when(mock).size();

        //3、使用mock对象的stub（测试打桩结果）
        System.out.println("mock.get result => " + mock.get(0));    //second
        System.out.println("mock.size result => " + mock.size());   //66

        //4、验证get()方法和size()方法确实调用了，get输入整数，size调用了两次
        Mockito.verify(mock).get(Mockito.anyInt());
        Mockito.verify(mock, Mockito.times(2)).size();

        //5、验证返回的结果（这是JUnit的功能）
        assertEquals("second", mock.get(0));
        assertEquals(66, mock.size());
    }
}

