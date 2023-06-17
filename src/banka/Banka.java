
package banka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Banka {

  
    public static void main(String[] args) {
  Connection con = null;
PreparedStatement pst = null ;
ResultSet rs = null ;
        try{
        String sq = "UPDATE employees set salary = 26000 WHERE employee_id = 101";
        con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb" , "hr" , "hr");
        pst = con.prepareStatement(sq);
            System.out.println("sq");
            pst.executeUpdate();
            
        }catch(Exception ex ){
        
            JOptionPane.showMessageDialog(null, ex);
        }
       

    }
    
}
