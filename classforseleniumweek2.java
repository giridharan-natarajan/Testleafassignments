package Week2;
 import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class classforseleniumweek2 {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.findElement(By.id("username")).sendKeys("demosalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tcs");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("giri");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dharan");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("jbkvdvbs");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Devolopment");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("kjcidhvdkjdb");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("giridharan123@gnail.com");
		 driver.findElement(By.className("smallSubmit")).click();
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 
		 
		 		 }

}
