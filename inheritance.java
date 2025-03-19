package javaday3prgms;

class Animal {                 //parent class
	void sound() {
		System.out.println("Animals make sounds");
	}
}
class Dog extends Animal {     //child class
	void bark() {
		System.out.println("Dog barks");
	}
}
class Puppy extends Dog {      //grandchild class
	void weep() {
		System.out.println("Puppy weeps");
	}
}
class Cat extends Animal {     //hierarchical
	void meow() {
		System.out.println("Cat meows");
	}
}

//interface
interface Camera1 {
	void capturePhoto();
}
interface MusicPlayer1 {
	void playMusic();
}
class Smartphone implements Camera1, MusicPlayer1 {
	public void capturePhoto() {
		System.out.println("Photo captured using the camera");
	}
	public void playMusic() {
		System.out.println("Playing music");
	}
}
public class inheritance {
	public static void main(String[]args) {
		Cat c = new Cat();
		c.sound();
		c.meow();
		Dog d = new Dog();
		d.sound();
		d.bark();
		Smartphone sp = new Smartphone();//interface
		sp.capturePhoto();
		sp.playMusic();
	}
}
