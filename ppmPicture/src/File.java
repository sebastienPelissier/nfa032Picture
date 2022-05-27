
import java.io.*;
import java.util.Scanner;

public class File {

    public static void read() {
        String filename;
        FileInputStream file;
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filename to display:");
        filename = scanner.nextLine();

        try {
            file = new FileInputStream(filename);
            c = file.read();

            while (c != -1){
                System.out.print((char) c);
                c = file.read();
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void create(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String extension = ".ppm";

        String filename;
        FileOutputStream file;
        String toWrite;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filename to create:");
        filename = scanner.nextLine();
        System.out.println("Please, write");
        System.out.println("Enter END for close file");

        try {
            file = new FileOutputStream(filename + extension);
            toWrite = scanner.nextLine();

            while (!toWrite.equals("END")){
                for(int i=0; i < toWrite.length(); i++){
                    file.write(toWrite.charAt(i));
                }
                file.write('\r');
                file.write('\n');
                toWrite = in.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
