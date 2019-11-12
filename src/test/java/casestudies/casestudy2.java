package casestudies;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class casestudy2 {
	WebDriver driver;
	@Given("TestMeApp to be opened")
	public void testmeapp_to_be_opened() {
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://localhost:8083/TestMeApp");
		driver.manage().window().maximize();
	}

	@And("Navigate to SignIn page")
	public void navigate_to_SignIn_page() {
		driver.findElement(By.xpath("//a[contains(text(),' SignIn')]")).click();
	}

	@And("Enter {string} in user name")
	public void enter_in_user_name(String uname) {
		driver.findElement(By.name("userName")).sendKeys(uname);
	}

	@And("enter password as {string}")
	public void enter_password_as(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}
	@And("Click on login")
	public void click_on_login() {
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@And("Login is successful")
	public void login_is_successful() {
		   String expected="Home";
			  String actual=driver.getTitle();
				Assert.assertEquals(actual,expected);
	}


}
