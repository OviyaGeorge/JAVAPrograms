package day4_tasks;

class Greeting {
	void greet() {
     System.out.println("Hello");
 }
	void greet(String name) {
     System.out.println("Hello " + name);
 }
 public static void main(String[] args) {
     Greeting g = new Greeting();
     g.greet();  
     g.greet("Sansa");  
 }
}
