package advjavatraining;
import java.sql.*;
class InsertTable
{
	Statement s;
	Connection c;
	InsertTable()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhi","root","1234");  //test1 is dbname,   root is dbusername and dbpassword
			s=c.createStatement(); 
                  String str="insert into employee values('jaykumar','15000')";
			s.executeUpdate(str);
			System.out.println("Record Inserted Successfully!!!");		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class student {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			InsertTable obj1=new InsertTable();
	}}