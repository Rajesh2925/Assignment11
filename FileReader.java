import java.io.*;
import java.util.ArrayList;

public class FileReader {
         public static void main(String args[]) throws IOException {
            FileInputStream in = null;
            FileOutputStream out = null;
            ArrayList<String> ar=new ArrayList<>();

            try {
                String str="";
                in = new FileInputStream("E:\\programs\\input.txt");
                out = new FileOutputStream("E:\\programs\\output.txt");

                int c;

                while ((c = in.read()) != -1) {
                    str += (char) c;
                    out.write(c);


                }

             String [] words = str. split(" ");



            }finally {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            }
        }
    }

