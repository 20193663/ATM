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
        Login frame1 = new Login();
        frame1.setTitle("National Bank Of Egypt ATM");
        frame1.setVisible(true);
        frame1.setSize(700, 700);
        //frame1.setBackground(new Color(60, 70, 92));//new Color(60, 70, 92)
        frame1.setLocationRelativeTo(null);// to make in cener
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
