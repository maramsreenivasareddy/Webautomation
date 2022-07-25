package autopackages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fheroku {
    public WebDriver driver;
    public void setup()
    {
        System.setProperty("webdriver.gecko.driver","dependcies/geckodriver.exe");
        driver= new FirefoxDriver();
        driver.get("https://www.amazon.in/");
    }
    public static void main(String[] args)
    {
        Fheroku fobj=new Fheroku();
        fobj.setup();
    }


}
