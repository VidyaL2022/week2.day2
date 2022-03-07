package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditButtons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("email")).sendKeys("vidya3389@gmail.com");
		driver.findElement(By.xpath("(//input[@value='Append '])")).sendKeys("Testleaf");
	    System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		driver.findElement(By.xpath("(//input[@name = 'username'])[2]")).clear();
		WebElement result = driver.findElement(By.xpath("(//input[@type = 'text'])[5]"));
		if(result.isEnabled()) {
			System.out.println("The text box is enabled");
		}
		else {
			System.out.println("It is disabled");
		}

	}

}
