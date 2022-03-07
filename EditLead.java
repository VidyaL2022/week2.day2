package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
public class EditLead {

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
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[14]")).sendKeys("vidya");
			driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
			driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10206']")).click();
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			Thread.sleep(2000);
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.name("companyName")).clear();
			driver.findElement(By.name("companyName")).sendKeys("Wipro");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@type='submit'])")).click();
			Thread.sleep(2000);
			WebElement resName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
			String finalName = resName.getText();
			System.out.println(finalName);
			Thread.sleep(2000);
			String obj = "Wipro (10206)";
			if(finalName.equals (obj)) {
				System.out.println("The name changed");
			}
			else {
				System.out.println("The name was not changed");
			}
			driver.close();
			
			
			}

		@SuppressWarnings("unused")
		private static Object C2TA(int i) {
			// TODO Auto-generated method stub
			return null;
	}

}
