package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		WebElement x=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select s= new Select(x);
		
		//s.selectByIndex(5);
		s.selectByVisibleText("Baby");
		
		List<WebElement> alloptions=s.getOptions();
		int count=alloptions.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String data=alloptions.get(i).getText();
			System.out.println(data);
		}
		

	}

}
