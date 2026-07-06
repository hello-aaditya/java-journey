package coreJava.string;

public class Driver {

	public static void main(String[] args) {
		
		// CREATING STRING BY USING STRING LITERALS
		String city = "Bengaluru";
		String myCity = "Bengaluru";
		
		System.out.println(myCity); // Bengaluru
		System.out.println(city == myCity); // TRUE
		
		
		// CREATING STRING BY USING NEW KEYWORD
		String country = new String("India"); // WILL CREATE INSIDE HEAP & ONE COPY IN SCP
		String myCountry = new String("India"); // WILL CREATE INSIDE HEAP & TRY TO CREATE ONE COPY INSIDE SCP BUT THERE "India" ALREADY EXISTS THEN IT WILL NOT CREATE
		
		System.out.println(myCountry);
		System.out.println(country == myCountry); // FALSE
		
		System.out.println(city == myCountry);
		
		
	}

}
