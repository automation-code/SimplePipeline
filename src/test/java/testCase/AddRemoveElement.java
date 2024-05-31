package testCase;

import org.testng.annotations.Test;

import pageObjects.BaseCls;
import pageObjects.PageObject;

public class AddRemoveElement extends BaseCls{

	PageObject addRemoveObj;
	
	@Test
	public void addRemoveElementMethod() {
		addRemoveObj = new PageObject(driver);
		addRemoveObj.addAndRemoveElement();
	}
}
