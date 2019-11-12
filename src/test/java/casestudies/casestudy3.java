package casestudies;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class casestudy3 {
	WebDriver driver;
	@Given("TestMeApp to be opened in browser")
	public void testmeapp_to_be_opened() {
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://localhost:8083/TestMeApp");
		driver.manage().window().maximize();
		
	}

	@And("Navigate to SignIn")
	public void navigate_to_SignIn_page() {
		driver.findElement(By.xpath("//a[contains(text(),' SignIn')]")).click();
	}

	@And("Enter {string} in username")
	public void enter_in_user_name(String uname) {
		driver.findElement(By.name("userName")).sendKeys(uname);
	}

	@And("enter {string} in password")
	public void enter_password_as(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}
	@And("Click  login button")
	public void click_on_login() {
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@And("Login validated")
	public void login_is_successful() {
		   String expected="Home";
			  String actual=driver.getTitle();
				Assert.assertEquals(actual,expected);
	}
	
	@Then("Click on All categories")
	public void click_on_All_categories() {
	 // driver.findElement(By.xpath("//a[contains(span(),'All categories')]")).click();
	  driver.findElement(By.linkText("All Categories")).click();
	}

	@Then("Click on Electronics")
	public void click_on_Electronics() {
		 driver.findElement(By.linkText("Electronics")).click();
	}

	
	@Then("Click on Headphones")
	public void click_on_Headphones() {
		driver.findElement(By.linkText("Head Phone")).click();
		
	}
	@Then("type {string} in search tab and click on search")
	public void type_in_search_tab_and_click_on_search(String product) {
	 driver.findElement(By.id("pname")).sendKeys(product);
	 Actions act= new Actions(driver);
	 act.sendKeys(Keys.ENTER);
	 //driver.findElement(By.linkText("Search")).click();	("//button[@class='highlight']"));
	// driver.findElement(By.xpath("//button[]")).click();
	}
	
	@Then("Click on Add to Cart")
	public void click_on_Add_to_Cart() {
		driver.findElement(By.linkText("Add to cart")).click();
	}

	@Then("Click on Cart")
	public void click_on_Cart() {
		driver.findElement(By.partialLinkText("Cart")).click();
	}

	@Then("Click on checkout")
	public void click_on_checkout() {
		driver.findElement(By.linkText("Checkout")).click();
	
	  
	}

	@Then("enter shipping address")
	public void enter_shipping_address() {
		
	 driver.findElement(By.xpath("//input[@type='checkbox' and @checked]")).click();
	}

	@Then("Click on procced to pay")
	public void click_on_procced_to_pay() {
		driver.findElement(By.linkText("Proceed to Pay")).click();
	}

}
