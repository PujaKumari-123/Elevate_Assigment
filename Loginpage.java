package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Loginpage {

	
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	// WebElements
    @FindBy(xpath = "(//*[.='My Account'])[4]")
    WebElement accountclick;

    @FindBy(xpath = "(//*[.='Register'])[2]")
    WebElement clickreg;

    @FindBy(css = "#input-firstname")
    WebElement firstname;

    @FindBy(css = "#input-lastname")
    WebElement lastname;

    @FindBy(css = "#input-email")
    WebElement email;

    @FindBy(css = "#input-telephone")
    WebElement telephone;

    @FindBy(css = "#input-password")
    WebElement password;

    @FindBy(css = "#input-confirm")
    WebElement confirmpassword;

    @FindBy(name = "newsletter")
    WebElement radiobutton;

    @FindBy(css = "input[type='submit'][value='Continue']")
    WebElement continueButton;

    // Methods to interact with the page
    public void account() {
        accountclick.click();
    }

    public void registration() {
        clickreg.click();
    }

    public void first(String name) {
        firstname.sendKeys(name);
    }

    public void last(String last) {
        lastname.sendKeys(last);
    }

    public void Email(String mail) {
        email.sendKeys(mail);
    }

    public void Telephone(String tele) {
        telephone.sendKeys(tele);
    }

    public void Password(String pass) {
        password.sendKeys(pass);
    }

    public void Confirmpass(String cnfrmpass) {
        confirmpassword.sendKeys(cnfrmpass);
    }

    public void Button() {
        radiobutton.click();
    }

    public void submitForm() {
        continueButton.click();
    }
}