package core;
import java.io.*;
public class Input_Text_FR {
	public static void main(String[] args) throws IOException {
//String file = args[0];
		File file = new File("c://input.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		while (br.ready()) {
			String first_name = br.readLine();
			//String last_name = br.readLine();
			System.out.println("Full Name Is: " + first_name);}
		br.close();
		}
}