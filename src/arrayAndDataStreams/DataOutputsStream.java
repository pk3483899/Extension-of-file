package arrayAndDataStreams;


import java.io.*;
public class DataOutputsStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\A.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeInt(65);
        data.write('a');
        data.flush();
        data.close();
        System.out.println("Succcess...");
    }
}
