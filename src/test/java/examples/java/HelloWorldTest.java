package examples.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private HelloWorld subject;

	@Before
	public void setup() {
		subject = new HelloWorld();
	}
	
	@Test
	public void testGetMessage() {
		assertEquals("Hello World!", subject.getMessage(null));
	}

	@Test
	public void testGetMessage2() {
		assertEquals("Hello Tonux!", subject.getMessage("Tonux"));
	}

	@Test
	public void testSum(){
		assertEquals(4, subject.sum(2,2));
	}

	@Test
	public void testSum2(){
		assertNotEquals(5, subject.sum(1,3));
	}
	
}
