package day4_tasks;

class Bird {
	public void speak() {
		System.out.println("The birds makes a sound");
 }
}
class Cat extends Bird {
	@Override
	public void speak() {
        System.out.println("The dog barks");
 }
}
public class task2 {
 public static void main(String[] args) {
     Bird b = new Bird();
     b.speak();
     Cat c = new Cat();
     c.speak();
 }
}
