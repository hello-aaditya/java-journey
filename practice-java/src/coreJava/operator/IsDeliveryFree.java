package coreJava.operator;

public class IsDeliveryFree {
	
	static int freeDeliveryAmount = 450;
	
	public static void main(String[] args) {
		int totalAmount = 479;
		
		String isFreeDelivery = totalAmount > freeDeliveryAmount ? "Yes" : "No";
		System.out.println(
					"Total Amount: " + totalAmount +
					"\nIs Delivery Free: " + isFreeDelivery
				);
	}
	
	
}
