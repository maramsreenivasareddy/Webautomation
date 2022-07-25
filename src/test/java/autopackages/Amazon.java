package autopackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
   public WebDriver driver;
   public void setup()
   {
       System.setProperty("webdriver.chrome.driver","dependcies/chromedriver.exe");
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in");
   }
   public void mobiles()
   {
       driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_2']")).click();
       driver.findElement(By.xpath("//span[text()='OnePlus']/preceding::i[@class='a-icon a-icon-checkbox'][1]")).click();
       driver.findElement(By.id("low-price")).sendKeys("20000");
       driver.findElement(By.id("high-price")).sendKeys("60000");
       driver.findElement(By.cssSelector(".a-button-input")).click();
   }

   public static void main(String args[])
   {
       Amazon aobj=new Amazon();
       aobj.setup();
       aobj.mobiles();

   }

}
