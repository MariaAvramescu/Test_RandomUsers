package com.testcases.techtest;

import java.util.ArrayList;

import com.testcases.helpers.RandomGenerator;
import com.testcases.helpers.User;

public class ArrayListComparingElements {

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
			// should i put like... connection words?

		};
	};

	private void findItemInTheList(String itemToFind, ArrayList<User> users,ArrayList<User> randomUsers ) {
		
		for (int x = 0; x < randomUsers.size(); x++) {
			if ((users.get(x).toString().contains(itemToFind))) {
				System.out.println(itemToFind + " was not found in the list");
			}
		}

	}

	public static void main(String[] args) {
		RandomGenerator randomGenerator = new RandomGenerator();
		ArrayListComparingElements demo = new ArrayListComparingElements();

		ArrayList<User> randomUsers = randomGenerator.getRandomNames(5, users);

		for (int x = 0; x < randomUsers.size(); x++) {
			demo.findItemInTheList(randomUsers.get(x).toString(), users,randomUsers);

		}

	}

}
