package testcases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utilites.BrowserFactory;
import utilites.Config_DataProvider;
import utilites.ExcelDataprovider;
import utilites.Helper;
import utilites.ManageReport;

public class Base_Test {
    public WebDriver driver;
    public  ExcelDataprovider excel;
    public ExtentReports report;
    public Config_DataProvider configData;
    public ExtentTest logger;
    
  @BeforeSuite  
  public  void setUpSuite()
  {
	  Reporter.log("Setting up Report and Test Started", true);
	  excel=new ExcelDataprovider();
	  configData=new Config_DataProvider();
	  String path = System.getProperty("user.dir")+"\\Report\\index.html";
		ExtentSparkReporter rep=new ExtentSparkReporter(path);
		rep.config().setDocumentTitle("Test result");
		rep.config().setReportName("WebAutomation testing");
		report=new ExtentReports();
		report.attachReporter(rep);
	       report.setSystemInfo("Tester","ravi kiran");
	 	  Reporter.log("all configuration is done test will run", true);
  }
	@BeforeClass
	public void OpenApp() {
		  Reporter.log("Browser will ready to start and application will lanch", true);
	driver=BrowserFactory.startApp(driver,  "Firefox", "https://www.amazon.com" );
	}
	
	
	@AfterClass
      public void teardown()
      {
    	  BrowserFactory.quitBrowser(driver);
      }
	@AfterMethod
	public void teardownMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.captureScreenShot(driver);
			logger.fail("Test failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenShot(driver)).build());
		}
	     report.flush();
		  Reporter.log("Report is ready go and see in report folder", true);
	}
}
