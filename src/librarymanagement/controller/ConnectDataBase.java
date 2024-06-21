
package librarymanagement.controller;

import java.sql.*;


public class ConnectDataBase {
    public static Connection getConnection(){
        Connection con = null; 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            String url = "jdbc:mysql://localhost:3306/quanlythuvienoop";
            String user = "root";
            String password ="1234";
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Đã kết nối thành công");
	} catch (ClassNotFoundException | SQLException e) {
            System.out.println("Đã kết nối thất bại");
            e.printStackTrace();
	}
        return con;
    }
}
