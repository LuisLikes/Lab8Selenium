package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PrimeraPrueba {
	public static void main (String[] args) throws InterruptedException {
	System.setProperty(
			"webdriver.edge.driver",
			"C://Selenium/msedgedriver.exe"
	);
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.com/");
	//inserta tu código aquí
	Thread.sleep(3500);
	driver.findElement(By.cssSelector("div.a-section.glow-toaster input")).click();
	driver.findElement(By.cssSelector("div#nav-xshop a")).click();
	Thread.sleep(5000);
	 driver.quit();
	}

}
