package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "//src//data1//self-driving-car.txt";
//		String textFile="C:\\Users\\Shakat\\eclipse-workspace\\FirstJava\\Test\\src\\data\\self-driving-car.txt";
		

		BufferedReader reader=null;
		String line;
		try {
			reader=new BufferedReader(new FileReader("textFile"));
			
			try {
				
				while((line=reader.readLine())!=null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			System.out.println("In the finally block.");
			if(reader!=null)
				try {
					reader.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			
		}
		
		
	}

}


