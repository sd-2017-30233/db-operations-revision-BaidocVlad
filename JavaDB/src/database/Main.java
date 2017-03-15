package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		studentDAO.deleteStudent();
	}
	
	
	

	
	public static Connection getConnection() throws Exception{
		try{
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/testdb";
			String username = "root";
			String password = "root";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			//System.out.println("coonect");
			return conn;
		}catch(Exception e){
			System.out.println(e);
			
		}
		return null;
	}

}
