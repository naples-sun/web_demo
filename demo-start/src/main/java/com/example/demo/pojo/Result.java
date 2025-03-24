package com.example.demo.pojo;

public class Result {
    private Integer code;
    private String message;
    private Object data;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public Result(){}
    public Result(Integer code, String message, Object data){
        this.code=code;this.message=message;this.data=data;
    }
    //成功的响应，不需要前端返回数据
    public static Result success(){
        return new Result(200,"success",null);
    }
    //成功响应(把查询结果做为返回数据响应给前端)
    public static Result success(Object data){
        return new Result(200,"success",data);
    }
    //失败响应
    public static Result error(Object data){
        return new Result(0,"error",null);
    }

//    @Override
//    public String toString(){
//        return data.toString();
//    }
}
