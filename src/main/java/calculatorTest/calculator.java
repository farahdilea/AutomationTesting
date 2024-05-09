package calculatorTest;

public class calculator {
	
	public int sum(int num1, int num2) {
		
		return num1+num2;	
		}
	
	
	public int sub(int num1, int num2) {
		
		return num1-num2;	
		}
	
	
	public int mult(int num1, int num2) {
		
		return num1*num2;	
		}
	
	public double div(int num1, int num2) {
		if(num1==0) {
			System.out.print("mult can't be zero! ");
//throw new illegalArgumentException("Divisor can't be zero");
		}
		return num1/num2;	
		}	
	

}
