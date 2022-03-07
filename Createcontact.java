package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.linkText("Create Contact")).click();
			driver.findElement(By.id("firstNameField")).sendKeys("vidya");
			driver.findElement(By.id("lastNameField")).sendKeys("Sriram");
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("vidhu");
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("L");
			driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
			driver.findElement(By.id("createContactForm_description")).sendKeys("This is my first selenium project");
			driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("vidya3389@gmail.com");
			WebElement elementDd = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
			Select dropdown = new Select(elementDd);
			dropdown.selectByVisibleText("Indiana");
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateContactForm_description")).clear();
			driver.findElement(By.name("importantNote")).sendKeys("This is my first selenium project!!!");
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			String resTitle = driver.getTitle();
			System.out.println(resTitle);

	}

}
