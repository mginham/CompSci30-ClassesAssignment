package codes;

import java.util.Scanner;

public class Human {

	private String name;
	private int age;
	private String gender;
	
// methods
	public int add(int digit1, int digit2) {
		int sum;
		
		sum = digit1 + digit2;
		
		return sum;
	} // end add
	
	public int add(String digit1, String digit2) { // only adds strings less than 10
		Scanner input = new Scanner(System.in);
		int sum, temp1, temp2;
		
		temp1 = convertNumBelowTen(digit1);
		temp2 = convertNumBelowTen(digit2);
		
		if(temp1 == -1 || temp2 == -1)
			return -1;
		else
			sum = temp1+temp2;
		
		return sum;
	} // end add
	
	public static int convertNumBelowTen(String userInput) {
		if(userInput == "zero") {
			return 0;
		}
		else if(userInput == "one") {
			return 1;
		}
		else if(userInput == "two") {
			return 2;
		}
		else if(userInput == "three") {
			return 3;
		}
		else if(userInput == "four") {
			return 4;
		}
		else if(userInput == "five") {
			return 5;
		}
		else if(userInput == "six") {
			return 6;
		}
		else if(userInput == "seven") {
			return 7;
		}
		else if(userInput == "eight") {
			return 8;
		}
		else if(userInput == "nine") {
			return 9;
		}
		else
			return -1;
	} // end convertNumBelowTen
	
// constructors
	public Human() { // default settings for Human objects
		name = "Bruno";
		age = 17;
		gender = "boy";
	} // end Human
	
	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	} // end Human

// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showName() {
		System.out.println(name);
	}
	
	public int getAge() {
		int chance = 0;
		
		if(age > 30) {
			chance = (int)(Math.random()*10+1);
			
			if(chance <=3)
				return -5;
		}
		
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showAge() {
		System.out.println(age);
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void showGender() {
		System.out.println(gender);
	}
}
