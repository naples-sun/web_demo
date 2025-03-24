package testng;
import java.util.HashMap;
import java.util.Map;
import com.example.demo.utils.HttpClientUtil;
import org.apache.http.client.methods.HttpPost;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ApiDemo {
    @Test(testName = "testszh")
    public void testCase1(){
//        Map<String, String> params = new HashMap<>();
//        Map<String, String> headers = new HashMap<>();
//        params.put("id", id);
//        headers.put("X-Access-Token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE2ODcxNjM4MDcsInVzZXJuYW1lIjoibGlqaW5nIn0.BUeqjiBQrH0DCfciRQsWo1P1XOoIxXNuNaM27vjAmys");
        String url = "http://localhost:8080/path/12341";
        String result = HttpClientUtil.doGet(url);
        System.out.println("GET请求测试通过！");
        assertEquals("ok", result);
    }
}
