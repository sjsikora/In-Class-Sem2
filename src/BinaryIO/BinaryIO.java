package BinaryIO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BinaryIO {
    public static void main(String[] args) {
        
    }
    static void readA(String filename) {
        
        DataInputStream dis;

        try {
            dis = new DataInputStream(new FileInputStream(new File(filename)));

            int one = dis.readInt();
            int two = dis.read();
            char three = dis.readChar();
            String four = dis.readUTF();

            System.out.printf("%d %d %c %s %n", one, two, three, four);


            one = dis.readInt();
            two = dis.readInt();
            three = dis.readChar();
            four = dis.readUTF();

            
        } catch (Exception e) {
            System.out.println("Error opening file");
            return;
        }

    }
} 
