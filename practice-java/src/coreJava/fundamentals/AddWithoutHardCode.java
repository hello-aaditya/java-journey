package coreJava.fundamentals;

class AddWithoutHardCode {
	public static void main(String[] args) {

		System.out.println("START main()");

		String firstNumberStr = args[0];
		String secondNumberStr = args[1];

		int firstNumber = Integer.parseInt(firstNumberStr);
		int secondNumber = Integer.parseInt(secondNumberStr);

		int addition = firstNumber + secondNumber;
		System.out.println(firstNumberStr + " + " + secondNumberStr + " = " + addition);

		System.out.println("END main()");
	}
}