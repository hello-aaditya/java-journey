package coreJava.fundamentals;

public class OrderDetails {

	public static void main(String[] args) {
		String orderId = args[0];
		String productName = args[1]; 
		String priceStr = args[2];
		String gstStr = args[3];
		String totalCartValueStr = args[4]; 
		String customerName = args[5];
		String pickupAddress = args[6];
		String deliveryAddress = args[7];
		String deliveryStatus = args[8];
		String isOpenBoxDeliveryStr = args[9];
		
		double price = Double.parseDouble(priceStr);
		float gst = Float.parseFloat(gstStr);
		double totalCartValue = Double.parseDouble(totalCartValueStr);
		boolean isOpenBoxDelivery = Boolean.parseBoolean(isOpenBoxDeliveryStr);
		
		System.out.println("=========================================" +
							"\nORDER DETAILS" +
							"\n=========================================" +
							"\nOrder ID: " + orderId +
							"\nProduct Name: " + productName +
							"\nPrice: " + price +
							"\nGST: " + gst + "%" +
							"\nTotal Cart Value: " + totalCartValue +
							"\nCustomer Name: " + customerName +
							"\nPickup Address: " + pickupAddress +
							"\nDelivery Address: " + deliveryAddress +
							"\nDelivery Status: " + deliveryStatus +
							"\nIs Open Box Delivery: " + isOpenBoxDelivery
				);
	}
}
