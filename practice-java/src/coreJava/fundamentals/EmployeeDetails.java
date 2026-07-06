package coreJava.fundamentals;

public class EmployeeDetails {
	public static void main(String[] args) {
		
		String employeeId = args[0];
		String employeeName = args[1];
		String genderStr = args[2];
		String ageStr = args[3];
		String yearOfExperienceStr = args[4];
		String salaryStr = args[5];
		String isPermanentEmployeeStr = args[6];
		String phoneNumber = args[7];
		String department = args[8];
		String designation = args[9];
		String email = args[10];
		String city = args[11];
		String state = args[12];
		String country = args[13];

		// CONVERSION OF STRING TO THEIR SUITABLE DATA-TYPE
		char gender = genderStr.charAt(0);
		Byte age = Byte.parseByte(ageStr);
		Byte yearOfExperience = Byte.parseByte(yearOfExperienceStr);
		double salary = Double.parseDouble(salaryStr);
		boolean isPermanentEmployee = Boolean.parseBoolean(isPermanentEmployeeStr);

		System.out.println("=======================================================" + 
							"\nEMPLOYEE DETAILS: " +
							"\n=======================================================" +
							"\nEmployee Id: " + employeeId +
							"\nEmployee Name: " + employeeName +
							"\nGender: " + gender + 
							"\nAge: " + age + 
							"\nYear of Experience: " + yearOfExperience + 
							"\nSalary: " + salary +
							"\nIs Permanent Employee: " + isPermanentEmployee +
							"\nPhone Number: " + phoneNumber +
							"\nDepartment: " + department + 
							"\nDesignation: " + designation +
							"\nEmail: " + email + 
							"\nCity: " + city +
							"\nState: " + state +
							"\nCountry: " + country + 
							"\n======================================================="
		);
	}
}