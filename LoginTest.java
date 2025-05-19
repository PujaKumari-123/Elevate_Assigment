package TestScript;

import org.testng.annotations.Test;

import PageClasses.Loginpage;
import baseClass.BaseClass;

public class LoginTest extends BaseClass{
	
	@Test
	public void loginwithvalidcredentials() {
		
		Loginpage login = new Loginpage(driver);
		login.account();
		login.registration();
		login.first("John");
		login.last("Doee");
		login.Email("johndoee1234@gmail.com");
		login.Telephone("9123456789");
		login.Password("12345abc");
		login.Confirmpass("12345abc");
		login.Button();
		login.submitForm();
	}
	
	@Test
	public void loginwithInvalidcredentials() {
		
		Loginpage login = new Loginpage(driver);
		login.account();
		login.registration();
		login.first("John");
		login.last("Doe");
		login.Email("johndoee1234@gmail.com");
		login.Telephone("9123456");
		login.Password("12345abc");
		login.Confirmpass("12345abc");
		login.Button();
		login.submitForm();
	}

}
