package FilesIO;// java program to use FileOutputStream object for writing
// data

import java.io.*;

class FileOutputStreams {
    public static void main(String[] args)
            throws IOException
    {
        int i;
        FileOutputStream fout = new FileOutputStream("../files/outputStream.txt",
                true);
        String st = "Pradeep Kumar ";

        char ch[] = st.toCharArray();
        for (i = 0; i < st.length(); i++) {
            fout.write(ch[i]);
        }
        fout.close();
    }
}

