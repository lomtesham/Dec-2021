package part1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lomte Sir\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.navigate().to("https://demoqa.com/text-box");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    Actions actions=new Actions(driver);
	    
	    driver.findElement(By.id("userName")).sendKeys("Sham Madhukar Lomte");
	    
	    actions.sendKeys(Keys.TAB).perform();
	    actions.sendKeys("lomtesham@gmail.com");
	    
	    actions.sendKeys(Keys.TAB).perform();
	    actions.sendKeys("A/p Jawala(Bk) Tq and dis latur");
	    
	    actions.keyDown(Keys.CONTROL);
	    actions.sendKeys("a");
	    actions.keyUp(Keys.CONTROL);
	    actions.build().perform();
	    
	    actions.keyDown(Keys.CONTROL);
	    actions.sendKeys("c");
	    actions.keyUp(Keys.CONTROL);
	    actions.build().perform();
	    
	    actions.sendKeys(Keys.TAB).perform();
	    actions.keyDown(Keys.CONTROL);
	    actions.sendKeys("v");
	    actions.keyUp(Keys.CONTROL);
	    actions.build().perform();
	    

	    actions.sendKeys(Keys.TAB).perform();

	    actions.sendKeys(Keys.ENTER).perform();
	    
	    
	}

}
