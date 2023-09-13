package edu.lemoyne.harperca;

import java.util.ArrayList;
import java.util.Scanner;

public class GarageMain {

	public static void main(String[] args) {
		String[] cars = new String[3];
		cars[0] = "McLaren";
		cars[1] = "Ferrari";
		cars[2] = "Mercedes";
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		ArrayList myGarage = new ArrayList();
		myGarage.add("Dependable Lemon");
		myGarage.add("Toyota");
		myGarage.add("This isn't even a car, man");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a new car, leave blank to end.");
		String newCar = scanner.nextLine();
		while(!newCar.isBlank()) {
			myGarage.add(newCar);
			System.out.println("Enter a new car, leave blank to end.");
			newCar = scanner.nextLine();			
		}
		
		for(int i = 0; i < myGarage.size(); i++) {
			System.out.println(myGarage.get(i));
		}
		
		System.out.println("Thanks for stopping by!");
	}
}
