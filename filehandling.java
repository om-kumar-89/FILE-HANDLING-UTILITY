import java.io.*;

public class filehandling {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        try {
            // WRITE
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello! I am om kumar.\n");
            writer.close();
            System.out.println("File written successfully.");

            // READ
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            System.out.println("\nReading file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // APPEND / MODIFY
            FileWriter appendWriter = new FileWriter(fileName, true);
            appendWriter.write("This is appended text.\n");
            appendWriter.close();
            System.out.println("\nFile updated successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
