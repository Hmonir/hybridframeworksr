package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoappLogin {
	
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(name="addresstype")
	private WebElement couredd;

	public WebElement getCouredd() {
		return couredd;
	}


	public WebElement getCoursetab() {
		return coursetab;
	}
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	
	public DemoappLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void seleniumcourse() {
		seleniumtraining.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
