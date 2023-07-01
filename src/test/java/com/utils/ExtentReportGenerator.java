package com.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	public static ExtentReports generateReport()
	{
       
		String path=System.getProperty("user.dir")+"\\Test_Reports\\JenkinsRunTest.html";
		
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setDocumentTitle("Facebook WebApplication Framework");
		report.config().setReportName("LoginFBTC001");
		report.config().setTheme(Theme.DARK);		
		ExtentReports extent=new ExtentReports();		
		extent.attachReporter(report);
		extent.setSystemInfo("FacebookFW", "Automation with Selenium-Java");
		extent.setSystemInfo("QA", "XYZ");
		extent.setSystemInfo("O.S.", "Windows");
		return extent;
	}

}
