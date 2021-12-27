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
        //Login
        Login Login = new Login();
        Login.setTitle("National Bank Of Egypt ATM");
        Login.setVisible(true);
        Login.setSize(700, 700);
        Login.setLocationRelativeTo(null);// to make in cener
        Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //MainPage
        MainPage MainPage = new MainPage();
        MainPage.setTitle("National Bank Of Egypt ATM");
        MainPage.setVisible(true);
        MainPage.setSize(700, 700);
        MainPage.setLocationRelativeTo(null);// to make in cener
        MainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //MoreOptions()
        MoreOptions MoreOptions=new MoreOptions();
        MoreOptions.setTitle("National Bank Of Egypt ATM");
        MoreOptions.setVisible(true);
        MoreOptions.setSize(700, 700);
        MoreOptions.setLocationRelativeTo(null);// to make in cener
        MoreOptions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
