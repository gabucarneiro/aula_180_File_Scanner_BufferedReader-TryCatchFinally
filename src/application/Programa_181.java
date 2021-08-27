package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa_181 {

	public static void main(String[] args) {
		String path = "C:\\Users\\Gabriel\\Desktop\\App cardápios.txt";
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(path));
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}			
		}
		catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		finally {
			try {
				if(br != null) {
					br.close();
				}
			}
			catch(IOException e) {
				System.out.println("Error 2: "+ e.getMessage());
			}
		}		
	}
}