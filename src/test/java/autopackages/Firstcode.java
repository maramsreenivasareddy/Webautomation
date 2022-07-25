package autopackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstcode {
    public WebDriver driver;
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","dependcies/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");


    }
    public static void main(String args[])
    {
        Firstcode fobj=new Firstcode();
        fobj.setup();

    }



}
