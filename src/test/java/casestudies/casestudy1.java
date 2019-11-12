package casestudies;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class casestudy1 {
WebDriver driver;
	@Given("enter the url of TestMeApp page")
	public void enter_the_url_of_TestMeApp_page() {
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://localhost:8083/TestMeApp");
		driver.manage().window().maximize();
	}

	@And("Navigate to sign up page")
	public void navigate_to_sign_up_page() {
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//a[contains(text(),' SignUp')]")).click();
	}

	@And("Enter user name as {string}")
	public void enter_user_name_as(String uname) {
	    driver.findElement(By.name("userName")).sendKeys(uname);;
	}

	@And("Enter first name as {string}")
	public void enter_first_name_as(String fname)  {
		driver.findElement(By.name("firstName")).sendKeys(fname);
	
	}

	@And("Enter Last name as {string}")
	public void enter_Last_name_as(String lname){
	   
		driver.findElement(By.name("lastName")).sendKeys(lname);
		
	}

	@And("Enter the password as {string}")
	public void enter_the_password_as(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
		
	}

	@And("confirm the password as {string}")
	public void confirm_the_password_as(String pwdc) {
		driver.findElement(By.name("confirmPassword")).sendKeys(pwdc);
		
	}

	@And("select Gender")
	public void select_Gender() {
		driver.findElement(By.xpath("//input[contains(@value,'Female')]")).click();
	}

	@And ("Enter mail id as {string}")
	public void enter_mail_id_as(String email){
		driver.findElement(By.name("emailAddress")).sendKeys(email);
		
	}

	@And("Enter mobile number {string}")
	public void enter_mobile_number(String mno)  {
		driver.findElement(By.name("mobileNumber")).sendKeys(mno);
		
	}

	@And("Enter DOB as {string}")
	public void enter_DOB_as(String dob) {
		driver.findElement(By.name("dob")).sendKeys(dob);
		
	}

	@And("enter address {string}")
	public void enter_address(String address){
		driver.findElement(By.name("address")).sendKeys(address);
		
	}

	@And("enter security Question")
	public void enter_security_Question() {
		driver.findElement(By.xpath("//select[@id='securityQuestion']/option[1]"));
	}

	@And("Enter the answer of security question as {string}")
	public void enter_the_answer_of_security_question_as(String ans) {
		driver.findElement(By.name("answer")).sendKeys(ans);
		
	}

	@And("Click on register")
	public void click_on_register() {
	   driver.findElement(By.xpath("//input[@value='Register']")).click();
	}


	@Then("Registration is successful")
	public void registration_is_successful() {
	    String expected="Login";
	  String actual=driver.getTitle();
		Assert.assertEquals(actual,expected);
	}


	
}
