package com.testcases.techtest;

import java.util.ArrayList;

import com.testcases.helpers.RandomGenerator;
import com.testcases.helpers.User;

public class Ex3_GetUnregisteredUsers {

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

	private void findUnrepetitiveUsers(String itemToFind, ArrayList<User> users,ArrayList<User> randomUsers ) {
		
		for (int x = 0; x < randomUsers.size(); x++) {
			if ((users.get(x).toString().contains(itemToFind))) {
				System.out.println(itemToFind + " was not found in the list");
			}
		}

	}

	public static void main(String[] args) {
		RandomGenerator randomGenerator = new RandomGenerator();
		Ex3_GetUnregisteredUsers demo = new Ex3_GetUnregisteredUsers();

		ArrayList<User> randomUsers = randomGenerator.getRandomNames(5, users);

		for (int x = 0; x < randomUsers.size(); x++) {
			demo.findUnrepetitiveUsers(randomUsers.get(x).toString(), users,randomUsers);

		}

	}

}
