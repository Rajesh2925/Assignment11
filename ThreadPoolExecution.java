package threadPoolExecution;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

    public class ThreadPoolExecution {


        public static void main(String[] args) throws SecurityException, IOException, InterruptedException {


            SingleThread t1 = new SingleThread("Do good Be good");
            SingleThread t2 = new SingleThread("Let there be peace");
            Thread t3 = new SingleThread("This shall too pass");
            Thread t4 = new SingleThread("All is Well");
            Thread t5 = new SingleThread("Spread Love ");


            ExecutorService pool = Executors.newFixedThreadPool(3);
            pool.execute(t1);

            System.out.println();
            if (pool instanceof ThreadPoolExecutor) {
                System.out.println("Pool size is now " + ((ThreadPoolExecutor) pool).getActiveCount());
            }
            System.out.println();
            pool.execute(t2);
            System.out.println("Pool size is now " + ((ThreadPoolExecutor) pool).getActiveCount());
            pool.execute(t3);
           System.out.println();
            if (pool instanceof ThreadPoolExecutor) {
                System.out.println("Pool size is now " + ((ThreadPoolExecutor) pool).getActiveCount());
            }
            System.out.println();
            pool.execute(t4);
            if (pool instanceof ThreadPoolExecutor) {
                System.out.println("Pool size is now " + ((ThreadPoolExecutor) pool).getActiveCount());
            }
            System.out.println("Pool size is now " + ((ThreadPoolExecutor) pool).getActiveCount());
            pool.execute(t5);
            System.out.println();
            System.out.println("Pool size is now " + ((ThreadPoolExecutor) pool).getActiveCount());
            pool.shutdown();
            //System.out.println("Pool size is now " + ((ThreadPoolExecutor) pool).getActiveCount());




        }
    }







