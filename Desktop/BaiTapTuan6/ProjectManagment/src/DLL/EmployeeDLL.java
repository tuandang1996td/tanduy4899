/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

import DAL.EmployeeDAL;
import Emtity.Employess;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class EmployeeDLL {
    EmployeeDAL dal = new EmployeeDAL();
    public boolean  getLogin(String u,String p){
        return dal.getLogin(u, p);
    }
    public ArrayList<Employess> getALL(){
        return dal.getALL();
    }
    public boolean AddData(Employess emp){
        return dal.AddData(emp);
    }
    public boolean Delete(String u){
        return dal.DeleteData(u);
    }
    public boolean update(Employess emp){
        return dal.UpdateData(emp);
    }
}
