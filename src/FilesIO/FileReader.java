package FilesIO;

import java.io.*;

public class FileReader {
    public static void main(String[] args) {
        try{
            File f=new File("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\A.txt");

            java.io.FileReader fr=new java.io.FileReader(f);
            if(f.exists()) {
                for (int i = 0; i < f.length(); i++) {
                    System.out.print((char) fr.read());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
