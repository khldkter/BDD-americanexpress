package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseClass{

	WebElement element;
	
	@Given("user navigate to homePage")
	public void user_navigate_to_home_page() {
		System.out.println("This is Given");
	}

	@When("user input userId")
	public void user_input_user_id() {
		element = driver.findElement(By.xpath("//label[text()='User ID']"));
		element.sendKeys("3478");

		System.out.println("This is When");

	}

	@When("user input password")
	public void user_input_password() {
		element = driver.findElement(By.xpath("//label[text()='Password']"));
		element.sendKeys("9292");

		System.out.println("This is When");
	}

	@When("click cardsandBanking")
	public void click_cardsand_banking() {

		element = driver.findElement(By.xpath("//select[@class='form-control']"));
		element.click();
		System.out.println("This is When");

	}

	@When("click iAgreeCheckBox")
	public void click_i_agree_check_box() {
		element = driver.findElement(By.xpath("//label[@for='rememberMe']"));
		element.click();
		System.out.println("This is When");

	}

	@When("click login")
	public void click_login() {
		element = driver.findElement(By.id("loginSubmit"));
		element.click();
		System.out.println("This is When");

	}

	@When("click forgot password")
	public void click_forgot_password() {
		element = driver.findElement(By.xpath("//a[text()='Forgot User ID or Password?'])[2]\")"));
		element.click();
		System.out.println("This is When");

	}

	@Then("user  will be in about pages")
	public void user_will_be_in_about_pages() throws InterruptedException {
		Thread.sleep(300);
		System.out.println("This is continue pop up ");
	}

}