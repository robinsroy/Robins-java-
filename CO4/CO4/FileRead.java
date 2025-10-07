import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }

    // Method that declares throws IOException
    public static void readFile() throws IOException {
        System.out.println("Trying to open 'data.txt'");
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println("File contains: " + line);
        }
        br.close();
    }
}
