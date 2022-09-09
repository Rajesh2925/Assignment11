package threadPoolExecution;

 import java.text.*;
 import java.util.*;

public class SingleThread extends Thread{

    String text;
    static int id = 0;

    public SingleThread(String text)
    {
        this.text = text;
        id++;
    }

    public void run(){

        for (int i = 0; i<=2; i++)
        {
            if (i==0)
            {
                Date d = new Date();
                SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                System.out.println("Initial Time for Text : "
                        + text +" = " +ft.format(d));

            }
            else
            {
                Date d = new Date();
                SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                System.out.println("Executing Time for Text : "+
                        text +" = " +ft.format(d));

            }
            try {
                Thread.sleep(1000);
                System.out.println("Text : " + text);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }


        }

    }
}
