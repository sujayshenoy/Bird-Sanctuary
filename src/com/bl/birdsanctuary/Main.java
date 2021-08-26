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
		final int EXIT_VALUE = 8;
		
		while(option != EXIT_VALUE) {
			
			System.out.println("Enter your options");
			System.out.println("\n1. Add the bird\n2. Remove the Bird\n3. Print the birds"
					+ "\n4. Print Swimmable\n5. Print Flyable\n6. Print Eatable\n"
					+ "7. Edit Birds\n"
					+ EXIT_VALUE + ". Exit");
			
			Scanner in = new Scanner(System.in);
			option = in.nextInt();
			
			switch (option) {
			case 1:
				addTemporaryBirds();
				
				Bird bird = new Bird();
				
				in.nextLine();
				System.out.println("Enter the id");
				bird.id = in.nextLine();
				
				System.out.println("Enter the name");
				bird.name = in.nextLine();
				
				System.out.println("Choose the color");
				int count = 1;
				for(Bird.Color color: EnumSet.allOf(Bird.Color.class)) {
					System.out.println(""+count+". "+color);
					count++;
				}
				
				int colorChoice = in.nextInt();
				
				int count1 = 1;
				for(Bird.Color color: EnumSet.allOf(Bird.Color.class)) {
					if( colorChoice == count1 ) {
						bird.color = color;
						break;
					}
					count1++;
				}
				
				birdRepo.add(bird);
				
//				Parrot parrot = new Parrot();
//				Penguin penguin1 = new Penguin();
//				Ostrich ostrich = new Ostrich();
//				Duck duck = new Duck();
//				Penguin penguin2 = new Penguin();
//				
//				parrot.id = "pa001";
//				penguin1.id = "pe001";
//				ostrich.id = "os001";
//				duck.id = "du001";
//				penguin2.id = "pe001";
//				
//				
//				birdRepo.add(parrot);
//				birdRepo.add(penguin1);
//				birdRepo.add(penguin1);
//				birdRepo.add(ostrich);
//				birdRepo.add(duck);
//				birdRepo.add(penguin2);
				break;
			case 2:
				System.out.println("Enter the bird name to remove");
				
				in.nextLine();
				String birdname = in.nextLine();
				
				Bird removalBird = birdRepo.getBird(birdname);
				if( removalBird == null ) {
					System.out.println("Bird not found");
					break;
				}
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
			case 7:
				editBird();
				break;
			}
			
		}
		
	}
    
    void addTemporaryBirds() {
		Bird duck = new Bird();
		
		duck.name = "Duck";
		duck.id = "d001";
		duck.color = Bird.Color.WHITE;
		duck.canFly = true;
		duck.canSwim = true;
		
		birdRepo.add(duck);
	}

	private void editBird() {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the bird name to edit\n");
		String birdname = in.nextLine();
		
		Bird editBird = birdRepo.getBird(birdname);
		System.out.println("");
		
		
		
		while(true) {
			
			System.out.println("1. Edit Bird Name\n2. Edit id\n3. Edit Color\n4. Back");
			int choice = in.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the new name: ");
				in.nextLine();
				String bname = in.nextLine();
				editBird.name = bname;
				break;
			case 2:
				System.out.println("Enter the new id: ");
				in.nextLine();
				String id = in.nextLine();
				editBird.id = id;
				break;
			case 3:
				System.out.println("Enter the new color: ");
				System.out.println("Choose the color");
				
				int count = 1;
				for(Bird.Color color: EnumSet.allOf(Bird.Color.class)) {
					System.out.println(""+count+". "+color);
					count++;
				}
				
				int colorChoice = in.nextInt();
				
				int count1 = 1;
				for(Bird.Color color: EnumSet.allOf(Bird.Color.class)) {
					if( colorChoice == count1 ) {
						editBird.color = color;
						break;
					}
					count1++;
				}
				
				break;
			case 4:return;
			}
			
		}
		
		
		
	}

}
