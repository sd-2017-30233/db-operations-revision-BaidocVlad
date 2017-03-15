package database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class studentDAO {

	
	

	public static void updateStudent() throws Exception{
		
		try{
			Connection con = Main.getConnection();
			PreparedStatement posted = con.prepareStatement("UPDATE student  SET name = 'daniel'  WHERE  name= 'Vlad'");
		posted.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		finally{
			System.out.println("update complete");
		}
	}
	
	public static void deleteStudent() throws Exception{
		
		try{
			Connection con =  Main.getConnection();
			PreparedStatement posted = con.prepareStatement("DELETE from student where name = 'daniel'");
		posted.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		finally{
			System.out.println("delete complete");
		}
	}
	
	
	
	
	public static void postStudent() throws Exception{
		final String var1 = "Vlad";
		final String var2 = "10.10.1993";
		final String var3 = "CLUJ";
		final int var4 = 1;
		try{
			Connection con =  Main.getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO student (name,birthDate,address,coursesID ) VALUES ('"+var1+"', '"+var2+"','"+var3+"','"+var4+"')");
		posted.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		finally{
			System.out.println("insert complete");
		}
	}
	
	
	
}
