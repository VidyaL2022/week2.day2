package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
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
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		String leadName = driver.findElement(By.linkText("Nafisa")).getText();
		System.out.println(leadName);
		driver.findElement(By.linkText("Nafisa")).click();
		WebElement duplicateTitle = driver.findElement(By.className("subMenuButton"));
		duplicateTitle.click();
		String resultTitle = driver.getTitle();
		driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
	    System.out.println(resultTitle);
	    if(resultTitle.equals("Duplicate Lead | opentaps CRM")) {
	    	System.out.println("The title of page is same as captured title");
	    }
	    else {
	    	System.out.println("The title of page is not matched");
	    }
	    driver.close();
	    
		
		//String printTitle = driver.findElement(By.className("subMenuButton")).getTitle();
		//System.out.println(printTitle);
		
		
		//driver.findElement(By.linkText("Email")).click();
		//driver.findElement(By.linkText("Email")).click();
		//driver.findElement(By.linkText("Email")).click();
		//driver.findElement(By.linkText("Email")).click();
		

	}

	@SuppressWarnings("unused")
	private static String getTitle(WebElement duplicateTitle) {
		// TODO Auto-generated method stub
		return null;
	}

	}

