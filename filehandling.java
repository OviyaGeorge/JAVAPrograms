package javaday5prgms;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class filehandling {
	public static void main(String[]args) throws IOException {
//creating a file
		File obj =new File("C:\\Users\\admin\\eclipse-workspace\\javaday5prgms\\src\\javaday5prgms\\file");
		obj.createNewFile();
		System.out.println("File created");
//writing data to a file		
		try {			
			FileWriter w1 = new FileWriter("C:\\Users\\admin\\eclipse-workspace\\javaday5prgms\\src\\javaday5prgms\\file");
			w1.write("Hello, Java I/O");
			w1.close();
			System.out.println("Data written to file");
//reading data from a file
			FileReader r1 = new FileReader("C:\\Users\\admin\\eclipse-workspace\\javaday5prgms\\src\\javaday5prgms\\file");
			int character;
			while ((character = r1.read()) != -1) {
				System.out.print((char) character);
			}
			r1.close();
		} catch (IOException e) {
			System.out.println("An error occured: "+ e.getMessage());
		}
	}
}
