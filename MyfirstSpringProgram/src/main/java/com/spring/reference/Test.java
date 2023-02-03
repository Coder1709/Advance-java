package com.spring.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/reference/refConfig.xml");
    	A a=(A) context.getBean("refA");
    	System.out.println(a.getX());
    	System.out.println(a.getObjB().getY());
    	System.out.println(a);
	}

}
