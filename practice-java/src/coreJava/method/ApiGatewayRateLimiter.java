package coreJava.method;

public class ApiGatewayRateLimiter {
	static String apiGatewayName = "productHub API Gateway";
	static int maxRequestPerMinute = 1000;
	static int windowDurationInSecond = 60;
	
	String requestId;
	String clientName;
	String apiEndpoint;
	HttpMethod httpMethod;
	AuthenticationType authenticationType;
	ClientType clientType;
	int currentRequestCount;
	double averageResponseTime;
	String clientIpAddress;
	
	// CALCULATE REMINING REQUEST
	private static int calculateRemainingRequests(int currentRequestCount) {
		return maxRequestPerMinute - currentRequestCount;
	}
	
	// CALCULATE UTILIZATION PERCENTAGE
	private static float calculateUtilizationPercentage(int currentRequestCount) {
		return (currentRequestCount*100.00f) / maxRequestPerMinute;
	}
	
	// PRINT GATEWAY REPORT
	private static void printGatewayReport(
				ApiGatewayRateLimiter api
			) 
	{
		System.out.println(
					"==============================================================" +
				    "\nPRODUCTHUB API GATEWAY REPORT" +
				    "\n==============================================================" +
					"\nGateway Name: " + ApiGatewayRateLimiter.apiGatewayName +
					"\nWindow Duration: " + ApiGatewayRateLimiter.windowDurationInSecond +
					"\nMaximum Requests: " + ApiGatewayRateLimiter.maxRequestPerMinute +
					"\n\nCLIENT INFORMATION" +
					"\n-------------------------------------------------------------" +
					"\nRequest ID: " + api.requestId +
					"\nClient Name: " + api.clientName +
					"\nClient Type: " + api.clientType +
					"\n\nAPI Endpoint: " + api.apiEndpoint +
					"\nHTTP Method: " + api.httpMethod +
					"\nAuthentication: " + api.authenticationType +
					"\n\nClient IP Address: " + api.clientIpAddress +
					"\n\nREQUEST ANALYTICS" +
					"\n-------------------------------------------------------------" +
					"\nCurrent Requests: " + api.currentRequestCount +
					"\nRemaining Requests: " + ApiGatewayRateLimiter.calculateRemainingRequests(api.currentRequestCount) +
					"\nAverage Response Time: " + api.averageResponseTime + " ms" +
					"\nAPI Utilization: " + ApiGatewayRateLimiter.calculateUtilizationPercentage(api.currentRequestCount) + " %" +
					"\n=============================================================="
					
				);
	}
	
	public static void main(String[] args) {
		ApiGatewayRateLimiter api = new ApiGatewayRateLimiter();
		
		api.requestId = args[0];
		api.clientName = args[1];
		api.apiEndpoint = args[2];
		api.httpMethod = HttpMethod.valueOf(args[3]);
		api.authenticationType = AuthenticationType.valueOf(args[4]);
		api.clientType = ClientType.valueOf(args[5]);
		api.currentRequestCount = Integer.parseInt(args[6]);
		api.averageResponseTime = Double.parseDouble(args[7]);
		api.clientIpAddress = args[8];
		
		
		printGatewayReport(api);
	}
}
