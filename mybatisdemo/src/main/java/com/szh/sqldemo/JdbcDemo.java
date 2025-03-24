package com.szh.sqldemo;

import java.sql.*;

public class JdbcDemo {
    // 数据库连接参数
    private static final String URL = "jdbc:mysql://localhost:3306/demo01?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1. 加载驱动（MySQL 8.0+ 使用 com.mysql.cj.jdbc.Driver）
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. 获取数据库连接
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

            // 3. 创建 Statement 对象
            stmt = conn.createStatement();

            // 4. 执行查询
            String sql = "SELECT * FROM student";
            rs = stmt.executeQuery(sql);
//            System.out.println(rs.getMetaData());
            // 5. 处理结果集
            while (rs.next()) {//移动游标获取下一行的数据
                int id = rs.getInt("SId");
                String name = rs.getString("Sname");
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("驱动类未找到！请检查依赖配置。");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("数据库操作失败！");
            e.printStackTrace();
        } finally {
            // 6. 关闭资源（确保顺序：ResultSet → Statement → Connection）
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
