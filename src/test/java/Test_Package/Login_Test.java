package Test_Package;


import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.BasePage;
import Object_Page_Package.Login_Page;

public class Login_Test implements ITestListener {

	Login_Page l;
	BasePage b;
	public Login_Test() {
l=new Login_Page();
b=new BasePage();
}

	@Test
	@Parameters({"User","Pass"})
	public void Login(String User,String Pass) throws IOException, AWTException
	{
		
		b.TextWithouSendKey(l.txtUsername, User);
		b.TextWithouSendKey(l.txtPassword, Pass);
	    l.btnLogin.click();
		/*b.NormalScrennShot("Normal");
		b.ParticularScrennShotWithoutInterFace("user", l.txtUsername);
		b.ParticularScrennShotWithoutInterFace("Pass", l.txtPassword);
		b.ParticularScrennShotWithoutInterFace("Login",l.btnLogin );
		b.fullScreenShot("FullScreen");*/
	}

	
	
	
	
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test Success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTest Failureset");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test fail success per");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Thanks for visitiong");
		
	}
	
	
	
	
	
}
