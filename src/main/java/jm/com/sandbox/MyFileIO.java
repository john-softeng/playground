package jm.com.sandbox;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFileIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Path path = Paths.get("C:\\search_office_key.txt");
		
		Files.list(Paths.get("C:\\")).forEach(System.out::println);

	}

}
