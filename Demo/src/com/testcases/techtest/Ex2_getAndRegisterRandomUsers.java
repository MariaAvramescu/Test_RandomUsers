package com.testcases.techtest;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.testcases.helpers.RandomGenerator;
import com.testcases.helpers.User;

public class Ex2_getAndRegisterRandomUsers {

	private static ArrayList<User> users = new ArrayList<User>() {
		{
			add(new User("Jan", "van Dam"));
			add(new User("Chack", "Norris"));
			add(new User("Klark", "n Kent"));
			add(new User("Bat", "Man"));
			add(new User("Tim", "Los"));
			add(new User("Dave", "o Core"));
			add(new User("Pay", "Pal"));
			add(new User("Lazy", "Cat"));
			add(new User("Jack", "Johnes"));

		};
	};

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		RandomGenerator randomGenerator = new RandomGenerator();

		ArrayList<User> randomUsers = randomGenerator.getRandomNames(5, users);
		driver = new ChromeDriver();

		for (int x = 0; x < randomUsers.size(); x++) {
			driver.get("http://demoqa.com/registration/");
			driver.manage().window().maximize();

			WebElement firstName = driver.findElement(By.name("first_name"));
			firstName.sendKeys(randomUsers.get(x).getFirstName());
			WebElement lastName = driver.findElement(By.name("last_name"));
			lastName.sendKeys(randomUsers.get(x).getLastName());

			WebElement hobby = driver.findElement(By.name("checkbox_5[]"));
			hobby.click();

			Select dropdownCountry = new Select(driver.findElement(By.name("dropdown_7")));
			dropdownCountry.selectByIndex(randomGenerator.getRandomNumber(30));

			Select dateOfBirthMonth = new Select(driver.findElement(By.name("date_8[date][mm]")));
			dateOfBirthMonth.selectByIndex(randomGenerator.getRandomNumber(11));

			Select dateOfBirthDay = new Select(driver.findElement(By.name("date_8[date][dd]")));
			dateOfBirthDay.selectByIndex(randomGenerator.getRandomNumber(30));

			Select dateOfBirthYear = new Select(driver.findElement(By.name("date_8[date][yy]")));
			dateOfBirthYear.selectByIndex(randomGenerator.getRandomNumber(50));

			WebElement phoneNumber = driver.findElement(By.name("phone_9"));
			phoneNumber.sendKeys(randomGenerator.getRandomPhoneNumber1()); // min 10

			WebElement username = driver.findElement(By.name("username"));
			username.sendKeys(randomGenerator.getSaltString());
			WebElement email = driver.findElement(By.name("e_mail"));
			email.sendKeys(randomGenerator.getSaltString() + "@gmail.com"); // valid

			WebElement aboutYourself = driver.findElement(By.name("description"));
			aboutYourself.sendKeys(randomGenerator.getSaltString());

			String passwordRandom = randomGenerator.getSaltString();
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys(passwordRandom);

			WebElement confirmPassword = driver.findElement(By.id("confirm_password_password_2"));
			confirmPassword.sendKeys(passwordRandom);

			WebElement submitButton = driver.findElement(By.name("pie_submit"));
			submitButton.click();
			Thread.sleep(2000);

			WebElement registrationSuccessfullyDone = driver.findElement(By.className("piereg_message"));
			registrationSuccessfullyDone.isDisplayed();

		}
		driver.quit();

	}

}