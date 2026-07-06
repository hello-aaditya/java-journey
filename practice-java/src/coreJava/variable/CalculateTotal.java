package coreJava.variable;

public class CalculateTotal {
	
	// static VARIABLE
	static int gst = 18;
	
	public static void main(String[] args) {
		
		String productName = "iPhone16";
		double price = 1_00_000.00;
		double totalPrice = price + (price * CalculateTotal.gst / 100.00);
		
		System.out.println(
				"Product Name : " + productName +
				"\nPrice        : " + price +
				"\nGST          : " + gst +
				"\n---------------------------------" +
				"\nTotal Price  : " + totalPrice
				);
	}
}
