package testsscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.CoreJavaTraining;
import pompages.Selenium;
import pompages.skillraryLogin;

public class Takecourse extends BaseClass {
	@Test
	public void takejavaCourse() throws FileNotFoundException, IOException, InterruptedException {
		skillraryLogin s=new skillraryLogin(driver);
		s.searchcourse(p.getdata("cn"));
		Selenium s1=new Selenium(driver);
		s1.corejavaCourse();
		CoreJavaTraining c=new CoreJavaTraining(driver);
		u.frame(driver);
		c.playvideo();
		u.switchbacktoFrame(driver);
		c.takecourse();
		u.verify(driver,p.getdata("resultpage"),"login");
		
		
		
		
	}

}
