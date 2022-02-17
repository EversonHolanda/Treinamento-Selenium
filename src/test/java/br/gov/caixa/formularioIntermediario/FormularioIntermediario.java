package br.gov.caixa.formularioIntermediario;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.gov.caixa.base.Base;


public class FormularioIntermediario extends Base {

	WebDriver driver = retornaDriver();
	
	WebDriverWait espera = new WebDriverWait(driver, Duration.ofSeconds(10));

	@BeforeClass
	public static void getDriver() {
		acessaPagina("INFORMAR A PORRA DO CAMINHO DO FORMULÁRIO OU A PAÁGINA QUE DESEJA AUTOMATIZAR");
	}
	
	
	@Test()
	public void realizaSimulacao() {
		clicar(By.xpath("//*[contains(text(),'ximo')]"));

		WebElement msgErro = driver.findElement(By.id("typeTranslation-error"));
		assertEquals("Campo Obrigatório", msgErro.getText());
		
		WebElement selectDaPagina = driver.findElement(By.id("typeTranslation"));
		Select combobox = new Select(selectDaPagina);
		combobox.selectByVisibleText("Legendagem");
		
		WebElement radio = espera.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@for='customRadio2']")));
		radio.click();		
	}
}