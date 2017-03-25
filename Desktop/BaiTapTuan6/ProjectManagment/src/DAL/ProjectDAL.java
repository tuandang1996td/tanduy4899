/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Emtity.Department;
import Emtity.Project;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ProjectDAL extends DataAceessHelper{
     private final String GET_BY_ID= "select * from Project where prID = ? ";
     private final String GET_ALL= "select * from Project ";
    
    public ArrayList<Project>getByID(int id){
        ArrayList<Project> objs = new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps = con.prepareStatement(GET_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs!=null && rs.next()){
                Project item = new Project();
                item.setPrID(rs.getInt("prID"));
                item.setPrName(rs.getString("prName"));
                objs.add(item);
            }
            getClose();
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        return objs;
    }
    
    public ArrayList<Project> getALL(){
         ArrayList<Project> objs = new ArrayList<>();
         try{
             getConnect();
             PreparedStatement ps = con.prepareStatement(GET_ALL);
             ResultSet rs = ps.executeQuery();
             if(rs!=null){
                 while(rs.next()){
                    Project item = new Project();
                    item.setPrID(rs.getInt("prID"));
                    item.setPrName(rs.getString("prName"));
                    objs.add(item);
                 }
             }
             
             getClose();
             
         }catch(Exception e){
             e.printStackTrace();
         }
         return objs;
    }
}
