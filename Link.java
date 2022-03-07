package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("home")).click();
		WebElement valueX = driver.findElement(By.id("position"));
		int locationX = valueX.getLocation().getX();
		System.out.println(locationX);
		int locationY = valueX.getLocation().getY();
		System.out.println(locationY);
		System.out.println(driver.findElement(By.linkText("What color am I?")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.id("size")).getSize());

	}

}
