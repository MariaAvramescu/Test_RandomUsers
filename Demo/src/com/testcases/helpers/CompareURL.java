package com.testcases.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CompareURL {

	public static boolean validateUrl(WebDriver driver, String actAndExpURL) {
		boolean result = false;
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(actAndExpURL)) {
			result = true;
		}
		return result;

	}

}
