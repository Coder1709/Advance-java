package spring.jdbc;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/jdbc/jdbcConfig.xml");
		JdbcTemplate templet=(JdbcTemplate)context.getBean("objJdbcTemplet");
		//Insert Query
		String query="insert into student(id,name,city) values(?,?,?)";
		int i=templet.update(query,22,"Rahul","Delhi");
		System.out.println("No. of row inserted!!"+i);
		
	}

}
