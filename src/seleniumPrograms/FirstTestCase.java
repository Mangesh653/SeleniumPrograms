package seleniumPrograms;

import org.openqa.selenium.By;

//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver","G:\\DRIVERS\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();	
		
		
		String acttitle=driver.getTitle();    //actual title
		System.out.println(acttitle);
		
		String exptitle="OrangeHRM";
		
		if(acttitle.equals(exptitle))
		{
			System.out.println("Test passed");
		}
		
		else
		{
			System.out.println("Test failed");
		}
		
		
		//driver.close();
		
		driver.quit();
		
		
	}

}
