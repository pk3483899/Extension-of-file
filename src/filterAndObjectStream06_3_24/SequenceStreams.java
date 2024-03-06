package filterAndObjectStream06_3_24;


import java.io.*;
class InputStreamExample {
    public static void main(String args[])throws Exception{
        File file1 = new File("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\SeqenceStream1.txt");
        File file2 = new File("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\SeqenceStream2.txt");
        FileInputStream input1=new FileInputStream(file2);
        System.out.println();
        FileInputStream input2=new FileInputStream(file1);
        SequenceInputStream sequenceInputStream=new SequenceInputStream(input1,input2);
        int i;
        while((i=sequenceInputStream.read())!=-1){
            System.out.print((char)i);
        }
        sequenceInputStream.close();
        input1.close();
        input2.close();
    }
}
