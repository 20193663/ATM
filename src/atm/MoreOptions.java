/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Dell
 */
public class MoreOptions extends JFrame implements ActionListener{
    Color Background =new Color(60, 70, 92);// set Background Color(60, 70, 92)
    //frame stuff
    JPanel BaseP,ScreenP, ScreenHeaderP, ScreenCenterP, ScreenCenterDialogueP, ScreenCenterButtonsP, WestButtonsP,EastButtonsP,p8;
    JLabel WelcomeHeaderL;
    //EastButtons anw westButtons
    JButton b[]=new JButton[8];
    //Buttons number and enter and clear and exit
    JButton B[]=new JButton[13];
    //MenuBar
    static MenuBar menu;
    Menu m;
    public MoreOptions(){
        
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
        WelcomeHeaderL.setBackground(Color.WHITE);
        ScreenHeaderP.setBackground(Color.white);
        ScreenHeaderP.add(WelcomeHeaderL);
        //p1.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        ScreenP.add(ScreenHeaderP,BorderLayout.NORTH);
        ScreenHeaderP.setPreferredSize(new Dimension(0, 60));
        
        //panel 3 ScreenCenterP <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        ScreenCenterP = new JPanel(new GridLayout(2, 1));
        ScreenCenterP.setBackground(Background);
        //ScreenCenterP.setLayout(null);
        //op Knowing the balance, withdrawing and depositing, changing the password
        ScreenCenterDialogueP= new JPanel();//new GridLayout(2, 1)
        ScreenCenterDialogueP.setBackground(Background);
        ScreenCenterDialogueP.setLayout(null);
        //p4 for  label 
        //label
        JLabel StartL =new JLabel("Choose your process?", SwingConstants.CENTER);//label 2
        StartL.setFont(new Font("Times", Font.PLAIN+Font.BOLD, 30));
        StartL.setForeground( Color.WHITE);
        StartL.setBounds(50, 0, 500, 68);
        ScreenCenterDialogueP.add(StartL);//add label 2
        //p5 for Button 
        ScreenCenterButtonsP= new JPanel();
        ScreenCenterButtonsP.setBackground(Background);
         //Button KnowingthebalanceB
        JButton KnowingthebalanceB=new JButton("Knowing the balance");
        KnowingthebalanceB.setPreferredSize(new Dimension(150, 50));
        KnowingthebalanceB.setBackground(Color.white );
        KnowingthebalanceB.setFont(new Font("Times", Font.BOLD, 20));
        KnowingthebalanceB.setForeground(Color.BLACK);
        KnowingthebalanceB.setBounds(0, 0, 290, 68);
        //Button WithdrawingB
        JButton WithdrawingB=new JButton("Withdrawing");
        WithdrawingB.setPreferredSize(new Dimension(150, 50));
        WithdrawingB.setBackground(Color.white );
        WithdrawingB.setFont(new Font("Times", Font.BOLD, 20));
        WithdrawingB.setForeground(Color.BLACK);
        WithdrawingB.setBounds(298, 0, 290, 68);
        //Button DepositingB
        JButton DepositingB=new JButton("Depositing");
        DepositingB.setPreferredSize(new Dimension(150, 50));
        DepositingB.setBackground(Color.white );
        DepositingB.setFont(new Font("Times", Font.BOLD, 20));
        DepositingB.setForeground(Color.BLACK);
        DepositingB.setBounds(0, 65, 290, 68);
        //Button CPassword
        JButton CPassword=new JButton("changing the password");
        CPassword.setPreferredSize(new Dimension(150, 50));
        CPassword.setBackground(Color.white );
        CPassword.setFont(new Font("Times", Font.BOLD, 20));
        CPassword.setForeground(Color.BLACK);
        CPassword.setBounds(298, 65, 290, 68);
        
        
        ScreenCenterButtonsP.add(KnowingthebalanceB);
        ScreenCenterButtonsP.add(WithdrawingB);
        ScreenCenterButtonsP.add(DepositingB);
        ScreenCenterButtonsP.add(CPassword);
        ScreenCenterButtonsP.setLayout(null);
        //add in ScreenCenterP
        ScreenCenterP.add(ScreenCenterDialogueP);//p3 add ScreenCenterDialogueP for label and textfild 
        ScreenCenterP.add(ScreenCenterButtonsP);//p3 add ScreenCenterButtonsP for Button 
        ScreenP.add(ScreenCenterP,BorderLayout.CENTER);//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //west button
        WestButtonsP = new JPanel(new GridLayout(4, 1));
        for (int i=0;i<=3;i++){
            b[i]=new JButton("=>");
            b[i].setForeground( Color.WHITE);
            b[i].setBackground(Background);
            //b[i].setPreferredSize(new Dimension(30, 50));
            WestButtonsP.add(b[i]);
        }
        ScreenP.add(WestButtonsP,BorderLayout.WEST);
        EastButtonsP = new JPanel(new GridLayout(4, 1));
        for (int i=4;i<=7;i++){
            b[i]=new JButton("<=");
            b[i].setForeground( Color.WHITE);
            b[i].setBackground(Background);
            //b[i].setPreferredSize(new Dimension(30, 50));
            EastButtonsP.add(b[i]);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}