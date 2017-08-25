package core;
import java.io.*;
public class Input_CSV {
public static void main( String[] args ) throws IOException {
	
	//String csvFile = args[0];
	String csvFile = "c://input.csv";
	BufferedReader br = new BufferedReader(new FileReader(csvFile));
	
	while (br.ready()) {
		String line = br.readLine(); //Gleb, Pichshulin
		String[] csv = line.split(",");
		String first_name = csv[0];
		String last_name = csv[1];
		
		System.out.println("Full Name Is: " + first_name + " " + last_name);}
	br.close();
}
}