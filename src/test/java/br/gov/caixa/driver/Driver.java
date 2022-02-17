package br.gov.caixa.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\desenvolvimento\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
