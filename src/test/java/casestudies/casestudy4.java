package casestudies;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class casestudy4 {
	WebDriver driver;
	@Given("TestMeApp should be opened")
	public void testmeapp_should_be_opened() {
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://localhost:8083/TestMeApp");
		driver.manage().window().maximize();
	}

	@Then("Move to SignIn")
	public void move_to_SignIn() {
		driver.findElement(By.xpath("//a[contains(text(),' SignIn')]")).click();
	}

	@Then("{string} in username")
	public void in_username(String uname) {
		driver.findElement(By.name("userName")).sendKeys(uname);
	}

	@Then("{string} in password")
	public void in_password(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@Then("Now Click on login button")
	public void now_Click_on_login_button() {
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("Login is validated")
	public void login_is_validated() {
		 String expected="Home";
		  String actual=driver.getTitle();
			Assert.assertEquals(actual,expected);
	}

	@Then("now  Click on All categories")
	public void now_Click_on_All_categories() {
		  driver.findElement(By.linkText("All Categories")).click();
	}

	@Then("now Click on Electronics")
	public void now_Click_on_Electronics() {
		 driver.findElement(By.linkText("Electronics")).click();
	}

	@Then("now Click on Headphones")
	public void now_Click_on_Headphones() {
		driver.findElement(By.linkText("Head Phone")).click();
	}
	@Then("check cart on page")
	public void check_cart_on_page() {
	 //Assert.assertFalse(driver.findElement(By.linkText("Cart")));
		  
	}


}
