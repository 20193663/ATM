/*
 * To change this license ScreenHeaderP, choose License Headers in Project Properties.
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
public class Login extends JFrame implements ActionListener{
//// password need more work
    Color Background =new Color(60, 70, 92);// set Background Color(60, 70, 92)
    //frame stuff
    JPanel BaseP,ScreenP, ScreenHeaderP, ScreenCenterP, ScreenCenterDialogueP, ScreenCenterButtonsP, WestButtonsP,EastButtonsP,p8;
    //TextField pin;
    final JPasswordField pin;// finel to not change
    JButton ClearB,LoginB;
    JLabel WelcomeHeaderL, PinQL;
    //EastButtons anw westButtons
    JButton b[]=new JButton[8];
    //Buttons number and enter and clear and exit
    JButton B[]=new JButton[13];
    //MenuBar
    static MenuBar menu;
    Menu m;
    public Login(){
        //MenuBar
        menu = new MenuBar();
        m = new Menu("File");
        Menu SubMenuATM = new Menu("ATM");
        MenuItem MenuExit = new MenuItem("Exit");
        MenuItem ChangePassword = new MenuItem("Change Password");
        MenuItem ChangeBalance = new MenuItem("Change Balance");
        MenuExit.addActionListener(this);
        ChangePassword.addActionListener(this);
        ChangeBalance.addActionListener(this);
        SubMenuATM.add(ChangePassword);
        SubMenuATM.add(ChangeBalance);
        ChangePassword.setFont(new Font("Times", Font.BOLD,15));
        ChangeBalance.setFont(new Font("Times", Font.BOLD,15));
        m.add(SubMenuATM);
        m.add(MenuExit);
        menu.add(m);
        this.setMenuBar(menu);
        
        //strst panels
        BaseP = new JPanel();
        BaseP.setLayout(new GridLayout(2, 1));
        BaseP.setBackground(Background);// set BaseP Background Color(60, 70, 92)
        
        //panel 1 the ScreenP panel 2 the ScreenHeaderP
        ScreenP = new JPanel(new BorderLayout());
        ScreenHeaderP = new JPanel();
        WelcomeHeaderL = new JLabel("Welcome to the National Bank Of Egypt", SwingConstants.CENTER);
        WelcomeHeaderL.setFont(new Font("Times", Font.BOLD, 30));
        WelcomeHeaderL.setForeground(new Color(0, 153, 0));
        //l1.setOpaque(true);
        //l1.setBorder(new LineBorder(Color.white));
        WelcomeHeaderL.setBackground(Color.white);
        ScreenHeaderP.setBackground(Color.white);
        ScreenHeaderP.add(WelcomeHeaderL);
        //p1.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        ScreenP.add(ScreenHeaderP,BorderLayout.NORTH);
        ScreenHeaderP.setPreferredSize(new Dimension(0, 60));
        
        //panel 3 ScreenCenterP <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        ScreenCenterP = new JPanel(new GridLayout(2, 1));
        ScreenCenterP.setBackground(Background);
        //p4 for  label and textfild
        ScreenCenterDialogueP= new JPanel();//new GridLayout(2, 1)
        ScreenCenterDialogueP.setBackground(Background);
        ScreenCenterDialogueP.setLayout(null);
        //label
        PinQL=new JLabel("Please enter your pin", SwingConstants.CENTER);//label 2
        PinQL.setFont(new Font("Times", Font.PLAIN+Font.BOLD, 30));
        PinQL.setForeground( Color.WHITE);
        PinQL.setBounds(50, 0, 500, 68);
        //TextField
        //https://www.zentut.com/java-swing/creating-password-field-by-using-jpasswordfield-class/
        //t1=new TextField("");
        pin = new JPasswordField();//JPasswordField
        pin.setBounds(230, 70, 125, 68);
        pin.setColumns(4);//pin is 4 num
        pin.setFont(new Font("Times", Font.PLAIN+Font.BOLD, 30));
        PinQL.setLabelFor(pin);
        pin.addActionListener(this);
        //add PinQL and pin
        ScreenCenterDialogueP.add(PinQL);//add label 2
        ScreenCenterDialogueP.add(pin);//add JPasswordField
        //p5 for Button 
        ScreenCenterButtonsP= new JPanel();
        ScreenCenterButtonsP.setBackground(Background);
        //Button ClearB
        ClearB=new JButton("Clear");
        ClearB.setPreferredSize(new Dimension(150, 50));
        ClearB.setBackground(Color.white );
        ClearB.setFont(new Font("Times", Font.BOLD, 20));
        ClearB.setForeground(new Color(255, 153, 0));
        ClearB.setBounds(0, 65, 290, 68);
        ClearB.addActionListener(this);
        //Button LoginB
        LoginB=new JButton("Login");
        LoginB.setPreferredSize(new Dimension(150, 50));
        LoginB.setBackground(Color.white );
        LoginB.setFont(new Font("Times", Font.BOLD, 20));
        LoginB.setForeground(new Color(0, 153, 0));
        LoginB.setBounds(298, 65, 290, 68);
        LoginB.addActionListener(this);
        
        ScreenCenterButtonsP.add(ClearB);
        ScreenCenterButtonsP.add(LoginB);
        ScreenCenterButtonsP.setLayout(null);
        //add in ScreenCenterP
        ScreenCenterP.add(ScreenCenterDialogueP);//p3 add ScreenCenterDialogueP for label and textfild 
        ScreenCenterP.add(ScreenCenterButtonsP);//p3 add ScreenCenterButtonsP for Button 
        ScreenP.add(ScreenCenterP,BorderLayout.CENTER);
        //west button
        WestButtonsP = new JPanel(new GridLayout(4, 1));
        for (int i=0;i<=3;i++){
            b[i]=new JButton("=>");
            b[i].setForeground( Color.WHITE);
            b[i].setBackground(Background);
            //b[i].setPreferredSize(new Dimension(30, 50));
            WestButtonsP.add(b[i]);
            b[i].addActionListener(this);
        }
        ScreenP.add(WestButtonsP,BorderLayout.WEST);
        EastButtonsP = new JPanel(new GridLayout(4, 1));
        for (int i=4;i<=7;i++){
            b[i]=new JButton("<=");
            b[i].setForeground( Color.WHITE);
            b[i].setBackground(Background);
            //b[i].setPreferredSize(new Dimension(30, 50));
            EastButtonsP.add(b[i]);
            b[i].addActionListener(this);
        }
        ScreenP.add(EastButtonsP,BorderLayout.EAST);
        BaseP.add(ScreenP);
        //Buttons number and enter and clear and exit
        p8=new JPanel();
        p8.setBackground(Background);
        p8.setLayout(null);
        int x=0;
        int y=50;
        String name[]={"Enter","Clear","Exit"};
        for (int i=1;i<=13;i++){
            if(i==4||i==7){y+=50;x=-100;}//x=-100 3sahn if we else eley gya htzodha fa x=100 ao x=200
            if(i==1){}
            else {x+=100;}
            
            B[i-1]=new JButton(""+i);
            B[i-1].setForeground( Color.BLACK);
            B[i-1].setBackground(Color.WHITE);
            B[i-1].setBounds(80+x, y, 100, 50);
            if(i-1==9){//in zero"0"
                B[i-1].setBounds(180, 200, 100, 50);
                B[i-1].setText("0");
            }
            if(i-1>=10){//enter and clear and exit
                B[i-1].setBounds(420, 50+(i-11)*50, 100, 50);
                B[i-1].setText(name[i-11]);
                switch (i-1){
                    case 10:
                        B[i-1].setBackground(new Color(0, 153, 0));
                        break;
                    case 11:
                        B[i-1].setBackground(new Color(255, 153, 0));
                        break;
                    case 12:
                        B[i-1].setBackground(new Color(153, 0, 0));
                        break;
                    default:
                        B[i-1].setBackground(Color.WHITE);
                }
            }
            B[i-1].setFont(new Font("Times", Font.BOLD, 15));
            B[i-1].addActionListener(this);
            p8.add(B[i-1]);
        }
        BaseP.add(p8);
        this.add(BaseP);
        //set frame
        this.setTitle("National Bank Of Egypt ATM");
        this.setVisible(true);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);// to make in cener
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        System.out.println(e.getSource());
        System.out.println(pin.getPassword());
        //.getPassword() to git increbt password
        switch (e.getActionCommand()) {
            case "Login":
            case "Enter":
                //case "<=":
                //MoreOptions
                //op Knowing the balance, withdrawing and depositing, changing the password
                if((pin.getText()).equals(password)){
                    System.out.println(pin.getPassword());
                    MoreOptions MoreOptions=new MoreOptions();
                    this.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(this,"Password is incorect","password",JOptionPane.WARNING_MESSAGE);
                }
                break;
            case "Clear":
                pin.setText("");
                break;
            case "Exit":
            //case "=>":
                System.exit(0);
                break;
            //for numpers
            case "0":
                pin.setText(pin.getText()+0);
                break;
            case "1":
                pin.setText(pin.getText()+1);
                break;
            case "2":
                pin.setText(pin.getText()+2);
                break;
            case "3":
                pin.setText(pin.getText()+3);
                break;
            case "4":
                pin.setText(pin.getText()+4);
                break;
            case "5":
                pin.setText(pin.getText()+5);
                break;
            case "6":
                pin.setText(pin.getText()+6);
                break;
            case "7":
                pin.setText(pin.getText()+7);
                break;
            case "8":
                pin.setText(pin.getText()+8);
                break;
            case "9":
                pin.setText(pin.getText()+9);
                break;
        }
        
     if(e.getSource() == b[7] )
     {
         // getString();
         if((pin.getText()).equals(password)){
                    System.out.println(pin.getPassword());
                    MoreOptions MoreOptions=new MoreOptions();
                    this.dispose();
                }
        else {
             JOptionPane.showMessageDialog(this,"Password is incorect","password",JOptionPane.WARNING_MESSAGE);
         }
     }
     else if(e.getSource() == b[3] ){
         pin.setText("");
     }
    }
    //https://www.geeksforgeeks.org/java-swing-creating-custom-message-dialogs/?ref=lbp need to see add do like
    //https://www.zentut.com/java-swing/creating-password-field-by-using-jpasswordfield-class/
    //
}
