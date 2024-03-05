package arrayAndDataStreams;

import java.io.IOException;

public class ByteArrayInputStream {
    public static void main(String[] args) throws IOException {
        byte[] buf = { 35, 36, 37, 38,96,34,90,91,82,55 };
        java.io.ByteArrayInputStream byt = new java.io.ByteArrayInputStream(buf);
        int k = 0;
        while ((k = byt.read()) != -1) {
            char ch = (char) k;
            System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
        }
    }
}
