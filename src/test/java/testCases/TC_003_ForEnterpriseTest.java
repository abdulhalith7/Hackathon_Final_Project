package testCases;

import org.testng.annotations.*;
import pageObject.CourseraHomePage;
import pageObject.ForEnterprisePage;
import pageObject.LanguageLearningPage;
import testBase.BaseClass;

public class TC_003_ForEnterpriseTest extends BaseClass{
	
	@Test(priority=0,groups= {"sanity","regression"})
	public void clickCourseTitle() 
	{	
		logger.info("**** Starting TC_003_ForEnterpriseTest ****");
		
		LanguageLearningPage LL=new LanguageLearningPage(driver);
		
		LL.clickTitle();
		logger.info("Clicking the Title Icon To naviage Back");
	}
	
	
	@Test(priority=1,groups= {"sanity","regression"})
	public void clickEnterpriseLink()
	{
		CourseraHomePage CSHP=new CourseraHomePage(driver);
		
		CSHP.scrollToBottom();
		logger.info("Scrolling Till the Bottom of the Page");
		
		CSHP.clickForEnterprise();
		logger.info("Clicking the ForEnterPrise Link");
	}
	
	
	@Test(priority=2,groups= {"sanity"})
	public void clickWeOfferLink()
	{	
		ForEnterprisePage FEP=new ForEnterprisePage(driver);
		
		FEP.scrollMore();
		logger.info("Scrolling Till More in the Bottom");
		
		FEP.clickWhatWeOffer();
		logger.info("Clicked What We Offer Link");
	}
	
	
	@Test(priority=3,groups= {"sanity"})
	public void clickLearnMoreButton()
	{
		ForEnterprisePage FEP=new ForEnterprisePage(driver);
		
		FEP.scrollCampus();
		logger.info("Scrolled Till the Coursera for Campus");
		
		FEP.clickLearnMore();
		logger.info("Clicked Learn More Link");
	}
	
	
	@Test(priority=4,groups= {"sanity","regression"})
	public void setFirstLastName()
	{
		ForEnterprisePage FEP=new ForEnterprisePage(driver);
		
		FEP.scrollSalesTeam();
		logger.info("Scrolling Till the Haeding beside The Input Box");
		
		FEP.setFirstName();
		logger.info("FirstName is Entered Successfully");
		
		FEP.setLastName();
		logger.info("LastName is Entered Successfully");
	}
	
	
	@Test(priority=5,groups= {"sanity","regression"})
	public void setEmailId()
	{
		ForEnterprisePage FEP=new ForEnterprisePage(driver);
		
		FEP.setEmailAddress();
		logger.info("Email is Entered Successfully");
	}
	
	
	@Test(priority=6,groups= {"sanity","regression"})
	public void setMobileNo()
	{
		ForEnterprisePage FEP=new ForEnterprisePage(driver);
		
		FEP.setPhoneNo();
		logger.info("Phone Number is Entered Successfully");
	}
	
	
	@Test(priority=7,groups= {"regression"})
	public void setInstituteDetails()
	{
		ForEnterprisePage FEP=new ForEnterprisePage(driver);
		
		FEP.selectInstituteType();
		logger.info("Institute Type is Selected Successfully");
		
		FEP.setInstituteName();
		logger.info("Institute Name is Entered Successfully");
	}
	
	
	@Test(priority=8,groups= {"sanity","regression"})
	public void SetJobRole()
	{
		ForEnterprisePage FEP=new ForEnterprisePage(driver);
		
		FEP.selectJobRole();
		logger.info("Job Role is Selected Successfully");
	}
	
	
	@Test(priority=9,groups= {"sanity","regression"})
	public void setDepartmentDetails()
	{
		ForEnterprisePage FEP=new ForEnterprisePage(driver);
		
		FEP.selectDepartment();
		logger.info("Department is Selected Successfully");
		
		FEP.selectDescribe();
		logger.info("Describe is Selected Successfully");
		
		FEP.selectExpectedLearner();
		logger.info("Expected Learner is Selected Successfully");
	}
	
	
	@Test(priority=10,groups= {"sanity","regression"})
	public void setCountryState()
	{
		ForEnterprisePage FEP=new ForEnterprisePage(driver);
		
		FEP.selectCountry();
		logger.info("Country is Selected Successfully");
		
		FEP.selectState();
		logger.info("State is Selected Successfully");
	}
	
	
	@Test(priority=11,groups= {"sanity"})
	public void clickSubmitButton()
	{
		ForEnterprisePage FEP=new ForEnterprisePage(driver);
		
		FEP.clickSubmit();
		logger.info("Submit Button is Clicked Successfully");
	}
	
	
	@Test(priority=12,groups= {"sanity","regression"})
	public void verifyEmailId()
	{
		ForEnterprisePage FEP=new ForEnterprisePage(driver);
		
		FEP.scrollSalesTeam();
		logger.info("Scrolled Till The Heading Beside of Input Boxes");
		
		FEP.printInvalidEmail();
		logger.info("Successfully Printed Message of Invalid Email Address");
		logger.info("**** Finishing TC_003_ForEnterpriseTest ****");
	}
}
