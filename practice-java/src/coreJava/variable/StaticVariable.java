package coreJava.variable;

public class StaticVariable {
	
	// static VARIABLE
	static int interestRate = 5;
	
	public static void main(String[] args) {
		// static VARIABLE CAN BE ACCESSED BY ClassName.staticVariableName
		System.out.println("Interest Rate: " + StaticVariable.interestRate + "%");
	}
}
