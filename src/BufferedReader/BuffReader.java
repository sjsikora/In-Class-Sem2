package BufferedReader;
import java.io.*;

public class BuffReader {
    public static void main(String[] args) {


        String filename = "/Users/samsikora/Desktop/UBC/1.2/COSC 121/In Class/src/BufferedReader/hello.txt";

        File textFile = new File(filename);

        try(BufferedReader sc = new BufferedReader(new FileReader(textFile))) {
            String line;
            while((line = sc.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Unable to read file: " + filename);
        }

    }
}
