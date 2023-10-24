package apptest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class NewTest {
  @Test
  public void f() throws MalformedURLException, InterruptedException {
	  AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\subes\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
	  service.start();
	  UiAutomator2Options option= new UiAutomator2Options();
	  option.setDeviceName("subesh_dev");
	  option.setApp("C:\\Users\\subes\\eclipse-workspace\\Appiumtest\\src\\resources\\General-Store.apk");
	 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);
    //locator id , name , class, accessibilityId, androidUIAutomator  
	// driver.findElement(AppiumBy.accessibilityId(""));
	 
	 //driver.findElement(AppiumBy.androidUIAutomator(""));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Thread.sleep(5000);
	 driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("subesh");
	 driver.findElement(By.className("android.widget.Button")).click();
	//String re= driver.findElement(By.id("	\n"+ "com.androidsample.generalstore:id/toolbar_title")).getText();
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView(text(\"PG 3\"));"));
	
	//Assert.assertEquals(re,"Products");
	// driver.quit();
     //service.stop();
  
  }
}
