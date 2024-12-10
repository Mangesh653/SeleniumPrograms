package seleniumPrograms;

//linkText is prepared than partial linkText
// TagName and className these loactors used find multiple webelement

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorDemo1 {

	public static void main(String[] args) {

     System.setProperty("webdriver.edge.driver","G:\\DRIVERS\\edgedriver_win64\\msedgedriver.exe");
     WebDriver driver=new EdgeDriver();
     
     driver.get("https://practice.expandtesting.com/");
		
	 driver.manage().window().maximize();
		
	 driver.findElement(By.className("nav-link p-2")).click();
		
		
		
		
		

	}

}
