package coreJava.fundamentals;

class PrintEmpDetailsViaCLIWithoutHardcode {
	public static void main(String[] args) {

		String firstName = args[0];
		String lastName = args[1];
		String email = args[2];
		String city = args[3];
		String country = args[4];

		System.out.println("Employee Details: " +
							"\n------------------------------------------------" +
							"\nFirst Name: " + firstName +
							"\nLast Name: " + lastName +
							"\nEmail: " + email + 
							"\nCity: " + city +
							"\nCountry: " + country
			);
	}
}