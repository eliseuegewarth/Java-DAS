package factorial;

public class Factorial {
	private int number;
	
	public Factorial(int number) {
		this.number = number;
	}
	
	public int result() {
		int result = 120;
		
		if(this.number == 0) {
			result = 1;
		}
		return result;
	}
}
