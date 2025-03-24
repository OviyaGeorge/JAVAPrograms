package day4_tasks;

class Pet {
	void petsbrag() {
     System.out.println("I have the best pet!");
 }
}
class Dog extends Pet {
 void dogsbrag() {
     super.petsbrag(); 
     System.out.println("I have the best dog");
 }
}
public class task5 {
 public static void main(String[] args) {
     Dog d = new Dog();
     d.dogsbrag();  
 }
}
