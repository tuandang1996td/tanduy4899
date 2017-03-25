/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emtity;

/**
 *
 * @author PC
 */
public class Employess {

    String username;
    String password;
    String Fullname;
    String age;
    String address;
    String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    int depID;
    int prID;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassworld(String passworld) {
        this.password = password;
    }

    public String getFullName() {
        return Fullname;
    }

    public void setFullName(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDepID() {
        return depID;
    }

    public void setDepID(int depID) {
        this.depID = depID;
    }

    public int getPrID() {
        return prID;
    }

    public void setPrID(int prID) {
        this.prID = prID;
    }

}
