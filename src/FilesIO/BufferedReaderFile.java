package FilesIO;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderFile {
    public static void main(String[] args) {
        try{
            FileReader f=new FileReader("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\A.txt");
            BufferedReader br=new BufferedReader(f);
            while (br.readLine()!=null) {
                System.out.println(br.readLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
