package com.example.demo.pojo;

//@RestController
//public class RequestController {
//    @RequestMapping("/simpleParameter")
//    public String simpleParameter(@RequestParam(name = "name",required = false) String username, Integer age){ //当请求参数与定义的的形参名称不一致时
//        System.out.println(username+" "+ age);
//        return "ok";
//    }
//}
public class User{
    public String name;
    private Integer age;
    private Address address;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge(){
        return age;
    }

    public Address getAddress(){
        return  address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

