package ChromeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {
	public void launchBrowser(){
		//driver set
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aaba-PC\\eclipse-workspace\\RedBusSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		/* driver.manage().window().maximize();
		WebElement usernametxt = driver.findElement(By.id("email"));
		usernametxt.sendKeys("aabavanan@gmail.com");
		WebElement passwordtxt = driver.findElement(By.id("pass"));
		passwordtxt.sendKeys("AssasinCreed1!");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		loginbutton.click();*/
	}
		
	public static void main(String[] args){
		LaunchFacebook object = new LaunchFacebook();
		object.launchBrowser();
	}

}
