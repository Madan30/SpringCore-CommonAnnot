package com.NepalCode.SpringAnnot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeTest {

	public static void main(String[] args) {
		
		//ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);	
		College college1 = context.getBean("collegeBean", College.class);
		System.out.println("The object of the college is: " + college1);
		college1.collegeTest();
		
		//((AnnotationConfigApplicationContext)context).close();
		context.close();

	}

}
