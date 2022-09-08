import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderExample {
    public static void main(String args[])throws Exception{
        FileReader fr=new FileReader("D:\\testout.txt");
        FileWriter fw=new FileWriter("D:\\testout.txt");
        int i;
        fw.write('{');

        while((i=fr.read())!=-1)
            fw.write((char)i);
            System.out.print((char)i);
        fr.close();
    }
}