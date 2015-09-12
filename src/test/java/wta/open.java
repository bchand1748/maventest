package wta;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class open {
	


@Test
public void openBrowser()
{
	FirefoxDriver driver =new FirefoxDriver();
	driver.get("http://www.google.com");
}


}
