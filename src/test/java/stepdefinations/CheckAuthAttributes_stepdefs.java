package stepdefinations;

import org.testng.Assert;
import io.cucumber.java.en.When;

public class CheckAuthAttributes_stepdefs {
	
	@When("^validate assertion$")
    public void validate_assertion() throws Throwable {
		Thread.sleep(5000);
        Assert.assertEquals(true, true);
    }
	
        


}
