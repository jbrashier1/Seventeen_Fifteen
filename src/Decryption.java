import java.io.*;
import java.util.Scanner;

        public class Decryption {
 public static void main(String[] args) throws IOException {
     System.out.println("Enter the name of the file to be decrypted (including file extension):");
     try (
                Scanner fileNames = new Scanner(System.in);
                RandomAccessFile inout = new RandomAccessFile(fileNames.next(), "rw")) {

            byte[] b = new byte[(int)inout.length()];

            inout.seek(0);

            inout.readFully(b);

            for(int i = 0; i < b.length; i++) {
                b[i] -= 5;
            }

            // Write decoded bytes to the file
            for (int i = 0; i < b.length; i++)
                inout.write(b);
            }
        }
}