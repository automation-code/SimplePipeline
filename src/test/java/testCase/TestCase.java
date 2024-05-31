package testCase;

import org.testng.annotations.Test;

import pageObjects.BaseCls;
import pageObjects.PageObject;

public class TestCase extends BaseCls{
	
	PageObject obj = new PageObject(driver);
	
	@Test(priority = 1)
	public void addRemoveElementMethod() {
		obj.addAndRemoveElement();
	}
	
	@Test(priority = 2)
	public void dynamicTableMethod() throws Exception {
		obj.dynamicTableMethod();
	}
	
	@Test(priority = 3)
	public void notificationMessage() {
		obj.notificationMessageMethod();
	}

}
