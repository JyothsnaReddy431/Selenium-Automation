package TestNGListeners;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class SceenshortTest extends Base {
	
	
	@BeforeMethod
	
	public void setup() {
		initilization();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test
	
	public void TakeScreenshotTest() {
		Assert.assertEquals(false, true);
	}
	
	
	
	
}
