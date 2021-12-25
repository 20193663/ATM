/*
 * To change this license ScreenHeaderP, choose License Headers in Project Properties.
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
public class Login extends JFrame implements ActiveEvent{
    //frame stuff
    JPanel BaseP,ScreenP, ScreenHeaderP, ScreenCenterP, ScreenCenterDialogueP, ScreenCenterButtonsP, p6,p7,p8;
    //TextField pin;
    final JPasswordField pin;// finel to not change
    JButton ClearB,LoginB, b2, b3;
    JLabel WelcomeHeaderL, PinQL;
    
    public Login(){
        BaseP = new JPanel();
        BaseP.setLayout(new GridLayout(2, 1));
        BaseP.setBackground(new Color(60, 70, 92));// set BaseP Background Color(60, 70, 92)
        
        //panel 1 the ScreenP panel 2 the ScreenHeaderP
        ScreenP = new JPanel(new BorderLayout());
        ScreenHeaderP = new JPanel();
        WelcomeHeaderL = new JLabel("Welcome to the National Bank Of Egypt", SwingConstants.CENTER);
        WelcomeHeaderL.setFont(new Font("Times", Font.BOLD, 30));
        WelcomeHeaderL.setForeground(new Color(0, 153, 0));
        //l1.setOpaque(true);
        //l1.setBorder(new LineBorder(Color.white));
        WelcomeHeaderL.setBackground(Color.white);
        ScreenHeaderP.add(WelcomeHeaderL);
        //p1.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        ScreenP.add(ScreenHeaderP,BorderLayout.NORTH);
        ScreenHeaderP.setPreferredSize(new Dimension(0, 60));
        
        //panel 3 ScreenCenterP
        ScreenCenterP = new JPanel(new GridLayout(2, 1));
        ScreenCenterP.setBackground(new Color(60, 70, 92));// set BaseP Background Color(60, 70, 92)
        //p4 for  label and textfild
        ScreenCenterDialogueP= new JPanel();//new GridLayout(2, 1)
        ScreenCenterDialogueP.setBackground(new Color(60, 70, 92));// set BaseP Background Color(60, 70, 92)
        //label
        PinQL=new JLabel("Please enter your pin", SwingConstants.CENTER);//label 2
        PinQL.setFont(new Font("Times", Font.PLAIN+Font.BOLD, 30));
        PinQL.setForeground( Color.WHITE);
        PinQL.setBounds(80, 30, 500, 50);
        //TextField
        //https://www.zentut.com/java-swing/creating-password-field-by-using-jpasswordfield-class/
        //t1=new TextField("");
        pin = new JPasswordField();//JPasswordField
        pin.setBounds(265, 80, 125, 50);
        pin.setColumns(4);//pin is 4 num
        pin.setFont(new Font("Times", Font.PLAIN+Font.BOLD, 30));
        PinQL.setLabelFor(pin);
        //add PinQL and pin
        ScreenCenterDialogueP.add(PinQL);//add label 2
        ScreenCenterDialogueP.add(pin);//add JPasswordField
        ScreenCenterDialogueP.setLayout(null);
        //p5 for Button 
        ScreenCenterButtonsP= new JPanel();
        ScreenCenterButtonsP.setBackground(new Color(60, 70, 92));// set BaseP Background Color(60, 70, 92)
        //Button ClearB
        ClearB=new JButton("Clear");
        ClearB.setPreferredSize(new Dimension(150, 50));
        ClearB.setBackground(Color.white );
        ClearB.setFont(new Font("Times", Font.BOLD, 15));
        ClearB.setForeground(new Color(255, 153, 0));
        ClearB.setBounds(65, 50, 200, 50);
        //Button LoginB
        LoginB=new JButton("Login");
        LoginB.setPreferredSize(new Dimension(150, 50));
        LoginB.setBackground(Color.white );
        LoginB.setFont(new Font("Times", Font.BOLD, 15));
        LoginB.setForeground(new Color(0, 153, 0));
        LoginB.setBounds(400, 50, 200, 50);
        
        ScreenCenterButtonsP.add(ClearB);
        ScreenCenterButtonsP.add(LoginB);
        ScreenCenterButtonsP.setLayout(null);
        //add in ScreenCenterP
        ScreenCenterP.add(ScreenCenterDialogueP);//p3 add ScreenCenterDialogueP for label and textfild 
        ScreenCenterP.add(ScreenCenterButtonsP);//p3 add ScreenCenterButtonsP for Button 
        ScreenP.add(ScreenCenterP,BorderLayout.CENTER);
        //west button
        p6 = new JPanel();
        
        
        
        BaseP.add(ScreenP);
        this.add(BaseP);
    }
    @Override
    public void dispatch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
