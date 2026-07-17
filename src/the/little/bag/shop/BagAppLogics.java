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
/**
 *
 * @author Dulara Sandamal
 */
public class BagAppLogics {
    public boolean GetValidUser(String userName, String password) {
        // Assuming this is always true for now; you can update with actual logic
        return true;
    }

    
    public void AddNewBag(Bag newBag) {
        String bagData = newBag.GetBagId() + "," +
                         newBag.GetBagName() + "," +  // Fixed missing '+' here
                         newBag.GetBagCategory() + "," +
                         newBag.GetBagPrice();

        try {
            Writer output;
            output = new BufferedWriter(new FileWriter(
                    "C:\\Users\\Dulara Sandamal\\Desktop\\The Little Bag Shop\\Item.txt",true));
            output.append(bagData);
            output.append("\n");
            output.close();
            JOptionPane.showMessageDialog(null, "New Item has been added");
        } 
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }}