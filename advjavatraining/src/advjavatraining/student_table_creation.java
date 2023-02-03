package advjavatraining;
import java.sql.*;
public class student_table_creation {

	public student_table_creation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection con;
		 Statement s;
		   try{
		        Class.forName("com.mysql.jdbc.Driver");
		        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhi","root","1234");
		        s=con.createStatement();
		        s.execute("create table student1(id integer,ename varchar(20), branch varchar(20))");
		        System.out.println("Table created");
		      }

		  catch(Exception  e)
		  {
		   System.out.println(e);
		  }
		 } 


}
