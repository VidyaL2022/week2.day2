package week2.day2;

import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Dropdown.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement elementIndex = driver.findElement(By.id("dropdown1"));
			Select dropdown = new Select(elementIndex);
			dropdown.selectByIndex(2);
			WebElement elementText = driver.findElement(By.name("dropdown2"));
			Select dropdown1 = new Select(elementText);
			dropdown1.selectByVisibleText("Selenium");
			WebElement elementValue = driver.findElement(By.name("dropdown3"));
			Select dropdown2 = new Select(elementValue);
			dropdown2.selectByValue("4");
			WebElement noOfDrodownOptions = driver.findElement(By.xpath("//select[@class='dropdown']"));
			Select select = new Select(noOfDrodownOptions);
			List<WebElement> drop = select.getOptions();
			int count = drop.size();
			System.out.println(count);
			driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("UFT/QTP");
			driver.findElement(By.xpath("(//option[@value='4'])")).click();

	}

}
