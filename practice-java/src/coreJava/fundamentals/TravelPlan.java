package coreJava.fundamentals;

import java.time.LocalDate;

public class TravelPlan {
	public static void main(String[] args) {
		
		String travelDateStr = args[0];
		String travelCity = args[1];
		String travelBudgetStr = args[2];
		
		LocalDate travelDate = LocalDate.parse(travelDateStr);
		float travelBudget = Float.parseFloat(travelBudgetStr);
		
		System.out.println("TRAVEL PLAN INFORMATION" +
							"\n*******************************" +
							"\n Travel Date: " + travelDate + 
							"\n Travel City: " + travelCity +
							"\n Travel Budget: " + travelBudget
				);
		
	}
}
