package driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {
private static ThreadLocal<WebDriver> webDriver= new ThreadLocal<>();
	
	//metodo que vai pegar nosso driver
	public static WebDriver pegaDriver() {
		if (webDriver.get()==null) {
			webDriver.set(createDriver());
				}
		return webDriver.get();
	}
	public static WebDriver createDriver() {
	WebDriver driver=null;
		
		//String browserType ="chrome";
	
		// essa logica começa com o drive sendo nulo e ao percorrer o case ela ganha o valor desejado
		//lembrando que agora estou usando um metodo da propriedade para gerar qual navegador vai ser usado
		switch (escolheBrowser()) {
		case "chrome" : {
			System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
			ChromeOptions chormeoptions = new ChromeOptions();
			chormeoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver= new ChromeDriver(chormeoptions);
			break;
		}
		case "firefox" :{
			System.setProperty("webdriver.gecko.driver", "chromedriver/geckodriver.exe");
		FirefoxOptions firefoxoptions = new FirefoxOptions();
		firefoxoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver= new FirefoxDriver(firefoxoptions);
			break;
		}
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	private static String escolheBrowser()  {
		String browserType=null;
		try {
			
			Properties 	properties= new Properties();
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/main//java/Propriedades/config.properties");
			properties.load(file);
			browserType=properties.getProperty("browser").toLowerCase().trim();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		return browserType;
		
	} 
	
	//deruma e limpa o driver
	public static void limpaDriver() {
		webDriver.get().quit();
		webDriver.remove();
	}
}
