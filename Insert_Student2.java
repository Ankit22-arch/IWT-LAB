

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_Student2 {

	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your roll_no");
			int roll_no=sc.nextInt();
			System.out.println("enter your name");
			String name=sc.next();
			System.out.println("enter your age");
			int age=sc.nextInt();
			System.out.println("enter your department");
			String department=sc.next();
			System.out.println("enter your cgpa");
			float cgpa=sc.nextFloat();
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
					String qry = "INSERT INTO student2 (roll_no,name,age,department,cgpa) VALUES (?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(qry);
					ps.setInt(1, roll_no);
					ps.setString(2, name);
					ps.setInt(3,age);
					ps.setString(4, department);
					ps.setFloat(5,cgpa);
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
