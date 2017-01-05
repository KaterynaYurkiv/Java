package home.core11zooclub;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import core.less6.Gender;
import core.less6.Person;

public class Zooclub {
	
	private static final Map<Person, List<Pet>> map = new HashMap<>();
	private static final Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		//Map<Person, List<Pet>> map = new HashMap<>();
		/*map.put(new Person ("Robert", 18, Gender.MALE), new ArrayList<>());
		map.put(new Person ("Ann", 20, Gender.FEMALE), new ArrayList<>());
		System.out.println(map);*/
		
		//Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to add club member");
			System.out.println("Enter 2 to add a pet to the club member");
			System.out.println("Enter 3 to delete a pet from the club member");
			System.out.println("Enter 4 to delete club member");
			System.out.println("Enter 5 to delete a pet from all club members"); 
			System.out.println("Enter 6 to see zooclub with it's members and pets");
			switch (sc.next()) {
			case "1":
//				System.out.println("Enter the name of club member");
//				String name = sc.next();
//				System.out.println("Enter age");
//				int age = sc.nextInt();
//				System.out.println("Enter gender");
//				Gender gender = Gender.valueOf(sc.next().toUpperCase());
//				map.put(new Person (name, age, gender), new ArrayList<>());
				task1(map);
				break;
			case "2":
				System.out.println("Enter the name of club member");
				String name2 = sc.next();
				System.out.println("Enter age");
				int age2 = sc.nextInt();
				System.out.println("Enter gender");
				Gender gender2 = Gender.valueOf(sc.next().toUpperCase());
				Person person2 = new Person (name2, age2, gender2);
				if(map.containsKey(person2)){
					System.out.println("Enter the animal you want to add");
					String animal	= sc.next();
					System.out.println("Enter age of this animal");
					int animalAge = sc.nextInt();
					map.get(person2).add(new Pet(animal, animalAge));
				}else{
					System.out.println("The mentioned member doesn't exist in our club");
				}
				break;
			case "3":
				System.out.println("Enter the name of club member");
				String name3 = sc.next();
				System.out.println("Enter age");
				int age3 = sc.nextInt();
				System.out.println("Enter gender");
				Gender gender3 = Gender.valueOf(sc.next().toUpperCase());
				Person person3 = new Person (name3, age3, gender3);
				if(map.containsKey(person3)){
					System.out.println("Enter the animal you want to remove");
					String animal3	= sc.next();
					System.out.println("Enter age of this animal");
					int animalAge3 = sc.nextInt();
					Pet pet = new Pet (animal3, animalAge3);
					if(map.get(person3).contains(pet)){
						map.get(person3).remove(pet);
					}else{
						System.out.println("This person doesn't possess such pet");
					}
				}else{
					System.out.println("The mentioned member doesn't exist in our club");
				}
				break;
			case "4":
				System.out.println("Enter the name of club member");
				String name4 = sc.next();
				System.out.println("Enter age");
				int age4 = sc.nextInt();
				System.out.println("Enter gender");
				Gender gender4 = Gender.valueOf(sc.next().toUpperCase());
				Person person4 = new Person (name4, age4, gender4);
				if(map.containsKey(person4)){
					map.remove(person4);
				}else {
					System.out.println("We don't have this person in our club");
				}
				break;
			case "5":
				System.out.println("Enter the animal you want to remove");
				String animal5	= sc.next();
				System.out.println("Enter age of this animal");
				int animalAge5 = sc.nextInt();
				Pet pet5 = new Pet (animal5, animalAge5);
				Set<Person> keySet = map.keySet();
				for (Person key: keySet){
					if (map.get(key).contains(pet5)){
						map.get(key).remove(pet5);
						}
					}
				break;
			case "6":
				System.out.println(map);
				System.out.println();
				
				Set<Entry<Person, List<Pet>>> entrySet = map.entrySet(); 
				for (Entry<Person, List<Pet>> entry : entrySet){
					Person key = entry.getKey();
					for (Pet pet : entry.getValue()){
						System.out.println(key + " -> " + pet);
					}
				}
				/*Set<Person> keySet2 = map.keySet();
				for (Person key: keySet2){
					for (Pet pet : map.get(key)){ 
						System.out.println(key + " -> " + pet);
					}
				}*/
				break;
			default:
				sc.close();
				return;
			}
		}
	}
	
	static Map<Person, List<Pet>> task1(Map<Person, List<Pet>> map){
		System.out.println("Enter the name of club member");
		String name = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter gender");
		Gender gender = Gender.valueOf(sc.next().toUpperCase());
		map.put(new Person (name, age, gender), new ArrayList<>());
		return map;
	}

}

