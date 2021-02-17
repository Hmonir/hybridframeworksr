package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submitbtn;
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart']")
	private WebElement addtocarticon;
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	private WebElement gotocart;
	

   public AddtoCart(WebDriver driver) {
	   PageFactory.initElements(driver,this);   
   }
   
   public void submittocart() {
	   submitbtn.click();
	   
   }
   
   public void addtocartbtn() {
	   addtocarticon.click(); 
   }
   
   public void gotocartbtn() {
	   gotocart.click();
   }

public WebElement getAddbtn() {
	return addbtn;
}
   
}