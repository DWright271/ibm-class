package com.javaoo.store;
import java.util.*;
import java.io.*;

public class BookExerciser {

	public static List<Book> readBooksFromFile(String name) {
		
	List<Book> books = null;
	
		try {
			FileInputStream inFile = new FileInputStream(name);
			InputStreamReader inReader = new InputStreamReader(inFile);
			LineNumberReader lineReader = new LineNumberReader(inReader);
			
			String line;
			
			while ((line = lineReader.readLine()) != null) {
				
				String title = line;
				
				line = lineReader.readLine();
				
				String author = line;
				
				line = lineReader.readLine();
				
				double price = Double.parseDouble(line);
				
				Book t = new Book (title, price, 1, author, "A", "Sci-Fi");
				
				books.add(t);
				
		}

	}catch(Exception e) {
    	e.printStackTrace();
		}
	
		return books;
	}
		
	public static void main(String[] args) {
		List<Book> books = readBooksFromFile("");
		
		for (Book s : books) {
			System.out.println(s.getTitle());
		}
	}
	
}

