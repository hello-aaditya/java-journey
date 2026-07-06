package coreJava.variable;

public class LocalVariable {
	
	public static void main(String[] args) {
		
		int myBalance = 1000;
		System.out.println("Balance: " + myBalance);
	}
	
	// METHOD
	// GIVES ERROR
	// myBalance IS A LOCAL VARIABLE AND SCOPE OF LV IS LOCAL
	
	/*
	public static void myBalance(){
		System.out.println(myBalance);
	}
	*/
}
