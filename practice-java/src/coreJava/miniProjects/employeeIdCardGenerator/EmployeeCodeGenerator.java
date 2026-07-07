package coreJava.miniProjects.employeeIdCardGenerator;

public class EmployeeCodeGenerator {
	private static int employeeCount = 1000;
	
	public static String generate(String joiningYear) {
		
		employeeCount++;
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(CompanyInformation.COMPANY_PREFIX)
		  .append("-")
		  .append(joiningYear)
		  .append("-")
		  .append(employeeCount);
		  
		return builder.toString();
	}
}
