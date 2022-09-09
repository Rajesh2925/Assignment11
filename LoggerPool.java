package threadPoolExecution;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

 public class LoggerPool {

    public void performLogging(int id, int activeCount, long completedCount)
            throws SecurityException, IOException
    {

        // Create a Logger

        Logger logger = Logger.getLogger(LoggerPool.class.getName());

        FileHandler handler = new FileHandler("E:\\programs\\ThreadPoolLogs" + id+ ".txt");
        logger.addHandler(handler);
        logger.setLevel(Level.CONFIG);
        logger.config("Thread " + id + " has been initiated" + "\n" + "Active threads : " + activeCount + "\n" + "Completed Tasks : " + completedCount);
    }
}
