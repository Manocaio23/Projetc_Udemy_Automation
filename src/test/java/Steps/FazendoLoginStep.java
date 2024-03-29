package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
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

public class FazendoLoginStep extends Base_PO  {
	
	private WebDriver driver = pegaDriver();
	
	@Dado("que esteja no site feioso")
	public void que_esteja_no_site_feioso() {
		navegarTo_URL("https://www.webdriveruniversity.com/Login-Portal/index.html?");
		
	}
	@Quando("escrevo o {string}")
	public void escrevo_o(String string) {
		driver.findElement(By.id("text")).sendKeys(string);
	}
	@Quando("a {string}")
	public void a(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}
	@Quando("clico no login")
	public void clico_no_login() {
		driver.findElement(By.id("login-button")).click();
	}
	@Entao("deve aparece um alelert falando sucesso")
	public void deve_aparece_um_alelert_falando_sucesso() {
		 String mensagem = driver.switchTo().alert().getText();
			Assert.assertEquals(mensagem, "validation succeeded");	
	    
	}
	
	// cenario 2 
	
	@E("digito {string}")
	public void digito(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}
	@E("clico no botao login")
	public void clico_no_botao_login() {
		driver.findElement(By.id("login-button")).click();
	}
	@Entao("deve aparece um alelert falando erro")
	public void deve_aparece_um_alelert_falando_erro() {
		String mensagem = driver.switchTo().alert().getText();
		Assert.assertEquals(mensagem, "validation failed");
		
	}
	
	
	
	

}
