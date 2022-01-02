/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import static atm.ATM.password;
import static atm.ATM.Balance;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Dell
 */
public class MenuBarOP extends JFrame implements ActionListener{
    Color Background =new Color(60, 70, 92);
    JPanel BaseP,p1,p2,p3,p4,p5,p6;
    JLabel User,Pass,NBalance,Npassword;
    //TextField 
    JTextField UserT,NBalanceT;
    JPasswordField PassT,NpasswordT;
    //button
    JButton Login,Done,Close,Exit;
    //user and pass
    String user="admin",pass="admin";
    public MenuBarOP(){
        BaseP =new JPanel(new GridLayout(7, 1, 5, 5));
        BaseP.setBackground(Background);
        
        p1=new JPanel();
        p1.setBackground(Background);
        User =new JLabel("User Name:");
        User.setForeground(Color.WHITE);
        UserT = new JTextField("admin",20);
        User.setLabelFor(UserT);
        p1.add(User);p1.add(UserT);
        UserT.addActionListener(this);
        
        p2=new JPanel();
        p2.setBackground(Background);
        Pass =new JLabel("Password:");
        Pass.setForeground(Color.WHITE);
        PassT = new JPasswordField(20);
        Pass.setLabelFor(PassT);
        p2.add(Pass);p2.add(PassT);
        PassT.addActionListener(this);
        
        p3=new JPanel();
        p3.setBackground(Background);
        Login=new JButton("Login");
        Login.addActionListener(this);
        Close=new JButton("Close");
        Close.addActionListener(this);
        p3.add(Close);p3.add(Login);
        
        p4=new JPanel();
        p4.setBackground(Background);
        NBalance =new JLabel("New Balance:");
        NBalance.setForeground(Color.WHITE);
        NBalanceT= new JTextField(20);
        NBalanceT.setEditable(false);
        NBalance.setLabelFor(NBalanceT);
        p4.add(NBalance);p4.add(NBalanceT);
        NBalanceT.addActionListener(this);
        
        p5=new JPanel();
        p5.setBackground(Background);
        Npassword =new JLabel("New Password:");
        Npassword.setForeground(Color.WHITE);
        NpasswordT= new JPasswordField(20);
        NpasswordT.setEditable(false);
        Npassword.setLabelFor(NpasswordT);
        p5.add(Npassword);p5.add(NpasswordT);
        NpasswordT.addActionListener(this);
        
        p6=new JPanel();
        p6.setBackground(Background);
        Done=new JButton("Done");
        Done.setEnabled(false);
        Done.addActionListener(this);
        Exit=new JButton("Exit");
        Exit.setEnabled(false);
        Exit.addActionListener(this);
        p6.add(Exit);p6.add(Done);
        
        BaseP.add(p1);
        BaseP.add(p2);
        BaseP.add(p3);
        JLabel note = new JLabel("Note: keep null if you wouldn't to change.",SwingConstants.CENTER);
        note.setForeground(Color.red);
        BaseP.add(note);
        BaseP.add(p4);
        BaseP.add(p5);
        BaseP.add(p6);
        this.add(BaseP);
        //set frame
        this.setTitle("Settings");
        this.setVisible(true);
        this.setSize(350, 300);
        this.setLocationRelativeTo(null);// to make in cener
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Login":
                if(PassT.getText().equals(pass)&&UserT.getText().equals(user)){
                    NBalanceT.setEditable(true);
                    NpasswordT.setEditable(true);
                    Done.setEnabled(true);
                    Exit.setEnabled(true);
                    
                    Login.setEnabled(false);
                    Close.setEnabled(false);
                    PassT.setEditable(false);
                    UserT.setEditable(false);
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid password or User Name. Try again.","Failed Login", JOptionPane.ERROR_MESSAGE);
                    PassT.setText("");
                    UserT.setText("");
                }
                break;
            case "Close":
            case "Exit":
                this.dispose();
                break;
            case "Done":
                if(NBalanceT.getText().equals("")){
                    
                }else{Balance = Double.parseDouble(NBalanceT.getText());}
                if(NpasswordT.getText().equals("")){
                    
                }else{password=NpasswordT.getText();}
                this.dispose();
                break;
        }
    }
}
