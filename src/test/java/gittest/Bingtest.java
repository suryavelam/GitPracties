package gittest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Bingtest {
	@Test
	public void bingtest() {
		
		WebDriver wd = new EdgeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www.bing.com/");
		
		WebElement search =wd.findElement(By.name("q"));
		
		search.sendKeys("chennai");
				
		search.sendKeys(Keys.ENTER);
	}

}
