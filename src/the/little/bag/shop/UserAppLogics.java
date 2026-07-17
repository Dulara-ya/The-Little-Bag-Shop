/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package the.little.bag.shop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import the.little.bag.shop.User;



/**
 *
 * @author Dulara Sandamal
 */
public class UserAppLogics {
    public boolean GetValidUser(String userName,String password){
        return true;
    }
    public void AddNewUser(User newUser){
        String userData=newUser.GetFirstName()+","+
                        newUser.GetLastName()+","+
                        newUser.GetUserName()+","+
                        newUser.GetPassword();
        
        try {
          Writer output;
            output = new BufferedWriter(new FileWriter(
                    "C:\\Users\\Dulara Sandamal\\Desktop\\The Little Bag Shop\\User.txt",true));
            output.append(userData);
            output.append("\n");
            output.close();
            JOptionPane.showMessageDialog(null, "New user has been added");
        } 
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public List<User> DisplayUserList(){
        List<User> totalusersList=new ArrayList<>();
        try{
            File userFile=new File("C:\\Users\\Dulara Sandamal\\Desktop\\The Little Bag Shop\\User.txt");
            try (Scanner myReader = new Scanner(userFile)) {
                while(myReader.hasNextLine()){
                    String userData=myReader.nextLine();
                    ArrayList<String> userList=new ArrayList<>(Arrays.asList(userData.split(",")));
                    User users=new User();
                    users.SetFirstName(userList.get(0));
                    users.SetLastName(userList.get(1));
                    users.SetUserName(userList.get(2));
                    users.SetPassword(userList.get(3));
                    totalusersList.add(users);
                }
            }
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return totalusersList;
    }}

    
 

