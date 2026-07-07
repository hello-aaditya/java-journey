package coreJava.miniProjects.employeeIdCardGenerator;

public class EmployeeCardPrinter {
	
	public static void print(Employee employee) {
		StringBuilder card = new StringBuilder();
			
		card.append("======================================\n");
		card.append(CompanyInformation.COMPANY_NAME).append("\n");
		card.append("======================================\n\n");
		
		card.append("Employee ID: ")
			.append(employee.getEmployeeId()).append("\n");
		
		card.append("Employee Code: ")
			.append(employee.getEmployeeCode()).append("\n\n");
		
		card.append("Name: ")
			.append(employee.getFullName()).append("\n");
		
		card.append("Employee Type: ")
			.append(employee.getEmploymentType()).append("\n\n");
		
		card.append("Department: ")
			.append(employee.getDepartment()).append("\n");
		
		card.append("Designation: ")
		.append(employee.getDesignation()).append("\n\n");
		
		card.append("Email: ")
		.append(employee.getEmailAddress()).append("\n");
		
		card.append("Phone: ")
		.append(employee.getPhoneNumber()).append("\n");
		
		card.append("Joining Year: ")
		.append(employee.getJoiningYear()).append("\n\n");
		
		card.append("--------------------------------------\n\n");
		
		card.append("Company Address: ")
		.append(CompanyInformation.COMPANY_ADDRESS).append("\n");
		
		card.append("HR Contact: ")
		.append(CompanyInformation.HR_EMAIL).append("\n\n");
		
		card.append("======================================\n");
		
		System.out.println(card);
	}
	
}
