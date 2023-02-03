package advjavatraining;
import java.sql.*;
/*
Myjdbc(){
	 //  try
	{
	        Class.forName("com.mysql.jdbc.Driver");
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nietdb","root","sps@133");
	        s=con.createStatement();
	        s.execute("create table employee(ename varchar(20), salary varchar(20))");
	        System.out.println("Table created");
	   //   }

	 // catch(Exception  e)
	  {
	   System.out.println(e);
	  }
	 }
}
*/
	/*
	 class InsertTable
	{
		Statement s;
		Connection c;
		InsertTable()
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				c=DriverManager.getConnection("jdbc:mysql://localhost:3306/nietdb","root","sps@133");  //test1 is dbname,   root is dbusername and dbpassword
				s=c.createStatement(); 
	                        //String str="insert into employee values('jaykumar','15000')";
	                          //String str="insert into employee values('Ravi','20000')";
	                         //String str="insert into employee values('Pawan','22000')";
	                          String str="insert into employee values('sachin','28000')";
				s.executeUpdate(str);
				System.out.println("Record Inserted Successfully!!!");
					
			}

			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		
	}
	class ShowTable
	{       Statement stmt;
		Connection con;
		ShowTable()
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nietdb","root","sps@133");  //test1 is dbname,   root is dbusername and dbpassword
				
				 stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from employee"); 
	                        System.out.println("****ADDRESS TABLE*****"); 
				while(rs.next())  
				System.out.println(rs.getString(1)+"   "+rs.getString(2));  
				con.close();	
			}

			catch(Exception e)
			{
				e.printStackTrace();
			}
	         }
	}
	class DeleteRecord
	{       Statement stmt;
		Connection con;
		DeleteRecord()
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nietdb","root","sps@133");  //test1 is dbname,   root is dbusername and dbpassword
				
				 stmt=con.createStatement();  
				int ret=stmt.executeUpdate("delete from employee where ename='jaykumar'"); 
	                        if(ret==1){
	                        System.out.println("1 row deleted!!!"); 
				}
				con.close();	
			}

			catch(Exception e)
			{
				e.printStackTrace();
			}
	         }
	}
	class UpdateRecord
	{   Statement stmt;
		Connection con;
		UpdateRecord()
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nietdb","root","sps@133");  //test1 is dbname,   root is dbusername and dbpassword
				
				 stmt=con.createStatement();  
				int ret=stmt.executeUpdate("update employee set salary='20000' where ename='ravi'"); 
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
	}*/
public class myjdbc {

	public myjdbc() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Statement s;
		Connection con;
		Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhi","root","1234");
        s=con.createStatement();
        s.execute("create table employee(ename varchar(20), salary varchar(20))");
        System.out.println("Table created");

	}

}
