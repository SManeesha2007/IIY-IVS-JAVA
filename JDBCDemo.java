import java.sql.*;

class JDBCDemo
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/empdb";
		String un = "root";
		String pwd = "24B11AI388";

		//JDBC Steps
		//1. Loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		//2. Establishing the Connection
		Connection con = DriverManager.getConnection(url, un, pwd);

		String query = "insert into empinfo values(1, 'MANEESHA', 19)";
		//3. Executing the statement
		Statement st = 	con.createStatement();	
		int res = st.executeUpdate(query);

		//4. Getting the results
		if(res == 1)
			System.out.println("1 row inserted successfully");
		else
			System.out.println("Insertion failed");

		//5. Close the connection
		con.close();
	}
}