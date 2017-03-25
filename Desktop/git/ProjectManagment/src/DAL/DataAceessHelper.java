/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author PC
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataAceessHelper {

    protected Connection con ;
    String HostName = "localhost";
    String port ="1433";
    String dbName= "ProjectManagment";
    String use = "sa";
    String pass= "tanduy899";
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String URL =  "jdbc:sqlserver://"+HostName+ ":"+ port +";database=" +dbName;
	        
   

    public void getConnect() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(URL, use, pass);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void getClose() {
        try {
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
