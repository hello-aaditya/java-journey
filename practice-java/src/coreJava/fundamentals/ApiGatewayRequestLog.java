package coreJava.fundamentals;

public class ApiGatewayRequestLog {
	public static void main(String[] args) {
		
		String requestId = args[0];
		String userId = args[1];
		HttpMethod httpMethod = HttpMethod.valueOf(args[2]);
		String apiEndpoint = args[3];
		AuthenticationType authenticationType = AuthenticationType.valueOf(args[4]);
		ContentType contentType = ContentType.valueOf(args[5]);
		int payloadSize = Integer.parseInt(args[6]);
		double responseTime = Double.parseDouble(args[7]);
		short statusCode = Short.parseShort(args[8]);
		ResponseStatus responseStatus = ResponseStatus.valueOf(args[9]);
		String clientIpAddress = args[10];
		String requestTimestamp = args[11];
		
		System.out.println(
				"======================================================" +
				"\nAPI GATEWAY REQUEST LOG" +
				"\n======================================================" +
				"\nRequest ID: " + requestId +
				"\nUser ID: " + userId +
				"\nHTTP Method: " + httpMethod +
				"\nAPI Endpoint: " + apiEndpoint + 
				"\nAuthentication type: " + authenticationType +
				"\nContent type: " + contentType + 
				"\nPayload Size: " + payloadSize +
				"\nResponse Time: " + responseTime +
				"\nStatus Code: " + statusCode +
				"\nResponse Status: " + responseStatus +
				"\nClient IP Address: " + clientIpAddress +
				"\nRequest Timestamp: " + requestTimestamp +
				"\n======================================================"
				);
	}
}
