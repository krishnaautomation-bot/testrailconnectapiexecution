package test_rail;

import java.io.IOException;

import utils.TestData;

public class TestRailAccount {
	
	 
	 public static APIClient testRailApiClient() throws IOException {
		 
		    TestData testdata = new TestData();

		 	String baseUrl = testdata.properties.getProperty("testrail.uname");
	        String usernameTestRail = testdata.properties.getProperty("testrail.uname");
	        String passwordTestRail = testdata.properties.getProperty("testrail.uname");

	        APIClient client = new APIClient(baseUrl);
	        client.setUser(usernameTestRail);
	        client.setPassword(passwordTestRail);

	        return client;
	    }


	 
	 
	 
}
