package test_rail;

public class TestRailAccount {
	 
	 public static APIClient testRailApiClient() {

		 	String baseUrl = "https://krishnabot.testrail.io/";
	        String usernameTestRail = "krishnapnimmagadda@gmail.com";
	        String passwordTestRail = "Automation@123";

	        APIClient client = new APIClient(baseUrl);
	        client.setUser(usernameTestRail);
	        client.setPassword(passwordTestRail);

	        return client;
	    }


	 
	 
	 
}
