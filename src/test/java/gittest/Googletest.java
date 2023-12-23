package gittest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Googletest {

	static WebDriver wd ;
	@Test
	public void chrome() throws IOException {
		
		wd = new ChromeDriver();
		
		wd.manage().window().maximize();
		
		wd.get("https://www.google.com/");
		
		//WebElement search =wd.findElement(By.name("q"));
		
		//search.sendKeys("chennai");
		
		//search.sendKeys(Keys.ENTER);
		//search.submit();
		String xpsearch ="//textarea[@name='q']";
		sendkey(xpsearch, "chennai");
		
		
		
		File src =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("C:\\Users\\pcx\\eclipse-workspace\\GitPractics\\Screenshort\\google.png"));
		
		
	}
	
	public static WebElement elementbyxpath(String ele) {
		
		return wd.findElement(By.xpath(ele));
		
		
	}
	
	public static void sendkey( String ele ,String Strtext) {
		
		WebElement newele= 	elementbyxpath(ele);
		
		newele.sendKeys(Strtext);
		
	}
}
