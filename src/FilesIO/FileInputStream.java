package FilesIO;


public class FileInputStream {
    public static void main(String[] args){
        try{
            java.io.FileInputStream fin=new java.io.FileInputStream("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\A.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){
        e.printStackTrace();
        }
    }
}
