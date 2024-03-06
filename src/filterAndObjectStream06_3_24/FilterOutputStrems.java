package filterAndObjectStream06_3_24;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//implimented by OutputStream and extended by BufferedOutput and DataOutputStream
public class FilterOutputStrems {
    public static void main(String[] args) throws IOException {
        File data = new File("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\FilterStream.txt");
        FileOutputStream file = new FileOutputStream(data);
        FilterOutputStream filter = new FilterOutputStream(file);
        String name="Hello My name is Pradeep Kumar Yadav";
        byte b[]=name.getBytes();
        String add="Hello like to play cricket";
        byte[] bytes = add.getBytes();
        filter.write(bytes);
        filter.write(b);
        filter.flush();
        filter.close();
        file.close();

    }
}
