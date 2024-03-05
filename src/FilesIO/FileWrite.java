package FilesIO;

import java.io.*;

import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your data to write on the file ..");
        String s=sc.nextLine();

        try{
            File f=new File("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\A.txt");
            FileWriter fw=new FileWriter(f,true);
            fw.write(s);
            fw.flush();
            fw.close();

        }catch (Exception e) {
            e.printStackTrace();
        }


    }
}
