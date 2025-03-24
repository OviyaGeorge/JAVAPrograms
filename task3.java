package day4_tasks;

class Candy {
	void taste() {
     System.out.println("tastes sweet");
 }
}
class Chocolate extends Candy {
 @Override
 void taste() {
     System.out.println("tastes chocolately");
 }
}
public class task3 {
public static void main(String[] args) {
     Candy c = new Candy();
     c.taste();  
     Chocolate choco = new Chocolate();
     choco.taste(); 
 }
}

