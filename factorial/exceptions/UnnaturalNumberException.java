package factorial.exceptions;

public class UnnaturalNumberException extends ArithmeticException {
	/**
	 * Throw this when negative integers or unreal numbers are used instead of positive integers.
	 */
	private static final long serialVersionUID = -6619324973097350781L;

	public UnnaturalNumberException(String str){
		super(str);
	}

	public UnnaturalNumberException(){
		super("Can't use unnatural numbers");
	}
}
