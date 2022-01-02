package PageObjects;


import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverFactory;


public class Base_PO {


	public Base_PO() {
		PageFactory.initElements(pegaDriver(), this);
	}
	
	public WebDriver pegaDriver() {
		return DriverFactory.pegaDriver();		
		}
	
	//metodo para navegar para qualquer site por paramentro 
	public void navegarTo_URL(String url) {
		pegaDriver().get(url);
	}
	
	// metodo que vai pegar todo sendkey e escrever
//	public void sendkeys(By by, String textToType) {
//		WebDriverWait wait= new WebDriverWait(pegaDriver(),Duration.ofSeconds(10));
//		
//	}
	
	public String gerandoNumeroAleatorio(int length) {
		return RandomStringUtils.randomNumeric(length);
	} 
	
	public String gerandoRandomAleatorio(int length) {
		return RandomStringUtils.randomAlphabetic(length);
	}
	
	
}


