package com.turing.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		// WHAT WE DID IN LESSON 7
		// 1. Erased everything in Triangle class but the draw() method
		// 2. Created a new class: Point
		// 3. Injected predefined Point objects as fields for the Triangle class
	}

}
