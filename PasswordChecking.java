import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordChecking {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

       Boolean b= Pattern.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$",sc.next());
       System.out.println(b);
    }

}
