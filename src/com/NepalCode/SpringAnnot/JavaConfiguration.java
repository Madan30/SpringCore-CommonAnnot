package com.NepalCode.SpringAnnot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan(basePackages="com.NepalCode.SpringAnnot")
public class JavaConfiguration {

	@Bean
	public Teacher mathTeacherBean() {
		// Teacher t = new MathTeacher();
		return new MathTeacher();
	}
	
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	
	@Bean
	// public College collegeBean():: method name is the bean id/ bean name
	public College collegeBean() { 
		//College college = new College(principalBean());
		//return new College();
		College collegeb = new College();
		collegeb.setPrincipal(principalBean());
		collegeb.setTeacher(mathTeacherBean());
		return collegeb;
	}
}
