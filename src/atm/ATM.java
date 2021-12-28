/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Dell
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        //set frame
        this.setTitle("National Bank Of Egypt ATM");
        this.setVisible(true);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);// to make in cener
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        */
        //Login
        Login Login = new Login();
        //MainPage
        MainPage MainPage = new MainPage();
        //MoreOptions()
        //op Knowing the balance, withdrawing and depositing, changing the password
        MoreOptions MoreOptions=new MoreOptions();
        //Knowingthebalance
        Knowingthebalance Knowingthebalance=new Knowingthebalance();
        //Withdrawing
        Withdrawing Withdrawing=new Withdrawing();
        //Depositing
        
        //changing the password
        
    }
    
}
