package coreJava.miniProjects.employeeIdCardGenerator;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		String employeeId = args[0];
		
		String fullName = args[1];
		EmploymentType employmentType = EmploymentType.valueOf(args[2]);
		
		Department department = Department.valueOf(args[3]);
		String designation = args[4];
		
		String emailAddress = args[5];
		String phoneNumber = args[6];
		
		String joiningYear = args[7];
		
		Employee employee = new Employee(
					employeeId,
					fullName,
					employmentType,
					department,
					designation,
					emailAddress,
					phoneNumber,
					joiningYear
				);
		
		EmployeeCardPrinter.print(employee);;

	}

}
