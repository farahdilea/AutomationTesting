package calculatorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calcTest {
	
	@Test
	
	void testSum() {
		
		calculator calc= new calculator();
		int sumResult = calc.sum(1,3);
		System.out.println("Starting a boring test");
		assertEquals(4,sumResult);
		System.out.println("Finished a boring test");
		
	}
	@Test
	void testSub() {
		
		calculator calc= new calculator();
		int subResult = calc.sub(20,15);
		System.out.println("Starting a boring test");
		
		assertEquals(5,subResult);
		System.out.println("Finished a boring test");
	}	
	
	@Test
	void testMult() {
		
		calculator calc= new calculator();
		int multResult = calc.mult(20,10);
		System.out.println("Starting a boring test");
		
		assertEquals(200,multResult);
		System.out.println("Finished a boring test");
	}	
	
	@Test
	void testDiv() {
		
		calculator calc= new calculator();
		double divResult = calc.div(20,10);
		System.out.println("Starting a boring test");
		
		assertEquals(2.0,divResult);
		System.out.println("Finished a boring test");
	}	


}
