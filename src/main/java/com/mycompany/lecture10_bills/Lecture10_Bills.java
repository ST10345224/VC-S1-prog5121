/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecture10_bills;

import javax.swing.*;

/**
 *
 * @author psyke
 */
public class Lecture10_Bills {

    public static void main(String[] args) {
        
        String strName = JOptionPane.showInputDialog(null, "Enter the customer's name");
        double dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the minutes talked"));
        double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the cost"));
        
        //sends the variables to contructor in the bills class
        
        bills b = new bills(strName, dblMinutesTalked, dblCostPerMinute);
        
        JOptionPane.showMessageDialog(null, "Customer Name: " + b.getName().toUpperCase() + "\nTotal Due: R" + b.getTotalBills());
    }
}
