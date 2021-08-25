package com.bl.birdsanctuary;
import java.util.*;

public class BirdSanctuaryRepository {
	
	private static BirdSanctuaryRepository instance;
	
	private Set<Bird> birdList = new HashSet<Bird>();
	
	private BirdSanctuaryRepository() {
		
	}
	
	static BirdSanctuaryRepository getInstance() {
		if(instance == null) {
			instance = new BirdSanctuaryRepository();
		}
		return instance;
	}
	
	public void add(Bird bird) {
		birdList.add(bird);
	}
	
	public void print() {
		for(Bird item: birdList) {
			System.out.println(item);
		}
	}
	
	public void remove(Bird bird) {
		birdList.remove(bird);
	}
	
	public Bird getBird(String name) {
		for(Bird b: birdList) {
			if(b.name.equals(name)) {
				return b;
			}
		}
		return null;
	}
	
	public Set<Bird> getAllBirds() {
		return birdList;
	}
	
}
