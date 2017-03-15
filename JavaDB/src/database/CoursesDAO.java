package database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CoursesDAO {

	

	public static void updateCourses() throws Exception{
	
		try{
			Connection con = Main.getConnection();
			PreparedStatement posted = con.prepareStatement("UPDATE courses SET name = 'daniel'  WHERE name= 'Engleza'");
		posted.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		finally{
			System.out.println("update complete");
		}
	}
	
	public static void deleteCourses() throws Exception{
		
		try{
			Connection con =  Main.getConnection();
			PreparedStatement posted = con.prepareStatement("DELETE from courses where id = 1");
		posted.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		finally{
			System.out.println("delete complete");
		}
	}
	
	
	
	
	public static void postCourses() throws Exception{
		final String var1 = "Engleza";
		final String var2 = "Baidoc";
		final int var3 = 4;
		
		try{
			Connection con =  Main.getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO courses (name, teacher ,studyYear) VALUES ('"+var1+"', '"+var2+"' , '"+var3+"')");
		posted.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		finally{
			System.out.println("insert complete");
		}
	}
	
}
