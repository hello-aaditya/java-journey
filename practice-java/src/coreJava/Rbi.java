package coreJava;

public class Rbi {
	public void guidelines() {
		System.out.println("It is RBI Guidelines.");
	}
}

class Sbi extends Rbi {
	
	@Override
	public void guidelines() {
		System.out.println("It is RBI & SBI Guidelines.");
	}
}


