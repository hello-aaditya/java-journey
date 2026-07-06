package coreJava.variable;

public class InstanceVariable {
	int balance;
	
	public InstanceVariable() {
		this.balance = 100; // INSTANCE VARIABLE
	}
	
	public static void main(String[] args) {
		InstanceVariable instanceVariable = new InstanceVariable();
		
		System.out.println("Balance: " + instanceVariable.balance);
	}
}
