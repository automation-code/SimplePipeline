package testCase;

import org.testng.annotations.Test;
import pageObjects.BaseCls;
import pageObjects.PageObject;

public class DynamicTable extends BaseCls{
	
	PageObject tblObj;
	
	@Test
	public void dynamicTableMethod() throws Exception {
		tblObj = new PageObject(driver);
		tblObj.dynamicTableMethod();
	}
}
