/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package the.little.bag.shop;

/**
 *
 * @author Dulara Sandamal
 */
public class User {
    //encapsulation by using get/set member function with private var
    String fName,lName,uName,pwd;
    int uType;
    
    //get function
    public String GetFirstName(){
        return fName;
    }
    //set function
    public void SetFirstName(String firstName){
        fName=firstName;
    }
    //get function
    public String GetLastName(){
        return lName;
    }
    //set function
    public void SetLastName(String lastName){
        lName=lastName;
    }
    //get function
    public String GetUserName(){
        return uName;
    }
    //set function
    public void SetUserName(String userName){
        uName=userName;
    }
    //get function
    public String GetPassword(){
        return pwd;
    }
    //set function
    public void SetPassword(String password){
        pwd=password;
    }
    //get function
    public int GetUserType(){
        return uType;
    }
    //set function
    public void SetUserType(int userType){
        uType=userType;
    }
}