package br.gov.caixa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.gov.caixa.driver.Driver;

public class Base {
	
	static WebDriver driver = Driver.getDriver();
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	
	public WebDriver retornaDriver() {
		return driver;
	}
	
	public static void acessaPagina(String url) {
		driver.get(url);
	}
	
}
