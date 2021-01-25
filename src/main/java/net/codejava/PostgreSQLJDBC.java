package net.codejava;
import java.sql.Connection;
import java.sql.DriverManager;
public class PostgreSQLJDBC {
   public static void main(String args[]) {
      Connection c = null;
      try {
         Class.forName("org.postgresql.Driver");
         /*c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
            "postgres", "root");*/
         c = DriverManager.getConnection("jdbc:postgresql://ec2-54-84-238-74.compute-1.amazonaws.com:5432/d2n17qnuid1vgs?sslmode=require",
        		 "zmtwdxjazizgbe", "6ab8b409193e70b70d7d65a495f5e7592360f76e2a517576c6007106801f7a64");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
   }
}