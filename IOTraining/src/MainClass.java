import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\sario\\Desktop\\output.txt"));
			writer.write("Writing to a file.");
			writer.write("\nHere is another line.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
