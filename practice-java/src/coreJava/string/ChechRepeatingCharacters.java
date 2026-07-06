package coreJava.string;

public class ChechRepeatingCharacters {

	public static void main(String[] args) {
		String word = "Congratulations";

		char[] charArray = word.toCharArray();
		int size = charArray.length;
		
		for (int i=0; i<size; i++) {
			char currentChar = charArray[i];
			
			// FIND FIRST UNIQUE CHAR
			if (word.indexOf(currentChar) == word.indexOf(currentChar)) {
				System.out.println("First Unique Characters: " + currentChar);
				break;
			}
		}
		
		System.out.println("Repeating characters are: ");
		for (int i=0; i<size; i++) {
			char currentChar = charArray[i];
			
			// FIND ALL REPEATING CHARACTERS
			if (word.indexOf(currentChar) != word.lastIndexOf(currentChar)) {
				System.out.println(currentChar);
			}
		}
		
	}

}
