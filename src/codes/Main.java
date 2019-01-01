package codes;

public class Main {
	
// Methods
	public static void checkName(Human human) {
		human.showName();
	}
	
	public static void birthday(Human human) {
		int age;
		
		age = human.getAge();
		age++;
		human.setAge(age);
	}
	
//Main
	public static void main(String[] args) {
		int sum = 0;
		Human Bruno = new Human();
		Human Poppy = new Human("Poppy", 24,"girl");
		
		//sum = Bruno.add(4,5);
		sum = Bruno.add("four","six");
		System.out.println(Bruno.getName() + " says: the sum is " + sum);
		
		Bruno.showAge();
		
		checkName(Poppy);
		birthday(Poppy);
		
		System.out.println(Poppy.getAge());
		
		Poppy.setName("Chris");
		
		Poppy.showName();
		
	} // end main

}
