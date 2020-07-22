package ChromeAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	private String string;

	public void openRedBus() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aaba-PC\\eclipse-workspace\\RedBusSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		
		//Source
		WebElement fromSource = driver.findElement(By.xpath("//input[contains(@data-message,'Please enter a source city')]"));
		fromSource.sendKeys("Salem");
		
		List<WebElement> sourcelist = driver.findElements(By.xpath("//ul[@class='autoFill']"));
		for (WebElement sourceselection : sourcelist) {
			String sourcefind = sourceselection.getText();
			if(sourcefind.equals("Salem, India")) {
				sourceselection.click();
			}	
		}

		Thread.sleep(2000);
		
		
		//Destination
		WebElement toDestination = driver.findElement(By.xpath("//input[contains(@data-message,'Please enter a destination city')]"));
		toDestination.sendKeys("Chennai");
		
		
		List<WebElement> destlist = driver.findElements(By.xpath("//ul[@class='autoFill']"));
		for (WebElement destselection : destlist) {
			String destfind = destselection.getText();
			if(destfind.equals("Chennai, India")) {
				destselection.click();
			}	
		}
		
		Thread.sleep(2000);
		
		//onward calendar
		WebElement onwarddate = driver.findElement(By.xpath("//label[@for='onward_cal']"));
		onwarddate.click();
		
		WebElement odtable = driver.findElement(By.xpath("(//table[@class=\"rb-monthTable first last\"])[2]"));
		
		List<WebElement> tRows = odtable.findElements(By.tagName("td"));
		for (WebElement i : tRows) {
			String text = i.getText();
			System.out.println(text);
			
			if(text.equals("29")) {
				i.click();
			}
			
		}
		
		//Search bus
		WebElement searchbtn = driver.findElement(By.id("search_btn"));
		searchbtn.click();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		RedBus object = new RedBus();
		object.openRedBus();
	}

}
