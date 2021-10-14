package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;

	@Before
    public void beforeScenario(){
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
    	driver = new ChromeDriver();
    }	
	
	@After
    public void afterScenario(){
        //driver.close();
    }

}
