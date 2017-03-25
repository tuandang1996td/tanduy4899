/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Emtity.Employess;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class EmployeeDAL extends DataAceessHelper{
  
    private final String GET_LOGIN = "select * from Employess where username=? and password=?";
    private final String GET_ALL="select * from Employess";
    private final String ADD_DATA="insert into Employess(username,password,FullName,age,address,phone,depID,prID)"
            + "values(?,?,?,?,?,?,?,?)";
    private final String Update_DATA="Update"+
            " Employess set password=?,FullName=?,age=?,address=?,phone=?,depID=?,prID=? where username=?";

    private final String  REMOVE_DATA = "Delete from Employess where username=? ";
    public boolean getLogin(String u, String p){
        boolean check = false;
        try{
            getConnect();
            PreparedStatement ps = con.prepareStatement(GET_LOGIN);
            ps.setString(1, u);
            ps.setString(2, p);
            ResultSet rs = ps.executeQuery();
            if(rs !=null && rs.next()){
                check = true;
            }
            getClose();
     
        }catch(Exception e){
            e.printStackTrace();
        }
        return check;
    } 
    public ArrayList<Employess> getALL(){
        ArrayList<Employess> objs = new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps = con.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();
            if(rs!=null){
                while(rs.next()){
                    Employess item = new Employess();
                    item.setUsername(rs.getString("username"));
                    item.setPassworld(rs.getString("password"));
                    item.setFullName(rs.getString("FullName"));
                    item.setAge(rs.getString("age"));
                    item.setAddress(rs.getString("address"));
                    item.setPhone(rs.getString("phone"));
                    item.setPrID(rs.getInt("prID"));
                    item.setDepID(rs.getInt("depID"));
                    objs.add(item);
                    
                }
            }
            
            getClose();
        }catch(Exception e){
            e.getStackTrace();
        }
        return objs;
    }
    
    public boolean AddData(Employess emp){
        boolean check=false;
        try {
            getConnect();
            PreparedStatement ps = con.prepareStatement(ADD_DATA);
       
            ps.setString(1, emp.getUsername());
            ps.setString(2,  emp.getPassword());
            ps.setString(3,  emp.getFullName());
            ps.setString(4,  emp.getAge());
            ps.setString(5,  emp.getAddress());
            ps.setString(6,  emp.getPhone());
            ps.setInt(7,  emp.getDepID());
            ps.setInt(8,  emp.getPrID());
            int rs = ps.executeUpdate();
            if(rs > 0){
                check = true;
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
    
    public boolean DeleteData(String u){
        boolean check=false;
        try {
            getConnect();
            PreparedStatement ps = con.prepareStatement(REMOVE_DATA);
            ps.setString(1, u);
            int rs = ps.executeUpdate();
            if(rs>0){
                check = true;
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
     public boolean UpdateData(Employess emp){
        boolean check=false;
        try {
            getConnect();
            PreparedStatement ps = con.prepareStatement(Update_DATA);
       
            
            ps.setString(1,  emp.getPassword());
            ps.setString(2,  emp.getFullName());
            ps.setString(3,  emp.getAge());
            ps.setString(4,  emp.getAddress());
            ps.setString(5,  emp.getPhone());
            ps.setInt(6,  emp.getDepID());
            ps.setInt(7,  emp.getPrID());
            ps.setString(8, emp.getUsername());
            int rs = ps.executeUpdate();
            if(rs > 0){
                check = true;
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
}

