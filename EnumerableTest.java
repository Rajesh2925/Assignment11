import java.util.Vector;
import java.util.Enumeration;
public class EnumerableTest {


    public static void main(String args[]) {


        Enumeration cricketers;
        Vector<String> cric = new Vector<>();
        cric.add("virat");
        cric.add("sachin");
        cric.add("virat");
        cric.add("sachin");
        cric.add("virat");
        cric.add("sachin");

        cricketers = cric.elements();

        while (cricketers.hasMoreElements()) {
            System.out.println(cricketers.nextElement());
        }
    }
}
