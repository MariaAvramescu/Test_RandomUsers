package com.testcases.techtest;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.testcases.helpers.CompareURL;
/*
public class Ex1_ValidateURL {
	private static String EXPECTED_URL = "http://demoqa.com/registration/";
	boolean result = false;
	WebDriver driver;

	@BeforeMethod
	public void createDriver() throws Exception {
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
	//	options.addArguments("start-maximized");
		driver.get("http://demoqa.com/registration/");

		Thread.sleep(2000);

	}

	@Test
	void test() {
		result = CompareURL.validateUrl(driver, EXPECTED_URL);
		Assert.assertTrue(result);
	}

	@AfterTest
	public void fterTest() {
		driver.close();
	}

}*/
