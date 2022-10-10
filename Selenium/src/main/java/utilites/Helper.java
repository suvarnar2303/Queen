package utilites;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	WebDriver driver;
	public static String captureScreenShot(WebDriver driver) throws IOException
	{
		String ScreenShotpath=System.getProperty("user.dir")+"Report"+getCurrentdateTime()+".png";
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		 File dst=new File("./Report/"+getCurrentdateTime()+".png");
		FileHandler.copy(src, dst);
		System.out.println("ScreenShot Capture");
		return ScreenShotpath;
	}
	
	public static void handleFrames()
	{
		
	}
   public static void handlealert()
   {
	   
   }
   public static void Action()
   {
	   
   }
   public static void DisableElement()
   {
	   
   }
   public static String getCurrentdateTime()
   {
	   SimpleDateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	        Date currentDate = new Date();
			 return customFormat.format(currentDate);
   }
}
