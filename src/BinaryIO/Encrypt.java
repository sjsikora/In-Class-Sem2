package BinaryIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Encrypt {
   public static void main(String[] args) {

   } 
   static void encrypt(String filename, int key) {

    if (key < 0 || key > 100) {
        System.out.println("Key must be between 0 and 100");
        return;
    }

       
    try (FileInputStream dis = new FileInputStream(filename)) {

        int bytes = dis.available();
        byte[] data = new byte[bytes];

        dis.read(data);

        for (int i = 0; i < bytes; i++) {
            int byteToReturn;

            if (data[i] + key > 255) byteToReturn = (data[i] + key) - 256; 
            else byteToReturn = data[i] + key;

            data[i] = (byte) byteToReturn;
        }

        File file = new File(filename + ".enc");

        if (!file.exists()) {file.createNewFile();}

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));

        dos.write(data);
        dos.close();
        
    } catch (Exception e) {
        System.out.println("Error opening file");
        return;
    }


   }
   static void decyrpt(String filename, int key) {
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("File does not exist");
            return;
        }

        if (key < 0 || key > 100) {
            System.out.println("Key must be between 0 and 100");
            return;
        }

        if(!file.getName().endsWith(".enc")) {
            System.out.println("File is not encrypted");
            return;
        }
        
        byte[] data;

        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            
            data = new byte[dis.available()];
            dis.read(data);

            for (int i = 0; i < data.length; i++) {
                int byteToReturn;

                if (data[i] - key < 0) byteToReturn = (data[i] - key) + 256;
                else byteToReturn = data[i] - key;

                data[i] = (byte) byteToReturn;
            }

        } catch (Exception e) {
            System.out.println("Error opening file");
            return;
        }

        try {
            File fileOutput = new File(filename + ".enc");

            if (!fileOutput.exists()) {fileOutput.createNewFile();}
    
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileOutput));
    
            dos.write(data);
            dos.close();
        } catch (Exception e) {
            System.out.println("Error opening file");
            return;
        }


    }
}
