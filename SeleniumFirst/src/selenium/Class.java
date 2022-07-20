package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone13"+Keys.ENTER);
		Thread.sleep(5000);
		
		String mainWindowID=driver.getWindowHandle();
		System.out.println(mainWindowID);
		
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 128 GB)']")).click();
		
        Set<String>allWindowsIDs=driver.getWindowHandles();
        
        for(String c:allWindowsIDs)       // c=ID1    c=ID2  c=ID3
        {
        System.out.println(c);

        if(mainWindowID.equals(c))
        {
        System.out.println("I am on main windows");
        }
        else
        {
        System.out.println("I am on child windows");
        driver.switchTo().window(c);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
        System.out.println("I am able to click on add to cart");
        Thread.sleep(3000);
        //driver.close();
        }
        }
        Thread.sleep(3000);
        driver.switchTo().window(mainWindowID);
        //driver.quit();
        }
}

