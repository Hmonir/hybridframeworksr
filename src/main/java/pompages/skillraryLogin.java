package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryLogin {
	
	//Page elements declaration
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gears;
	
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value=\"go\"]")
	private WebElement go;
	
	// Page initiation
	public skillraryLogin(WebDriver driver) {
	 PageFactory.initElements(driver,this);
	}
	
	// Method declaration
	public void gearsbtn() {
		gears.click();
	}
		
	public void srdemoapp() {
		demoapp.click();
	}
	
	public void searchcourse(String coursename) {
		searchtb.sendKeys(coursename);
		go.click();
	}
	
	
	
}
