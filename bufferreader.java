package javaday5prgms;
import java.io.*;

public class bufferreader {
	public static void main(String[]args) {
//Buffer Reader		
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\sample.txt"));
					String line;
			System.out.println("Reading file line by line:");
			while((line = br.readLine()) !=null) {
				System.out.println(line);
			}
			br.close();
			} catch (IOException e) {
				System.out.println("Error reading file: " + e.getMessage());
			}
//Buffer Writer		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\sample.txt"));
			bw.write("Java file handling example");
			bw.newLine();
			bw.write("BufferedWriter makes writing more efficient");
			bw.close();
			System.out.println("Data written to file successfully");
		} catch (IOException e) {
			System.out.println("Error writing to file: " + e.getMessage());
		}
		}
	}