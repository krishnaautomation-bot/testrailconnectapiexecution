package test_rail;

import java.io.IOException;

import utils.TestData;

public class TestRailAccount {
	
	 
	 public static APIClient testRailApiClient() throws IOException {
		 
		    TestData testdata = new TestData();

		 	String baseUrl = testdata.properties.getProperty("testrailURL");
	        String usernameTestRail = testdata.properties.getProperty("testrailUsername");
	        String passwordTestRail = testdata.properties.getProperty("testrailPassword");
                System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail); 
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
		 System.out.println(baseUrl);
		System.out.println(usernameTestRail);
		System.put.println(passwordTestRail);
	        APIClient client = new APIClient(baseUrl);
	        client.setUser(usernameTestRail);
	        client.setPassword(passwordTestRail);

	        return client;
	    }


	 
	 
	 
}
