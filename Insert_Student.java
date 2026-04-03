
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_Student
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter your name");
//		String name=sc.nextLine();
//		System.out.println("enter your sic number");
//		String sic=sc.nextLine();
		try {
			String driver="org.postgresql.Driver";
			String url="jdbc:postgresql://192.168.1.17/cse_db24";
			String username="24bcsa65";
			String password="24bcsa65";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			if(con!=null)
			{
				System.out.println("connection established succesfully...");
				String qry = "insert into student2 values(09,'rakesh',20,'student',9.56)";
				
				PreparedStatement ps = con.prepareStatement(qry);
//				ps.setString(1, name);
//				ps.setString(2, sic);
				int i = ps.executeUpdate();
				if(i == 1) {
				System.out.println("Record Inserted successfully");
				}
				ps.close(); con.close();
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}


