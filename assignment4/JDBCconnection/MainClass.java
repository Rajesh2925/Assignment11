package JDBCconnection;

import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws SQLException  {
		 Scanner sc=new Scanner(System.in);
		 JDBC1 con = new JDBC1();
        //con.getConnection();
        int choice;
        int flag=1;
        while(flag==1) {
        
       	 System.out.println("Enter your choice \n 1. insertion  \n 2. deletion \n 3.updation \n 4.selection \n 5. exit");
       	  choice=sc.nextInt();
       	 switch(choice) {
	     //conn.connect();
       
       case 1: 
	  
       		con.insertion();
       		break;
       case 2:
       	   con.deletion();
       	   break;
       case 3:
       	   con.updation();
       	   break;
       case 4:
       	   con.select();
       	   break;
       case 5:
       	   System.out.println("Thankyou the program ends here");
       	   flag=0;
       default:
       	   System.out.println("Something went wrong try again...");
          	   break;
	    }

     }

   }
}

