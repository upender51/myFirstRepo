package test_id.test_id;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testAddition() {
		int a = 3;
		int b = 4;
		int sum = a + b;
		HelloWorld helloWorld = new HelloWorld();
		int sum_1 = helloWorld.addition(a, b);
		assertEquals("Addition of numbers works", sum, sum_1);
		System.out.println("Testing");
		
	}

}
