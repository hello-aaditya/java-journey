package coreJava;

//final 
class Test extends Object {
	final String NAME = "RBI";
	
	public final void myMethod() {
		System.out.println("Test.doSomething()");
	}
}

public class Account extends Test{
	
	/*
	@Override
	public void myMethod() {
		System.out.println(Account.doSomething());
	}
	*/
}
