package com.testcases.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomGenerator {
	private Random randomGenerator;

	public ArrayList<User> getRandomNames(int howManyUsers, ArrayList<User> users) {
		ArrayList<User> randomUsers = new ArrayList<User>();
		randomGenerator = new Random();
		int previousIndex = -1;
		while (randomUsers.size() < howManyUsers) {
			int indexR = randomGenerator.nextInt(users.size());
			if (previousIndex != indexR) {
				User userRandom = users.get(indexR);
				randomUsers.add(userRandom);
				previousIndex = indexR;
			}
		}
		return randomUsers;
	}

	public String getSaltString() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 18) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}

	public int getRandomNumber(int numberMax) {
		randomGenerator = new Random();
		int indexR = randomGenerator.nextInt(numberMax) + 1;
		return indexR;

	}

	public String getRandomPhoneNumber() {

		int[] numbers = new int[12];
		// Generates 10 Random Numbers in the range 1 -20
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 20 + 1);
		} // end for loop
		return Arrays.toString(numbers);
	}
	
	
	public String getRandomPhoneNumber1() {
		 Random rand = new Random();

		    int num1, num2, num3;

		    num1 = rand.nextInt (900) + 100;
		    num2 = rand.nextInt (643) + 100;
		    num3 = rand.nextInt (9000) + 1000;

		    return num1+""+num2+""+num3;
	  }
}
