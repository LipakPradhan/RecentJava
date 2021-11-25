package com.jdbc;
import java.sql.*;

public class Isertdatabypreparedstmnt {

	public static void main(String[] args) {
		try {
     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
     //PreparedStatement pst=con.prepareStatement("create table Lipu(id int(4),name varchar(10),addr varchar(20)");
    // System.out.println("Table create sucessfully");
     PreparedStatement pst=con.prepareStatement("insert into emp2 values(?, ?, ?)");
     pst.setInt(1, 14);
     pst.setString(2, "Lipu");
     pst.setDouble(3, 40000);
     pst.executeUpdate();
     pst.setInt(1, 15);
     pst.setString(2, "Papu");
     pst.setDouble(3, 45000);
    int i= pst.executeUpdate();
     System.out.println("Data Stored");
     pst.close();
     con.close();
		}catch(ClassNotFoundException |SQLException e) {
			System.out.println(e);
		}
	}

}
