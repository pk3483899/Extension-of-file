package filterAndObjectStream06_3_24;

import java.io.*;
public class FilterInutStreams {
    public static void main(String[] args) throws IOException {
        File data = new File("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\FilterStream.txt");
        FileInputStream  file = new FileInputStream(data);
        FilterInputStream filter = new BufferedInputStream(file);
        int k =0;
        while((k=filter.read())!=-1){
            System.out.print((char)k);
        }
        file.close();
        filter.close();
    }
}
