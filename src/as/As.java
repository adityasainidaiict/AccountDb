/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package as;


import java.sql.*;

/**
 *
 * @author aditya
 */
public class As {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           try{
               Class.forName("org.postgresql.Driver");
               Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/backoff",
                      "postgres", "dbms");
               Statement st = conn.createStatement();
              
              // st.execute("CREATE TABLE Employees(id int , name char varying , address char varying , lot int)");
              // st.execute("INSERT INTO employee (eid,einame,eaddress) VALUES('105','vasthav','A-213')");
               ResultSet rs = st.executeQuery("SELECT acc_id FROM account WHERE inventory_in_stock = 42918;");
                       while(rs.next()){
                           int i = rs.getInt("acc_id");
                           System.out.println(i);
                       }
           }
           catch(Exception ex){
              ex.printStackTrace();
           }	
        
    }
}
