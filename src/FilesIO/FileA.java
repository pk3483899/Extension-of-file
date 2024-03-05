package FilesIO;

import java.io.File;

public class FileA {
    public static void main(String[] args) {
        try{
            File f=new File("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\A.txt");
            System.out.println("File exists: "+f.exists());
            System.out.println("Number of chars in the file: "+f.length());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
