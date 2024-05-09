package calculatorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calcTest {

	@Test
	void testSum() {
		
		calculator calc= new calculator();
		int sumResult = calc.sum(1,3);
		assertEquals(4,sumResult);
	}
	@Test
	void testSub() {
		
		calculator calc= new calculator();
		int subResult = calc.sub(20,15);
		assertEquals(5,subResult);
	}	
	
	@Test
	void testMult() {
		
		calculator calc= new calculator();
		int multResult = calc.mult(20,10);
		assertEquals(200,multResult);
	}	

	void testDiv() {
		
		calculator calc= new calculator();
		double divResult = calc.div(20,10);
		assertEquals(2.0,divResult);
	}	


}
