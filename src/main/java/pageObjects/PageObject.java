package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageObject {

	WebDriver driver;

	public PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Web inputs')]")
	WebElement lnkWebInput;

	@CacheLookup
	@FindBy(xpath = "//input[@id='input-number']")
	WebElement txtInputNumber;

	@CacheLookup
	@FindBy(xpath = "//input[@id='input-text']")
	WebElement txtInputText;

	@CacheLookup
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtInputPassword;

	@CacheLookup
	@FindBy(xpath = "//input[@id='input-date']")
	WebElement txtInputDate;

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Add/Remove Elements')]")
	WebElement lnkAddRemoveElement;

	@CacheLookup
	@FindBy(xpath = "//button[contains(text(),'Add Element')]")
	WebElement txtAddElement;

	@CacheLookup
	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	WebElement txtDelete;

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Notification Message')]")
	WebElement lnkNotificationMessage;

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Click here')]")
	WebElement lnkClickHere;

	@CacheLookup
	@FindBy(xpath = "//div[@id='flash']//b")
	WebElement txtMessage;

	@CacheLookup
	@FindBy(xpath = "//b[contains(text(),'Action unsuccessful, please try again')]")
	WebElement lnkActionUnsuccessful;

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Dynamic Table')]")
	WebElement lnkDynamicTable;

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'My Browser Information')]")
	WebElement lnkMyBrowserInformation;

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Radio Buttons')]")
	WebElement lnkRadioButton;

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Drag and Drop')]")
	WebElement lnkDragAndDrop;

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Drag and Drop Circles')]")
	WebElement lnkDragAndDropCircles;

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Login Form')]")
	WebElement lnkLoginForm;

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Forgot Password')]")
	WebElement lnkForgotPassword;

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Basic Authentication (user and pass: admin)')]")
	WebElement lnkBasicAuthentication;

	public void webInput(String inputNumber, String inputText, String inputPassword, String inputDate) {
		lnkWebInput.click();
		txtInputNumber.sendKeys(inputNumber);
		txtInputText.sendKeys(inputText);
		txtInputPassword.sendKeys(inputPassword);
		txtInputDate.sendKeys(inputDate);
	}

	public void addAndRemoveElement() {
		lnkAddRemoveElement.click();
		for (int i = 1; i <= 5; i++) {
			txtAddElement.click();
		}
		txtDelete.click();
	}

	public void notificationMessageMethod() {
		lnkNotificationMessage.click();
		lnkClickHere.click();
		String expTxt = txtMessage.getText();
		String msgSuccessTxt = "Action successful", msgUnsuccessTxt = "Action unsuccessful, please try again";
		if (expTxt.equals(msgSuccessTxt)) {
			Assert.assertEquals(msgSuccessTxt, expTxt, "Action successful");
		} else if (expTxt.equals(msgUnsuccessTxt)) {
			Assert.assertEquals(msgUnsuccessTxt, expTxt, "Action unsuccessful, please try again");
		}
	}

	public void dynamicTableMethod() throws Exception {
		lnkDynamicTable.click();
		for (int row = 1; row <= 3; row++) {
			String path = "//table[@class='table table-striped']//tr[" + row + "]";
			String tableData = driver.findElement(By.xpath(path)).getText();
			Thread.sleep(2000);
			System.out.println(tableData);
		}
	}
}
