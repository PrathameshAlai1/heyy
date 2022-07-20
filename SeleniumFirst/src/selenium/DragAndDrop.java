package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","D:\\New folder\\ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement element1=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement element2=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(element1, element2).build().perform();

	}

}
