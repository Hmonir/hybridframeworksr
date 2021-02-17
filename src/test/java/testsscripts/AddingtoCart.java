package testsscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.AddtoCart;
import pompages.DemoappLogin;
import pompages.skillraryLogin;

public class AddingtoCart extends BaseClass {
	
	@Test
	public void addingtoCart() throws FileNotFoundException, IOException {
		skillraryLogin s=new skillraryLogin(driver);
	    s.gearsbtn();
	    s.srdemoapp();
	    u.switchingtab(driver);
	    
	    DemoappLogin l=new DemoappLogin(driver);
	    u.mouseHover(driver,l.getCoursetab());
	    l.seleniumcourse();
	    
	    AddtoCart a=new AddtoCart(driver);
	    u.doubleClickS(driver,a.getAddbtn());
	    a.submittocart();
	    u.alertpopup(driver);
	    a.addtocartbtn();
	    a.gotocartbtn();
	    
	    Assert.assertEquals(driver.getTitle(),p.getdata("title"));
		
		
		
		
	}

}
