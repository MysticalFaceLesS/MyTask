import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		firstTask();
		secondTask();
		IncrementSynchronize.getNextValue();
	}
	
	
	// FirstTask. Our task is to read the file, ignoring characters.
	// I could to use summary of regular-expression constructs, but i want to keep spaces.
	public static void firstTask() throws IOException {
		
		  // Create file
		  File file = new File("TextForTask.txt");  
	      file.createNewFile();
	      
	      // Create object 'FileWriter'
	      FileWriter writer = new FileWriter(file); 
	      
	      // Write text in file 'TextForTask.txt'
	      writer.write("We have to ignore characters => \n ! : ? , . : \n It works?"); 
	      writer.flush();
	      writer.close();

	      // Create object 'Scanner' and reading my file
	      Scanner scanner = new Scanner(file);
	      String text = "";
	      text = scanner.nextLine();
	      while (scanner.hasNextLine()) {
	    	  text = text + "\n" + scanner.nextLine();
	      }
	      
	      // Сreate a list of ignored characters
	      String[] ignoreChars = {",", "!", ";", ".", ":", "-", "?", "=", "@", ">"};
	      
	      // Checking for ignored characters
	      for(String rc : ignoreChars) {
	    	  text = text.replace(rc, "");
	      }
	      
	      System.out.println("FirstTask:\n" + text + "\n");
	}
	
	// SecondTask. We have to puts array of objects in the array into the collection.
	public static void secondTask() {
		
		// Create an array of objects 'numbers'
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		// Create a collection and put all the numbers from the array
		ArrayList<Integer> niceNumbers = new ArrayList<Integer>();
		for(int exportNumbers : numbers) {
			niceNumbers.add(exportNumbers);
		}
		
		System.out.println("SecondTask: \n" + niceNumbers + "\n");
	}
}
