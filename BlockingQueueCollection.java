import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueCollection {
     public static void main(String args[]){
         BlockingQueue<Integer> bq=new ArrayBlockingQueue<Integer>(10);
         bq.add(12);
         bq.add(15);
         bq.add(10); bq.add(12);
         bq.add(15);
         bq.add(10); bq.add(12);

         Iterator k=bq.iterator();
         while(k.hasNext()){
             System.out.println(k.next());
         }
         }


     }

