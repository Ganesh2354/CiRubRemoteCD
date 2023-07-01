package com.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeSuite

	public void browserLaunch() {
		System.out.println("Launched browser");
	}

	@Test
	public void test1() {
		
		System.out.println("test1.");
	}
	
	@Test
	public void test2() {
		
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		
		System.out.println("test3");
	}

	@AfterSuite

	public void browserClose() {
		System.out.println("close browser");
	}

}
