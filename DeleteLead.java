package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
public class DeleteLead {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.linkText("Phone")).click();
			driver.findElement(By.name("phoneCountryCode")).sendKeys("2");
			driver.findElement(By.name("phoneAreaCode")).sendKeys("2");
			driver.findElement(By.name("phoneNumber")).sendKeys("86");
			driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
			Thread.sleep(2000);
			 String leadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		 System.out.println(leadId);
		 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
			
			driver.findElement(By.linkText("Delete")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
			driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
			Thread.sleep(2000);
			String result = driver.findElement(By.className("x-paging-info")).getText();
			System.out.println(result);
			if (result .equals("No records to display"))
			{
				System.out.println("The Lead number is deleted");
				}
			else
			{
				System.out.println("Record was not deleted");
			}
			}
			
			
			
			

		}



