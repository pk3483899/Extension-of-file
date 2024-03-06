package arrayAndDataStreams;

import java.io.*;
public class ByteArrayOutputStreams {
    public static void main(String args[])throws Exception{
        FileOutputStream fout1=new FileOutputStream("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\f2.txt");
        FileOutputStream fout2=new FileOutputStream("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\f2.txt");

        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        bout.write(65);
        bout.write(28);
        bout.write(56);
        bout.write(67);
        bout.writeTo(fout1);
        bout.writeTo(fout2);

        bout.flush();
        bout.close();
        System.out.println("Success...");
    }
}
