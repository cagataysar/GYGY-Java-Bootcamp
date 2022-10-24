package Challenge_06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReaderClass {

	public void readWords() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\sario\\Desktop\\file.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Reading operation finished sucsessfully.");
		}
	}

	public void readLineAt(int target) {
		try {
			String line = Files.readAllLines(Paths.get("C:\\Users\\sario\\Desktop\\file.txt")).get(target - 1);
			System.out.println(line);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Reading operation finished sucsessfully.");
		}
	}

}
