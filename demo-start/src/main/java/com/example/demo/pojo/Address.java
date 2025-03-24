package com.example.demo.pojo;

public class Address{
    public String  province;
    private String city;
    public String getProvince(){
        return province;
    }
    public String getCity(){
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
