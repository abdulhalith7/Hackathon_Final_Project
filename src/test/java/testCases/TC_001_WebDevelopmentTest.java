package testCases;

import java.io.IOException;

import org.testng.annotations.*;
import pageObject.CourseraHomePage;
import pageObject.WebDevelopPage;
import testBase.BaseClass;

public class TC_001_WebDevelopmentTest extends BaseClass {
	
	@Test(priority=0, groups= {"sanity"})
	public void enterCourseName()
	{
		logger.info("**** Starting TC_001_WebDevelopmentTest ****");
		
		CourseraHomePage CHP=new CourseraHomePage(driver);
		
		CHP.sendCourseName();
		logger.info("Course Name Sent Successfully");
		
		CHP.SearchButton();
		logger.info("Clicked on Search Button");
	}
	
	
	@Test(priority=1,groups= {"sanity","regression"})
	public void clickLanguage() 
	{	
		WebDevelopPage WDP=new WebDevelopPage(driver);
		
		WDP.scrollSubject();
		logger.info("Scrolled Till Subject");
		
		WDP.clickEnglish();
		logger.info("Clicked English Language");
	}
	
	
	@Test(priority=2,groups= {"sanity","regression"})
	public void clickLevel() 
	{
		WebDevelopPage WDP=new WebDevelopPage(driver);
		
		WDP.scrollSpecific();
		logger.info("Scrolled Till Specific");
		
		WDP.clickBeginner();
		logger.info("Clicked Begginer CheckBox");
	}
	
	
	@Test(priority=3,groups= {"sanity","regression"})
	public void printCourse1() throws IOException 
	{
		WebDevelopPage WDP=new WebDevelopPage(driver);
		
		WDP.scrollFilter();
		logger.info("Scrolled Till Filter");
		
		WDP.verifyCourse1();
		logger.info("Course One is Clicked and Successfully Printed");
	}
	
	
	@Test(priority=4,groups= {"regression"})
	public void printDetails1() throws IOException
	{
		WebDevelopPage WDP=new WebDevelopPage(driver);
		
		WDP.childPage(driver);
		logger.info("Switched To First Course Name");
		
		WDP.verifyRating1();
		logger.info("Successfully Printed Rating of Course One");
		
		WDP.verifyDuration1();
		logger.info("Successfully Printed Duration of Course One");
		
		WDP.parentPage(driver);
		logger.info("Switched To Parent Page");
	}
	
	
	@Test(priority=5,groups= {"sanity","regression"})
	public void printCourse2() throws IOException
	{
		WebDevelopPage WDP=new WebDevelopPage(driver);
		
		WDP.verifyCourse2();
		logger.info("Course One is Clicked and Successfully Printed");
	}
	
	
	@Test(priority=6,groups= {"regression"})
	public void printDetails2() throws IOException
	{
		WebDevelopPage WDP=new WebDevelopPage(driver);
		
		WDP.childPage(driver);
		logger.info("Switched To The Second Course Page");
		
		WDP.scrollFinancial();
		logger.info("Scrolled till Financial");
		
		WDP.verifyRating2();
		logger.info("Successfully Printed Rating of Course Two");
		
		WDP.verifyDuration2();
		logger.info("Successfully Printed Duration of Course Two");
		
		WDP.parentPage(driver);
		logger.info("Switched To The Parent Page");
		logger.info("**** Finishing TC_001_WebDevelopmentTest ****");
	}
}
