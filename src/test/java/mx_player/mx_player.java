package mx_player;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class mx_player extends mx_capabilities{
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void bt() throws MalformedURLException {
		driver=mxplayer_capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
@Test
public void tc1() {
	driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_deny_button")).click();
//	String access=driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/storage_permission_accept")).getText();
//	String text="In order to play video and audio, we need access to media files on your device.";
//	if(access.equals(text))
//	{
//		System.out.println("Permission allowed");
//	}
//	else
//	{
//		System.out.println("permission not allowed");
//	}
//	driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/storage_permission_accept")).click();		
	driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/storage_permission_accept")).click();	
	driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();	
	}		
}
