package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Sriraman");
		driver.findElement(By.xpath("(//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input)[1]")).sendKeys("Vidya");
		driver.findElement(By.name("reg_email__")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("asdf@123");
		WebElement elementDate = driver.findElement(By.id("day"));
		Select date = new Select(elementDate);
		date.selectByIndex(2);
		WebElement elementMonth = driver.findElement(By.id("month"));
		Select month = new Select(elementMonth);
		month.selectByIndex(2);
		WebElement elementYear = driver.findElement(By.id("year"));
		Select year = new Select(elementYear);
		year.selectByVisibleText("1989");
		WebElement radiobtn= driver.findElement(By.xpath("//input[@value='1']"));
		radiobtn.click();
	}

}
