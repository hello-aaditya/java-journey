package coreJava;

public class PracticeStringBuilder {

	public static void main(String[] args) {

		// string literal
		String city = "Bangalore";
		 
		city.concat(" India");
		
		System.out.println(city);

		
		// FREQUENT CHANGE
		StringBuilder sb = new StringBuilder("Bangalore");
		
		sb.append(" India");
		System.out.println(sb);
	}

}
