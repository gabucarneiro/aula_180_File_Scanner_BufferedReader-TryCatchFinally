package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa_181_Try_WithResources {

	public static void main(String[] args) {
		String path = "C:\\Users\\Gabriel\\Desktop\\App cardápios.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}			
		}
		catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
}

