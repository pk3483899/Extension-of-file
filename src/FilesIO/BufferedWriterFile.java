package FilesIO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterFile {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\A.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("Hello World");
            bw.newLine();
            bw.write("How are you?");
            bw.flush();
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
