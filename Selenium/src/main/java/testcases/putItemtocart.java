package testcases;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

import pages.SearchItems;

public class putItemtocart extends Base_Test {
	
	@Test
	public void login() throws InterruptedException {
		
		 logger = report.createTest("search the product");
	         SearchItems Sea = new SearchItems(driver);
	         logger.info("Start enter the item");
	         Sea.Search("Shoes for men");
	         Sea.submit();
	        logger.info("submit is Successfull");
	}

}