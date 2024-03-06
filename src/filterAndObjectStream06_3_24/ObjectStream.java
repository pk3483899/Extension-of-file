package filterAndObjectStream06_3_24;

import java.io.*;

class ObjectStreams {
    public static void main(String[] args) {

        int i = 5;
        String name = "I am Pradeep";

        try {
            File data = new File("C:\\Users\\pk348\\OneDrive\\OneDrive\\Desktop\\psa\\Numetry\\Files\\objectStream.txt");
            FileOutputStream file = new FileOutputStream(data);
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeInt(i);
            output.writeObject(name);
            FileInputStream fileStream = new FileInputStream("objectStream.txt");
            ObjectInputStream objStream = new ObjectInputStream(fileStream);
            System.out.println("Integer data :" + objStream.readInt());
            System.out.println("String data: " + objStream.readObject());
            output.close();
            objStream.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
