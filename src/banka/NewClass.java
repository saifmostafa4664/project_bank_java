
package banka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.net.nt.ConnOption;


public class NewClass {
     private String onwernum ;
  private String accountnum ;
  double balacy ;
  Connection con = null;
PreparedStatement pst = null ;
ResultSet rs = null ;
    
    
    
    NewClass(String onwernum , String accountnum , double balacy){
       
          String sql = "INSERT INTO BANKACCOUNT (ACCOUNTNUM, ONWERNUM,  BALACY) VALUES(?,?,?)";
         
    
        this.onwernum = onwernum ;
        this.accountnum = accountnum ;
        this.balacy = balacy;
    
    }

    public String getOnwernum() {
        return onwernum;
    }

    public void setOnwernum(String onwernum) {
        this.onwernum = onwernum;
    }

    public String getAccountnum() {
        return accountnum;
    }

    public void setAccountnum(String accountnum) {
        this.accountnum = accountnum;
    }

    public double getBalacy() {
        return balacy;
    }

    public void setBalacy(double balacy) {
        this.balacy = balacy;
    }
    public  void debosin(double  amount){
    if(balacy >= amount ){
    balacy = balacy - amount;
    }else{
        System.out.println("erro");
    }
    }
    public void  aamount(double  amount){
    balacy = balacy + amount ;
    }
    public NewClass crayataccount(String onwernum , String accountnum , double balacy){
        return  new NewClass(onwernum, accountnum, balacy);
    
    }
    public void bb(double amount ,NewClass n){
        n.debosin(amount);
        this.aamount(amount);
    }

}
