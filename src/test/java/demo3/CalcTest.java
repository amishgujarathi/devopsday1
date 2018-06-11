package demo3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {
	private Calc c1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c1 = new Calc();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int i = c1.add(10, 20);
		assertTrue("Adding two number 10, 20", i == 30);
	}
	
	@Test
	public void testDivide() {
		int i = c1.divide("100", "20");
		assertTrue("Divide two numbers - 100, 20", i == 5);
	}
	
	@Test
	public void testDividebyzero() {
		try {
			c1.divide("100", "0");
		} catch (ArithmeticException e){
			assertTrue("Divide by zero", true);
		}		
	}
	
	@Test
	public void testDivideNonNumeric() {
		try {
			c1.divide("A0", "20");
		} catch (NumberFormatException e){
			assertTrue("Number format exception", true);
		}		
	}

}
