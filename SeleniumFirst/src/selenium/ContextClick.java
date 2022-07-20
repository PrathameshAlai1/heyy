package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	public static void main (String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\ChromeDriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	WebElement x=driver.findElement(By.xpath("//span[text()='right click me']"));
	Thread.sleep(3000);
	Actions action=new Actions(driver);
    action.contextClick(x).build().perform();
	
	driver.findElement(By.xpath("//span[text()='Edit']")).click();
	Thread.sleep(3000);
	String y=driver.switchTo().alert().getText();
	System.out.println(y);
	
	driver.switchTo().alert().accept();
	System.out.println("accepted");		
}
}