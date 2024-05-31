package testCase;

import org.testng.annotations.Test;
import pageObjects.BaseCls;
import pageObjects.PageObject;

public class NotificationMessage extends BaseCls{
	
	PageObject nmObj;
	
	@Test
	public void notificationMessage() {
		nmObj = new PageObject(driver);
		nmObj.notificationMessageMethod();
	}
}
