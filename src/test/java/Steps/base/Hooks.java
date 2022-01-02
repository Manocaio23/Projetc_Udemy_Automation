
package Steps.base;

import static driver.DriverFactory.createDriver;
import static driver.DriverFactory.pegaDriver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static driver.DriverFactory.limpaDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.messages.types.Timestamp;

public class Hooks {
	@Before ()
	public void setup() {
		pegaDriver();
		
	}
	
	// após cada etapa
//	@AfterStep
//	public void CapturaExecaoImagem(Scenario scenario) {
//		if (scenario.isFailed()) {// para cada vez que um cenario falhar
//			Timestamp timestamp = new Timestamp(System.currentTimeMillis(), null);
//			String timeMilesegundos=Long.toString(timestamp.getNanos());
//			
//			byte[] screenshot = ((TakesScreenshot)pegaDriver()).getScreenshotAs(OutputType.BYTES);
//			
//			scenario.attach(screenshot, "image/png", timeMilesegundos);
//			
//		}
	//}

	@After ()
	public void fechar() {
		limpaDriver();
	
	}
}
