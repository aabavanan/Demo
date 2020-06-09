package FirefoxAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchGreenTech {
	
	public void openGreenTech() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Aaba-PC\\eclipse-workspace\\SeleniumAutomation\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		driver.close();
		
	}
	public static void main(String[] args) {
		LaunchGreenTech object = new LaunchGreenTech();
		object.openGreenTech();
	}

}
