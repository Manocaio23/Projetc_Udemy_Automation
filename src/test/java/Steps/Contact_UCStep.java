package Steps;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObjects.Base_PO;

import static driver.DriverFactory.createDriver;
import static driver.DriverFactory.pegaDriver;
import static driver.DriverFactory.limpaDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Contact_UCStep  extends Base_PO {
	 
private WebDriver driver = pegaDriver();

	
	
	@Dado("esteja no site para cadastrar os dados")
	public void esteja_no_site_para_cadastrar_os_dados() {
	   navegarTo_URL("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
	   
	}

	@Quando("escrevo o primeiro nome")
	public void escrevo_o_primeiro_nome() {
	    driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]")).sendKeys("AutoFN_"+ gerandoNumeroAleatorio(5));
	}

	@E("em seguida escrevo o sobrenome")
	public void em_seguida_escrevo_o_sobrenome() {
	    driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]")).sendKeys("AutoPL_"+ gerandoNumeroAleatorio(5));
	    
	}

	@E("preencho o e-mail")
	public void preencho_o_e_mail() {
	    driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]")).sendKeys("AutoEmail_"+ gerandoNumeroAleatorio(10)+"@gmail.com");
	    
	    
	}

	@E("Faco comentario")
	public void faco_comentario() {
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea")).sendKeys("Comments_"+gerandoRandomAleatorio(20));
		
	}

	@E("clico no botao Submit")
	public void clico_no_botão_submit() {
	    driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]")).click();
	}

	@Entao("visualizo as opcoes")
	public void visualizo_as_opcoes() {
	    WebElement validacao=  driver.findElement(By.xpath("//*[@id=\"contact_reply\"]/h1"));
	    Assert.assertEquals(validacao.getText(), "Thank You for your Message!");
	}
	
	@Quando("escrevo o primeiro {string}")
	public void escrevo_o_primeiro(String string) {
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]")).sendKeys(string);
	}

	@E("em seguida escrevo o {string}")
	public void em_seguida_escrevo_o(String string) {
		 driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]")).sendKeys(string);
	}

	@E("preencho o {string}")
	public void preencho_o(String string) {
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]")).sendKeys(string);
	}

	@E("Faco comentario {string}")
	public void faco_comentario(String string) {

		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea")).sendKeys(string);
	}
}
