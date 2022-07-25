package autopackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

    public WebDriver driver;
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","dependcies/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
    }
    public void mobiles()
    {
        driver.findElement(By.cssSelector("img[class='_396cs4  _3exPp9']")).click();
    }

    public static void main(String[] args)
    {
        Flipkart obj=new Flipkart();
        obj.setup();
    }


}
