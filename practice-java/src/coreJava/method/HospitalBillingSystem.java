package coreJava.method;

public class HospitalBillingSystem {
	
	// static VARIABLES
	private static String hospitalName = "Medicare Super Speciality Hospital";
	private static String currency = "₹";
	private static int gstPercentage = 18;
	private static int hospitalServiceCharge = 500;
	
	// INSTANCE VARIABLES
	String patientId;
	String patientName;
	String doctorName;
	RoomType roomType;
	AdmissionType admissionType;
	InsuranceProvider insuranceProvider;
	short hospitalDays;
	int doctorConsultationFee;
	double medicineCharge;
	double laboratoryCharge;
	
	public static void main(String[] args) {
		HospitalBillingSystem hbs = new HospitalBillingSystem();
		
		hbs.patientId = args[0];
		hbs.patientName = args[1];
		hbs.doctorName = args[2];
		hbs.roomType = RoomType.valueOf(args[3]);
		hbs.admissionType = AdmissionType.valueOf(args[4]);
		hbs.insuranceProvider = InsuranceProvider.valueOf(args[5]);
		hbs.hospitalDays = Short.parseShort(args[6]);
		hbs.doctorConsultationFee = Integer.parseInt(args[7]);
		hbs.medicineCharge = Double.parseDouble(args[8]);
		hbs.laboratoryCharge = Double.parseDouble(args[9]);
		
		int totalRoomCharge = calculateRoomCharge(hbs.roomType, hbs.hospitalDays);
		double subtotal = calculateSubtotal(totalRoomCharge, hbs.doctorConsultationFee, hbs.medicineCharge, hbs.laboratoryCharge);
		double totalGst = calculateGst(subtotal);
		double finalBill = calculateFinalBill(subtotal, totalGst);
		HospitalBillingSystem.printHospitalInvoice(hbs, totalRoomCharge, subtotal, totalGst, finalBill);
		
	}
	
	// STATIC METHODS
	// CALCULATE ROOM CHARGE
	private static int calculateRoomCharge(RoomType roomType, short hospitalDays) {
		int roomCharge = switch(roomType) {
			case GENERAL -> 1200;
			case SEMI_PRIVATE -> 2500;
			case PRIVATE -> 4500;
			case ICU -> 8000;
		};
		int totalRoomCharge = roomCharge * hospitalDays; 
		return totalRoomCharge; 
	}
	
	// CALCULATE SUBTOTAL
	private static double calculateSubtotal(int roomCharge, int doctorConsultationFee, double medicineCharge, double laboratoryCharge) {
		double subtotal = roomCharge + doctorConsultationFee + medicineCharge + laboratoryCharge + hospitalServiceCharge;
		
		return subtotal;
	}
	
	// CALCULATE GST
	private static double calculateGst(double subtotal) {
		double gst = subtotal * gstPercentage/100.00;
		return gst;
	}
	
	// CALCULATE FINAL BILL
	private static double calculateFinalBill(double subtotal, double gst) {
		return subtotal + gst;
	}
	
	// PRINT HOSPITAL Invoice
	private static void printHospitalInvoice(
			HospitalBillingSystem hbs,
			int totalRoomCharge,
			double subtotal,
			double totalGst,
			double finalBill
			) 
	{
		System.out.println(
					"======================================================" +
					"\nMEDICARE HOSPITAL BILLING REPORT" +
					"\n======================================================" +
					"\nHOSPITAL INFORMATION" +
					"\n------------------------------------------------------" +
					"\nHospital Name: " + hospitalName +
					"\nCurrency : " + currency +
					"\nGST Percentage:  " + gstPercentage + " %" +
					"\nHospital Service Charge: " + hospitalServiceCharge +
					"\n\nPATIENT INFORMATION" +
					"\n------------------------------------------------------" +
					"\nPatient ID: " + hbs.patientId +
					"\nPatient Name: " + hbs.patientName +
					"\nDoctor Name: " + hbs.doctorName +
					"\n\nAdmission Type: " + hbs.admissionType +
					"\nRoom Type: " + hbs.roomType +
					"\nInsurance Provider: " + hbs.insuranceProvider +
					"\n\nHospital Days: " + hbs.hospitalDays +
					"\n\nBILL BREAKDOWN" +
					"\n------------------------------------------------------" +
					"\nRoom Charge: " + HospitalBillingSystem.currency + totalRoomCharge +
					"\nDoctor Consultation Fee: " + HospitalBillingSystem.currency + hbs.doctorConsultationFee +
					"\nMedicine Charge: " + HospitalBillingSystem.currency + hbs.medicineCharge +
					"\nLaboratory Charge: " + HospitalBillingSystem.currency + hbs.laboratoryCharge +
					"\nHospital Service Charge: " + HospitalBillingSystem.currency + hospitalServiceCharge +
					"\n\n------------------------------------------------------" +
					"\nSubtotal: " + HospitalBillingSystem.currency + subtotal +
					"\nGST (18%): " + HospitalBillingSystem.currency + totalGst +
					"\n------------------------------------------------------" +
					"\nTotal Bill: " + HospitalBillingSystem.currency + finalBill
				);
	}
}

