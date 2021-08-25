package com.bl.birdsanctuary;

import java.util.*;

public class ViewLayer {
	
	public void print() {
		
		BirdSanctuaryRepository birdRepo = BirdSanctuaryRepository.getInstance();
		Set<Bird> birdList = birdRepo.getAllBirds();
		
		for(Bird item: birdList) {
			System.out.println(item);
		}
		
	}
	
	public void printFlyable() {

		BirdSanctuaryRepository birdRepo = BirdSanctuaryRepository.getInstance();
		Set<Bird> birdList = birdRepo.getAllBirds();
		
		for (Bird item : birdList) {
			if(item instanceof Flyable) {
				((Flyable)item).fly();
			}
		}
		
	}

	public void printSwimmable() {

		BirdSanctuaryRepository birdRepo = BirdSanctuaryRepository.getInstance();
		Set<Bird> birdList = birdRepo.getAllBirds();
		
		for (Bird item : birdList) {
			if(item instanceof Swimmable) {
				((Swimmable)item).swim();
			}
		}
		
	}

	public void printEatable() {

		BirdSanctuaryRepository birdRepo = BirdSanctuaryRepository.getInstance();
		Set<Bird> birdList = birdRepo.getAllBirds();
		
		for (Bird item : birdList) {
			item.eat();
		}
		
	}
}
