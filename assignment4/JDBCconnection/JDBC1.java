package JDBCconnection;
import java.sql.*;
import java.util.Scanner;
public class JDBC1 {
	private static Connection conn=null;	
	static
		{
			String url = "jdbc:postgresql://localhost:5432/Database1";
			String user = "postgres";
			String pass = "postgres";
			try {
				//Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, pass);
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	   public Connection getConnection()
		   {
		   		
		   return conn;
		   }
	   
	   public void select() throws SQLException {
			   Connection conn = getConnection();
	            Statement st=conn.createStatement();
	            ResultSet rs = st.executeQuery("SELECT * FROM customersone");
	            ResultSetMetaData md=rs.getMetaData();
	            int column=md.getColumnCount();
	            
	            while ( rs.next() ) {
	            	 System.out.println("---------------------------------------");
	                String cusid = rs.getString("cusid");
	          
	                System.out.print(cusid+" | ");
	                String cname = rs.getString("cname");
	                
	                System.out.print(cname+" | ");
	                String address = rs.getString("address");
	                
	                System.out.print(address+" | ");
	                String city = rs.getString("city");
	                
	                System.out.print(city+" | ");
	            

	            System.out.println();
	            }
	   }
       public void insertion() throws SQLException {
	        	Connection conn = getConnection();
	        	Statement st=conn.createStatement();
	        	
	        	Scanner sc =new Scanner(System.in);
	        	System.out.println("enter customer ID (note:PRIMARY KEY");

	        	int cusid=sc.nextInt();
	        	   System.out.println("ENTER CUSTOMER NAME: ");

	        	String cname=sc.next();
	        	   System.out.println("ENTER THE ADDRESS: ");
	        	Scanner scanner = new Scanner(System.in).useDelimiter("\n");
	        	String address=scanner.next();
	        	   System.out.println("ENTER THE CITY NAME");

	        	String city=sc.next();
	        	String query = "insert into public.customersone(cusid,cname,address,city) values ("+cusid+",'"+cname+"','"+address+"','"+city+"')";
	            PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.execute();   
	            
	    } 
	    public void deletion() throws SQLException {
	        	Connection conn = getConnection();
	        	Statement st=conn.createStatement();
	        	Scanner sc=new Scanner(System.in);
	        	System.out.println("ENTER THE CUSTOMER NAME TO DELETE: ");

	        	String cname=sc.next();
	        	
	        	st.executeUpdate("DELETE from public.customersone" + " WHERE cname='"+cname+"'");
	            }
        public void updation() throws SQLException{
	        	Connection conn = getConnection();
	        	Statement st=conn.createStatement();
	        	Scanner sc=new Scanner(System.in);
	        	System.out.println("ENTER THE CUSTOMER ID TO UPDATE: ");

	        	int cusid=sc.nextInt();
	        	System.out.println("ENTER NEW CUSTOMER NAME: ");
	        	Scanner scanner = new Scanner(System.in).useDelimiter("\n");
	            
	        	String cname=sc.next();
	        	System.out.println("ENTER THE CITY NAME: ");

	        	String city=sc.next();
	        	System.out.println("ENTER THE NEW ADDRESS: ");

	        	String address=scanner.next();
	        	
	        	String query = "UPDATE customersone SET cname= '"+cname+"',address= '"+address+"', city= '"+city+"' WHERE cusid= "+cusid;

	            
	            PreparedStatement preparedStmt = conn.prepareStatement(query);
	            preparedStmt.execute();
	        	
	        }


		
	}



