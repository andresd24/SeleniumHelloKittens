
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;

public class HelloKittens {

    public static void main(String[] args) throws IOException
    {
    	System.out.println("Welcome to Selenium Kittens POC");
    	System.setProperty("webdriver.chrome.driver","ext/ChromeDriver.exe");
    	
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://www.google.com");
	
    	WebElement googleSearchBox = driver.findElement(By.id("lst-ib"));
    	googleSearchBox.sendKeys("kittens");
    	
    	WebElement searchButton = driver.findElement(By.xpath("//button[@aria-label='Buscar con Google']"));
    	searchButton.click();
    	
    	try {
    	    Thread.sleep(2000);                 
    	} catch(InterruptedException ex) {
    	    Thread.currentThread().interrupt();
    	}
    	
    	System.out.println("Finishing test");
    	driver.close();
    	
    }
}
