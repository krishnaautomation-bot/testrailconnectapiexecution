package stepdefinations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import test_rail.APIClient;
import test_rail.APIException;
import test_rail.TestRailAccount;
import utils.TestData;

public class Hooks {
	
	private static APIClient client = null;
    private static int runId;
    private static String projectId = "1";
    private static final int FAIL_STATE = 5;
    private static final int SUCCESS_STATE = 1;
	
	@Before("@TR")
    public void initializeTestRail() throws MalformedURLException, IOException, APIException {
		TestData testdata = new TestData();
		client = TestRailAccount.testRailApiClient();
		//Add a new testrail RUN ID to project
		client.sendPost("add_run/" + projectId, null);
		//Fetch RUN ID
		runId = GetTestRunID();
		File file = new  File("./target/testrailreportfile.txt");
		FileWriter fw = new FileWriter( file.getAbsoluteFile( ) );
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write(testdata.properties.getProperty("testrailURL")+"index.php?/runs/view/"+runId);
	    bw.close( );
		
    }
	
    @After()
    public void tearDown(Scenario scenario) throws MalformedURLException, IOException, APIException {
        logResultToTestRail(scenario);
    }


    private void logResultToTestRail(Scenario scenario) throws MalformedURLException, IOException, APIException {
        	
    	String caseId = "";
        
        for (String s : scenario.getSourceTagNames()) {
            if (s.contains("TestRail" )) {

                String[] res = s.split("(\\(.*?)" );

                caseId = res[1].substring(0, res[1].length() - 1); // Removing the last parenthesis
                System.out.println(caseId);
                
            }
        }
        
        Map<String, Serializable> data = new HashMap<>();

        if (!scenario.isFailed()) {
            data.put("status_id", SUCCESS_STATE);

        } else {
            data.put("status_id", FAIL_STATE);
        }

        if (!caseId.equals("" )) {
            	client.sendPost("add_result_for_case/" + runId + "/" + caseId, data);
            	        }
    }
    
    public int GetTestRunID() throws IOException {
    	
    	TestData testdata = new TestData();
    	
    	URL url = new URL(testdata.properties.getProperty("testrailURL")+"index.php?/api/v2/get_runs/1");
		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
		httpConn.setRequestMethod("GET");

		httpConn.setRequestProperty("Content-Type", "application/json");

		byte[] message = (testdata.properties.getProperty("testrailUsername")+":"+testdata.properties.getProperty("testrailPassword")).getBytes("UTF-8");
		String basicAuth = DatatypeConverter.printBase64Binary(message);
		httpConn.setRequestProperty("Authorization", "Basic " + basicAuth);
		
		InputStream responseStream = httpConn.getResponseCode() / 100 == 2
				? httpConn.getInputStream()
				: httpConn.getErrorStream();
		Scanner s = new Scanner(responseStream).useDelimiter("\\A");
		String response = s.hasNext() ? s.next() : "";
		JSONObject json = new JSONObject(response.substring(1,response.length()-1));
		return json.getInt("id");
    }
    

}
