import java.io.*;

public class Task {
    public static void main(String[] ar) {
        Task t = new Task();
        Database d = t.readCSV("./resources/iris-data.csv");
    }

    public Database readCSV(String filename) {
        String contents = "";
        try (InputStream in = new FileInputStream(filename)
                /* TODO.
Change what needs to go here to start reading "filename" */){
            byte[] buffer = new byte[in.available()];
                    /* TODO
Create a byte array of about 1024 bytes or however many bytes you want. */;
            int lengthRead = in.read(buffer);
            /* TODO 
Create a while loop to read the contents of the file and put them in the variable "contents" declared at the beginning of the method. */
            while (lengthRead != -1) {
                contents += new String(buffer);
                lengthRead = in.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        return new Database(contents);
    }
}
