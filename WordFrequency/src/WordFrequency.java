import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class WordFrequency {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
	    Scanner fileInput = new Scanner(System.in);
	    System.out.println("Enter the file name -  ");
	    String filename = fileInput.nextLine();
	    System.out.println("Enter the word to be searched - ");
	    String word = fileInput.nextLine();
	    System.out.println("Word found in Line # ");
	    
	    //using buffered input stream using LineNumberReader
	    try (LineNumberReader read = new LineNumberReader(new FileReader(filename)))
	    {
	    	int wordCount = 0;
	        String line;
	        // Read text file until the last line
	        while ((line = read.readLine())!= null) 
	        {
	        // Split on each space	
	            for (String element : line.split(" ")) 
	            {
	        //ignore the case and count the word     	
	                if (element.equalsIgnoreCase(word)) 
	                {
	                    wordCount++;
	                    System.out.println(read.getLineNumber());
	                }
	            }
	        }
	        System.out.println("Word Frequency = " + wordCount);
	        
	    }	    
	    catch (Exception e)
	    {
	    	e.printStackTrace();
	    }
	      
	}
	
}
