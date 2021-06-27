package test_rail;

import java.io.IOException;

import utils.TestData;

public class TestRailAccount {
	
	 
	 public static APIClient testRailApiClient() throws IOException {
		 
		    TestData testdata = new TestData();
		 
		    APIClient client = new APIClient(testdata.properties.getProperty("testrailURL"));
	        client.setUser(testdata.properties.getProperty("testrailUsername"));
	        client.setPassword(testdata.properties.getProperty("testrailPassword"));

	        return client;
	    }


	 
	 
	 
}
