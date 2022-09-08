import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;

public class stackCollection {
    public static void main(String args[]){
        ArrayList ar=new ArrayList();
        ar.add(1);
        ar.add(2);
        ar.add(3);

        Stack st=new Stack();
        st.addAll(ar);
        Enumeration em= st.elements();
        while(em.hasMoreElements()){
            System.out.println(em.nextElement());
        }



    }
}
