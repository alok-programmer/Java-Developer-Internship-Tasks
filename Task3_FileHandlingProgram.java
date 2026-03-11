import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Task3_FileHandling {

    public static void main(String[] args) {

        String fileName = "sample.txt";

        // Writing to file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a simple Java File Handling example.\n");
            writer.write("This file is created and written using Java IO.");
            writer.close();
            System.out.println("Data successfully written to file.");
        } 
        catch (IOException e) {
            System.out.println("Error while writing to file.");
        }

        // Reading from file
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("\nReading data from file:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } 
        catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }
}
