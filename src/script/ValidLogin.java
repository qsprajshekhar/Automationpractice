package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class ValidLogin extends BaseTest {
	
	@Test
	public void TestLogin()
	{
	/*	String un=Excel.getData(XL_PATH, "ValidLogin", 1, 0);
		String pw=Excel.getData(XL_PATH, "ValidLogin", 1, 1);
		String eTitle=Excel.getData(XL_PATH, "ValidLogin", 1, 2);*/
		

		LoginPage l=new LoginPage(driver);
		
		l.clickonholiday();

		
	}

	
}
