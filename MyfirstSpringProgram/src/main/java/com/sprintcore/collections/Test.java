package com.sprintcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/sprintcore/collections/config.xml");
    	Emp emp=(Emp) context.getBean("objEmp");
    	System.out.println("Name:"+ emp.geteName());
    	System.out.println("Phone:"+ emp.getePhones());
    	System.out.println("Addresses:"+ emp.geteAddresses());
    	System.out.println("Courses:"+ emp.geteCourses());

	}

}
