package testing;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class connect {
	 public static void main(String[]args) throws Exception {
createTable();
post();
get();
}
	 public static ArrayList<String> get () throws Exception{
		 try {
		 Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement("SELECT first, second, third, fourth FROM word");
		
		 ResultSet result =statement.executeQuery();
		 
		 ArrayList<String> arry = new ArrayList<String>();
		 while(result.next()) {
			 System.out.print(result.getString("first"));
			 System.out.print("");
			 System.out.println(result.getString("second"));
			 System.out.print("");
			 System.out.println(result.getString("third"));
			 System.out.print("");
			 System.out.println(result.getString("fourth"));
			 
		
		 }
		 System.out.println("All records have been selected");
		return arry;
		 }catch(Exception e) {System.out.println(e);}
	 return null;

		 }
		
	 
	 public static void post()throws Exception{
		 final String var1= "the";
		 final String var2 = "test";
		 final String var3= "this";
		 final String var4 = "a";
		 try {
		 Connection con = getConnection();
		 PreparedStatement posted = con.prepareStatement(" INSERT INTO word (first,second,third,fourth) VALUES ('"+var1+"','"+var2+"','"+var3+"','"+var4+"')");
	
		posted.executeUpdate();
	 
	 } catch(Exception e) {System.out.println(e);}
	 finally {
		 System.out.println("Insert Completed");
	 }
	 }
	 public static void createTable() throws Exception {
		 try {
			 Connection con = getConnection();
			 PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS word(id int NOT NULL AUTO_INCREMENT, first varchar(255), second varchar(255), third varchar(255), fourth varchar(255), PRIMARY KEY(id))");
		create.executeUpdate();
		 } catch (Exception e) {System.out.println(e);}
		 finally {System.out.println("Function complete.");
	 };
	 
	 }
	 public static Connection getConnection() throws Exception{
try {
	
	String url = "jdbc:mysql://127.0.0.1:3306/mysql";
	String username= "root";
	String password = "mypass2267++";
	
	Connection conn = DriverManager.getConnection(url,username,password);
	System.out.println("Connected");
	return conn;
} catch (Exception e) {System.out.println(e);}
		 return null;
	 }
	 }