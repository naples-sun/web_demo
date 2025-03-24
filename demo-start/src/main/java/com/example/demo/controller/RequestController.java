package com.example.demo.controller;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import java.awt.datatransfer.DataFlavor;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;

//@RestController
//public class RequestController {
//    @RequestMapping("/simpleParameter")
//    public String simpleParameter(HttpServletRequest request){  //简单参数，原始方式
//        String name = request.getParameter("name");
//            String ageStr = request.getParameter("age");
//            int age = Integer.parseInt(ageStr);
//            System.out.println(name+" "+ age);
//            return "ok";
//    }
//}

//@RestController
//public class RequestController {
//    @RequestMapping("/simpleParameter")
//    public String simpleParameter(String name, Integer age){  //SpringBoot方式
//        System.out.println(name+" "+ age);
//        return "ok";
//    }
//}

//@RestController
//public class RequestController {
//    @RequestMapping("/simpleObject")
//    public String simpleObject(User user){ //实体类参数
//        System.out.println(user);
//        return "ok";
//    }
//}

//@RestController
//public class RequestController {
//    @RequestMapping("/arrayParam")
//    public String arrayParam(String[] name){ //数组参数
//        System.out.println(Arrays.toString(name));
//        return "ok";
//    }
//}

//@RestController
//public class RequestController {
//    @RequestMapping("/listParam")
//        public String listParam(String[] name){ //集合参数
//        System.out.println(Arrays.toString(name));
//        return "ok";
//    }
//}

//@RestController
//public class RequestController {
//    //日期时间参数
//    @RequestMapping("/dateParam")
//    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
//        System.out.println(updateTime);
//        return "OK";
//    }
//}

//@RestController
//public class RequestController {
//    @RequestMapping("/jsonParam")
//    public String jsonParam(@RequestBody User user){ //json参数
//        System.out.println(user);
//        return "ok";
//    }
//}

@RestController
public class RequestController {
    @RequestMapping("/path/{id}")
    public String pathParam(@PathVariable Integer id){ //path参数
        System.out.println(id);
        return "ok";
    }
}

