package Project;
import java.sql.*;
public class ConnectionProvider {
	public static Connection getConn(){
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank_management_system","root","2000");
			return con;
		}
		catch(Exception e){
			System.out.println(e);
			return null;
		}
	}
    public static void print(){
    	Connection conn = getConn();
    	if(conn!=null){
    		System.out.println("sucess");
    	}
    	else
    		System.out.println("fail");
    	try{
//    		 PreparedStatement stmt=conn.prepareStatement("select name from bloodrequest where name=?");
//			stmt.setString(1, "abc");
//		     ResultSet resultSet = stmt.executeQuery();  
//		         
//		    	System.out.println(resultSet.getString(1));
    		PreparedStatement ps = conn.prepareStatement("insert into bloodrequest values(?,?,?,?,?)");
    		ps.setString(1,"hari");
    		ps.setString(2,"hari");
    		ps.setString(3,"hari");
    		ps.setString(4,"hari");
    		ps.setString(5,"hari");
    		ps.executeUpdate();
		    	
		    
    	}
    	catch(Exception e){
    		System.out.println("eeeeeeeeeeeeeeeeeee");
    	}
    }
}
 