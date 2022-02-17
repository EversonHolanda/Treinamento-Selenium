package br.gov.caixa.formulario;

import java.io.IOException;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.gov.caixa.base.Base;

public class FormularioBasico extends Base {
	
	WebDriver driver = retornaDriver();

	@BeforeClass()
	public static void acessaUrl() {
		acessaPagina("file://df7390et181/Comp/projeto/Treinamento-selenium%20-%20ProjetoMaven/ConfigurandoProjetoAutomacaoCaixa/05%20-%20formulario-treinamento/02%20-%20formulario-intermediario/index.html");
	}
	
	@After()
	public void fechar() {
		driver.close();
	}
	
	@Test()
	public void realizaCadastro() throws IOException {
		
//		driver.findElement(By.xpath("//*[text()='Próximo']")).click();
//		driver.findElement(By.xpath("/html/body/section/div/form/div[3]/ul/li[2]/a"));
//
//		WebElement textodatela = driver.findElement(By.id("typeTranslation-error"));
//		
//		System.out.println(textodatela.getText());
//	
//		WebElement selectDaPagina = driver.findElement(By.id("typeTranslation"));
//		Select combobox = new Select(selectDaPagina);
//		combobox.selectByVisibleText("Legendagem");

	}

}