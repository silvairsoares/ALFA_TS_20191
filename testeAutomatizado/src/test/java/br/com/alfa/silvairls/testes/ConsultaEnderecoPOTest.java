package br.com.alfa.silvairls.testes;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import br.com.alfa.silvairls.InstanciaDriver;
import br.com.alfa.silvairls.paginas.PaginaConsultaCep;
import br.com.alfa.silvairls.paginas.PaginaResultadoConsulta;

public class ConsultaEnderecoPOTest {

	WebDriver driver;
	PaginaConsultaCep consulta;
	PaginaResultadoConsulta resultadoConsulta;

	@Test
	public void setup() {
		this.driver = InstanciaDriver.getDriver();
		consulta = new PaginaConsultaCep(driver);
		resultadoConsulta = new PaginaResultadoConsulta(driver);		
	}
	
	@Test
	public void consultaPorCep() {
		consulta.informarCep("74393580");
		consulta.consultar();
		Assert.assertTrue(resultadoConsulta.getGridResultadoConsulta().getText().contains("Rua SR 17"));
		driver.close();
	}

}