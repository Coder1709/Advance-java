package springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("springcore/auto/wire/autoConfig.Xml");
		Emp emp=(Emp)context.getBean("objEmp",Emp.class);
		System.out.println("\n\n"+emp);
	}

}
