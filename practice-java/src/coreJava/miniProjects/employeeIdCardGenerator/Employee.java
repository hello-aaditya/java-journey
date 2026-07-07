package coreJava.miniProjects.employeeIdCardGenerator;

public class Employee { 
	
	private String employeeId;
	private String employeeCode;
	
	private String fullName;
	private EmploymentType employmentType;
	
	private Department department;
	private String designation;
	
	private String emailAddress;
	private String phoneNumber;
	
	private String joiningYear;
	

	
	// CONSTRUCTOR TO INCREASE EMPLOYEE COUNT
	public Employee(
		String employeeId, 
		String fullName,
		EmploymentType employmentType,
		Department department,
		String designation,
		String emailAddress,
		String phoneNumber,
		String joiningYear
	) {
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.employmentType = employmentType;
		this.department = department;
		this.designation = designation;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.joiningYear = joiningYear;
		
		this.employeeCode = EmployeeCodeGenerator.generate(joiningYear);
	}
	
	
	
	
	public String getEmployeeId() {
		return employeeId;
	}




	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}




	public String getEmployeeCode() {
		return employeeCode;
	}




	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}




	public String getFullName() {
		return fullName;
	}




	public void setFullName(String fullName) {
		this.fullName = fullName;
	}




	public EmploymentType getEmploymentType() {
		return employmentType;
	}




	public void setEmploymentType(EmploymentType employmentType) {
		this.employmentType = employmentType;
	}




	public Department getDepartment() {
		return department;
	}




	public void setDepartment(Department department) {
		this.department = department;
	}




	public String getDesignation() {
		return designation;
	}




	public void setDesignation(String designation) {
		this.designation = designation;
	}




	public String getEmailAddress() {
		return emailAddress;
	}




	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}




	public String getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public String getJoiningYear() {
		return joiningYear;
	}




	public void setJoiningYear(String joiningYear) {
		this.joiningYear = joiningYear;
	}




	
	
}
