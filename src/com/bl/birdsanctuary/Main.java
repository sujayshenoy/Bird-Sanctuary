package com.bl.birdsanctuary;

import java.util.*;

public class Main {
	BirdSanctuaryRepository birdRepo = BirdSanctuaryRepository.getInstance();
	ViewLayer view = new ViewLayer();

	public static void main(String[] args) {
		
		Main mainApp = new Main();
		mainApp.showUserMenu();
		
		/*Parrot parrot = new Parrot();
		Penguin penguin1 = new Penguin();
		Ostrich ostrich = new Ostrich();
		Duck duck = new Duck();
		Penguin penguin2 = new Penguin();
		
		parrot.id = "pa001";
		penguin1.id = "pe001";
		ostrich.id = "os001";
		duck.id = "du001";
		penguin2.id = "pe001";
		
		BirdSanctuaryRepository birdRepo = new BirdSanctuaryRepository();
		
		birdRepo.add(parrot);
		birdRepo.add(penguin1);
		birdRepo.add(penguin1);
		birdRepo.add(ostrich);
		birdRepo.add(duck);
		birdRepo.add(penguin2);
		
		birdRepo.remove(duck);
		
		birdRepo.print();*/
		
		
	}
	
    void showUserMenu() {
		
		int option=0;	
		final int EXIT_VALUE = 7;
		
		while(option != EXIT_VALUE) {
			
			System.out.println("Enter your options");
			System.out.println("\n1.Add the bird\n2.Remove the Bird\n3.Print the birds"
					+ "\n4.Print Swimmable\n5.Print Flyable\n6.Print Eatable\n" + EXIT_VALUE + ".Exit");
			
			Scanner in = new Scanner(System.in);
			option = in.nextInt();
			
			switch (option) {
			case 1:
				Parrot parrot = new Parrot();
				Penguin penguin1 = new Penguin();
				Ostrich ostrich = new Ostrich();
				Duck duck = new Duck();
				Penguin penguin2 = new Penguin();
				
				parrot.id = "pa001";
				penguin1.id = "pe001";
				ostrich.id = "os001";
				duck.id = "du001";
				penguin2.id = "pe001";
				
				
				birdRepo.add(parrot);
				birdRepo.add(penguin1);
				birdRepo.add(penguin1);
				birdRepo.add(ostrich);
				birdRepo.add(duck);
				birdRepo.add(penguin2);
				break;
			case 2:
				System.out.println("Enter the bird name to remove");
				
				in.nextLine();
				String birdname = in.nextLine();
				
				Bird removalBird = birdRepo.getBird(birdname);
				birdRepo.remove(removalBird);
				
				break;
			case 3:
				view.print();
				break;
			case 4:
				view.printSwimmable();
				break;
			case 5:
				view.printFlyable();
				break;
			case 6:
				view.printEatable();
				break;
			}
			
		}
		
	}

}
