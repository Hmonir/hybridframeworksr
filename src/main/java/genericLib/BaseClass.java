package genericLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements Autoconstant {
	public Propertyfile p=new Propertyfile();
	public WebDriver driver;
	public Utilities u=new Utilities();
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException {
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getdata("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeApp(ITestResult r) throws IOException {
	int status =r.getStatus();
	String name = r.getName();
	
	if (status ==2) {
		Photo p=new Photo();
		p.getphoto(driver, name);
	}
		driver.quit();
		
	}
	

}
