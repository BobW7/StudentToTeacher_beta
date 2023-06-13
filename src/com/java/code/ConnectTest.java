package com.java.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectTest {
    public static void main(String[] args) {

        Connection conn = null;
        try {
            // 加载MySQL JDBC驱动程序
            Class.forName("com.mysql.jdbc.Driver");

            // 获取数据库连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/homeworkmanager?useSSL=false&useUnicode=true&characterEncoding=Utf-8",
                    "root", "1234");

            // 检查连接是否成功
            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.out.println("MySQL Connection Failed!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

    }
}
}
