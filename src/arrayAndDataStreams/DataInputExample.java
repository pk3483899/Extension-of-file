package arrayAndDataStreams;

import java.io.*;
public class DataInputExample {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\A.txt");
        DataInputStream inst = new DataInputStream(input);
        int count = input.available();
        byte[] ary = new byte[count];
        inst.read(ary);
        for (byte bt : ary) {
            char k = (char) bt;
            System.out.print(k+"-");
        }
    }
}