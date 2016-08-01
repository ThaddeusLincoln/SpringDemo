package com.turing.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		// BASE CODE FOR LESSON 6
		// JUST TO CHECK HOW THE COMMIT OF A BRANCH WORKS
	}

}
