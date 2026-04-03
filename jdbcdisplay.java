
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcdisplay {

	public static void main(String[] args) {
	
		try
		
	     {
	    	 String driver = "org.postgresql.Driver";
	    	 String url = "jdbc:postgresql://192.168.1.17/cse_db24";
	    	 String username = "24bcsa65";
	    	 String password = "24bcsa65";
	    	 Class.forName(driver);
	    	 Connection con = DriverManager.getConnection(url, username, password);
	    	 if(con!=null)
	    		 System.out.println("Connection established succesfully..");
	    	 	String qry = "SELECT * FROM student2";
				PreparedStatement ps = con.prepareStatement(qry);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					System.out.println(rs.getInt("roll_no"));
					System.out.println(rs.getString("name"));
					System.out.println(rs.getInt("age"));
					System.out.println(rs.getString("department"));
					System.out.println(rs.getFloat("age"));
				}
				ps.close();
				con.close();	
			}

	    	
	    	 
	     
	     catch (Exception e)
	     {
	    	 System.out.println(e);
	     }
	}

}
