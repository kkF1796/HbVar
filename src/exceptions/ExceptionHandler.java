package exceptions;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.BufferedReader;
import java.util.ArrayList;

public class ExceptionHandler {
	
	//constructor
	public ExceptionHandler() {
		
	}
	
	public void handle(ArrayList<Integer> lineIndex, BufferedReader br) {
		int counterbr = 1;//the number of line read from br
		int counterlines = 0;//iterate on lineIndex which contains the number of the lines not taken in grammar
		String line = "";
	
		try {
			System.err.println("lines not taken in grammar: ");
			//display the line if the number is in index line which contains the number of all lines not taken by the grammar
			
			while( (line = br.readLine()) != null & counterlines < lineIndex.size()){
				
				if (counterbr == lineIndex.get(counterlines) && line != " ") {
					
					//System.err.println(counterbr);
					line = line.replace("***", " ");
					line = line.replace('$', ' ');
					System.err.println(line);
					counterlines++;
				}
				
				counterbr++;
	            
	        }
			//System.err.println("end of file");
		}
		
		catch (FileNotFoundException e) {
            System.err.println("Oops! Please check for the presence of file in the path specified.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Oops! Unable to read the file.");
            e.printStackTrace();
        }
	}
	
	

}
