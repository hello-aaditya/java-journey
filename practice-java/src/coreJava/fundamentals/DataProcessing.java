package coreJava.fundamentals;

public class DataProcessing {
	public static void main(String[] args) {

		/*
		 * HARDCODED VALUE - NOT RECOMMENDED FOR REAL-WORLD APPLICATIONS
		 */
		
		// String fileName = "data_2_july.xls";
		// System.out.println(fileName);

		/*
		 * INSTEAD OF HARDCODING VALUES, READ THEM FROM:
		 * 1. COMMAND-LINE ARGUMENTS
		 * 2. CONFIGURATION FILES
		 * 3. USER INPUT
		 * 4. ENVIRONMENT VARIABLES
		 *
		 * THIS MAKES THE APPLICATION MORE FLEXIBLE AND EASIER TO
		 * MAINTAIN BECAUSE THE DATA CAN CHANGE WITHOUT MODIFYING THE SOURCE CODE.
		 */

		String fileName = args[0];
		System.out.println(fileName);
	}
}