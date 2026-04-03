

import java.sql.*;

public class CreateStudentTable
{
	public static void main(String args[])
	{
		try 
		{
            // PostgreSQL connection details
            String driver = "org.postgresql.Driver";
            String url = "jdbc:postgresql://192.168.1.17/cse_db24";
            String username = "24bcsa65";
            String password = "24bcsa65";

            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);

            if (con != null) 
            {
                System.out.println("Connection established successfully...");
            }

           
            String qry = "CREATE TABLE student2(roll_no INT PRIMARY KEY, name VARCHAR(50), age INT, department VARCHAR(30), cgpa NUMERIC(4,2))";

            Statement stmt = con.createStatement();
            stmt.executeUpdate(qry);
            System.out.println("Table 'student' created successfully.");

            
            stmt.close();
            con.close();
        } 
		catch (Exception e) 
		{
            System.out.println("Error: " + e);	
        }
	}

}