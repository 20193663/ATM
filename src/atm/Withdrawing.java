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
public class Withdrawing extends JFrame implements ActionListener{
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
    public Withdrawing(){
        //set frame
        this.setTitle("National Bank Of Egypt ATM");
        this.setVisible(true);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);// to make in cener
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        JLabel StartL =new JLabel("Choose your Withdrawing", SwingConstants.CENTER);//label 2
        StartL.setFont(new Font("Times", Font.PLAIN+Font.BOLD, 30));
        StartL.setForeground( Color.WHITE);
        StartL.setBounds(50, 0, 500, 68);
        ScreenCenterDialogueP.add(StartL);//add label 2
        //Button B100
        JButton B100=new JButton("100");
        B100.setPreferredSize(new Dimension(150, 50));
        B100.setBackground(Color.white );
        B100.setFont(new Font("Times", Font.BOLD, 20));
        B100.setForeground(Color.BLACK);
        B100.setBounds(0, 65, 290, 68);
        ScreenCenterDialogueP.add(B100);
        //Button B500
        JButton B500=new JButton("500");
        B500.setPreferredSize(new Dimension(150, 50));
        B500.setBackground(Color.white );
        B500.setFont(new Font("Times", Font.BOLD, 20));
        B500.setForeground(Color.BLACK);
        B500.setBounds(298, 65, 290, 68);
        ScreenCenterDialogueP.add(B500);
        //p5 for Button 
        ScreenCenterButtonsP= new JPanel();
        ScreenCenterButtonsP.setBackground(Background);
        //Button B1000
        JButton B1000=new JButton("1000");
        B1000.setPreferredSize(new Dimension(150, 50));
        B1000.setBackground(Color.white );
        B1000.setFont(new Font("Times", Font.BOLD, 20));
        B1000.setForeground(Color.BLACK);
        B1000.setBounds(0, 0, 290, 68);
        //Button B2000
        JButton B2000=new JButton("2000");
        B2000.setPreferredSize(new Dimension(150, 50));
        B2000.setBackground(Color.white );
        B2000.setFont(new Font("Times", Font.BOLD, 20));
        B2000.setForeground(Color.BLACK);
        B2000.setBounds(298, 0, 290, 68);
        //Button B5000
        JButton B5000=new JButton("5000");
        B5000.setPreferredSize(new Dimension(150, 50));
        B5000.setBackground(Color.white );
        B5000.setFont(new Font("Times", Font.BOLD, 20));
        B5000.setForeground(Color.BLACK);
        B5000.setBounds(0, 65, 290, 68);
        //Button SetBalance
        JButton SetBalance=new JButton("Set Balance");
        SetBalance.setPreferredSize(new Dimension(150, 50));
        SetBalance.setBackground(Color.white );
        SetBalance.setFont(new Font("Times", Font.BOLD, 20));
        SetBalance.setForeground(Color.BLACK);
        SetBalance.setBounds(298, 65, 290, 68);
        
        
        ScreenCenterButtonsP.add(B1000);
        ScreenCenterButtonsP.add(B2000);
        ScreenCenterButtonsP.add(B5000);
        ScreenCenterButtonsP.add(SetBalance);
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
