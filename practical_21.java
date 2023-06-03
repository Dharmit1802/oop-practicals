import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class practical_21 {
    public static void main(String[] args) {
        String fileName = "123.txt";

        try {
            // Create a FileWriter in append mode
            FileWriter fileWriter = new FileWriter(fileName, true);

            // Create a BufferedWriter and PrintWriter for efficient writing
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            // Generate 150 random integers and write them to the file
            Random random = new Random();
            for (int i = 0; i < 150; i++) {
                int randomInt = random.nextInt(150);
                printWriter.print(randomInt + " ");
            }

            // Close the resources
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Data written to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
