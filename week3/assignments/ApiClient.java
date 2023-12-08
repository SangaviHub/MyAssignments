package week3.assignments;

public class ApiClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("The requested Endpoint is "+endpoint);
	}
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("The requested Endpoint is "+endpoint+" requested body for endpoint "+requestBody+" and the status of the request is "+requestStatus);
	}
	
	public static void main(String[] args) {
		ApiClient api = new ApiClient();
		api.sendRequest("http://ajio.com/");
		api.sendRequest("http://amazon.in/", "bags", false);
	}

}
