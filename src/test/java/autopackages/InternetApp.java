package autopackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class InternetApp {
    public WebDriver driver;
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","dependcies/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
    }
    public void ABtesting()
    {
        driver.findElement(By.cssSelector("a[href='/abtest']")).click();
        driver.navigate().back();
        System.out.println("AB Testing executed");

    }
    public void checkbox()
    {
        driver.findElement(By.cssSelector("input[checked]")).click();
    }
    public void Formauthent()
    {
        driver.findElement(By.cssSelector("a[href='/login']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[class='radius']")).click();
        System.out.println("Form Autentication login successful");
    }
    public void Login()
    {
        driver.findElement(By.cssSelector("a[class='button secondary radius']")).click();
        System.out.println("logout successful");
    }




    public static void main(String args[])
    {
        InternetApp iobj=new InternetApp();
        iobj.setup();
        iobj.ABtesting();
        iobj.checkbox();
        iobj.Formauthent();
        iobj.Login();

    }


}


