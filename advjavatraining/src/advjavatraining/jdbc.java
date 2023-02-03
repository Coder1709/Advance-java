package advjavatraining;
import java.sql.*;
class UpdateRecord1
{   Statement stmt;
	Connection con;
	UpdateRecord1()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhi","root","1234");  //test1 is dbname,   root is dbusername and dbpassword
			
			 stmt=con.createStatement();  
			int ret=stmt.executeUpdate("update employee1 set salary='20000' where name='aditi'"); 
                        if(ret==1){
                        System.out.println("1 row updated!!!"); 
			}
			con.close();	
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
         }
}
public class jdbc {

	public jdbc() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		UpdateRecord1 obj1=new UpdateRecord1();

	}

}
