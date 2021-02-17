package testsscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.DemoappLogin;
import pompages.Facebook;
import pompages.Testing;
import pompages.skillraryLogin;

public class Facebooklike extends BaseClass {
	
	@Test
	public void like() throws FileNotFoundException, IOException {
		skillraryLogin s=new skillraryLogin(driver);
		s.gearsbtn();
		s.srdemoapp();
		u.switchingtab(driver);
		DemoappLogin d=new DemoappLogin(driver);
		u.dropDown(d.getCouredd(),p.getdata("coursedd"));
		Testing t=new Testing(driver);
		t.facebooklogo();
		Facebook f=new Facebook(driver);
		f.likebtn();
	}

}
