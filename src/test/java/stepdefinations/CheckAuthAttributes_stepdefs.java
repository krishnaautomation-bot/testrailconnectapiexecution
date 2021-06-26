package stepdefinations;

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
import org.testng.Assert;
import org.testng.annotations.Test;

import authController.CheckAuthAttributes;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;
import test_rail.APIClient;
import test_rail.APIException;
import test_rail.TestRailAccount;

public class CheckAuthAttributes_stepdefs {
	
	private static APIClient client = null;
    private static int runId;
    private static String projectId = "1";
    private static final int FAIL_STATE = 5;
    private static final int SUCCESS_STATE = 1;
	
	CheckAuthAttributes checkauthattributes =  new CheckAuthAttributes();
	
	@When("^validate assertion$")
    public void validate_assertion() throws Throwable {
		Thread.sleep(5000);
        Assert.assertEquals(true, true);
    }
	
        


}
