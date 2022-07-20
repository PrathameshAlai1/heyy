package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Neww {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
	
	driver.findElement(By.id("firstName")).sendKeys("Prathamesh");


}
}
