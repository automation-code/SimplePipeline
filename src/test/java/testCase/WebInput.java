package testCase;

import org.testng.annotations.Test;
import pageObjects.BaseCls;
import pageObjects.PageObject;

public class WebInput extends BaseCls{
	
	PageObject wiObj;
	
	@Test
	public void testCaseWebInput() {
		wiObj = new PageObject(driver);
		wiObj.webInput("10", "Hello", "Admin@123","10/11/2023");
	}
}
