package advjavatraining;
import java.sql.*;
public class selectcommand {

	public selectcommand() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhi","root","1234");
			//HERE abhi is database name,root is username and password is 1234
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from emp1 where department='IT'");
			while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			con.close();
			}
			catch(Exception e)
			{
			System.out.println(e);
			}

	}

}