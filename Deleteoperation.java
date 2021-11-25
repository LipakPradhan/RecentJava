package com.jdbc;
import java.sql.*;
import java.util.*;

public class Deleteoperation {

	public static void main(String[] args) {
		try {
     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
     Statement st =con.createStatement();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the id To delate");
     int vid=sc.nextInt();
     String q=("Drop table emp1") ;
     int res= st.executeUpdate(q);
     System.out.println("Table drop sucssefully");
     
		}catch(ClassNotFoundException |SQLException e) {
			System.out.println(e);
		}
	}

}
