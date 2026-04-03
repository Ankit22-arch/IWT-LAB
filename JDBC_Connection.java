import java.sql.Connection;
import java.sql.DriverManager;
public class JDBC_Connection {

	public static void main(String[] args) {
		try {
			String driver = "org.postgresql.Driver";
			String url = "jdbc:postgresql://192.168.1.17/cse_db24";
			String username = "24bcsa65";
			String password = "24bcsa65";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			if(con!= null)
					System.out.print("DATABASE CONNECTED");
				
			}
			catch (Exception e){
				System.out.println(e);
			} 
	}

}
