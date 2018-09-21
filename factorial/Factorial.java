package factorial;

import factorial.exceptions.UnnaturalNumberException;

public class Factorial {
	private int number;

	
	public Factorial(int number) throws UnnaturalNumberException{
		if(number < 0){
			throw new UnnaturalNumberException();
		}
		this.number = number;
	}
	
	public long result() {
		long result = 1; // 1 is the minimal factorial
		
		if(this.number <= 1) {
			result = 1;
		}else{
			for(long i=(long)this.number;i > 1; i--){
				result = result * i;
				if(result < 0){
					throw new ArithmeticException("Result exceed maximum long range");
				}
			}
		}

		return result;
	}
}
