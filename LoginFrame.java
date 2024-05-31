/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busreservationsystem;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author bcs.068.cuiatd
 */
public class LoginFrame extends JFrame implements ActionListener {

    private JLabel label;
    private JLabel UserName;
    private JLabel Password;
    private JLabel imageLabel;
    private JTextField Text;
    private JPasswordField Pass;
    private JButton Login;
    private JButton Clear;
    

    Font f1 = new Font("Times New Roman", Font.BOLD, 48);
    Font f2 = new Font("Times New Roman", Font.BOLD, 16);
    Font f3 = new Font("Arial Narrow", Font.PLAIN, 14);
    Font f4 = new Font("Arial", Font.BOLD, 9);

 // COLOR
    Color c1 = new Color(69, 50, 27);        // Dark Brown
    Color c2 = new Color(245, 236, 230);     // Beige
    Color c3 = new Color(186, 169, 149);     // Skin
    Color c4 = new Color(138, 39, 19);       //  Maroon
    
    ImageIcon ic = new ImageIcon("src/busreservationsystem/1.png");
    
     
    public void addComponents() 
    {
       
   
        imageLabel = new JLabel();
        imageLabel.setIcon(ic);
        imageLabel.setBounds(0, 380, ic.getIconWidth(), ic.getIconHeight());
        this.add(imageLabel);
                   
        label = new JLabel();
        label.setText("BUS RESERVATION SYSTEM");
        label.setFont(f1);
        label.setBounds(230, 30, 700, 80);
        label.setForeground(c2);
        
        this.add(label);

        UserName = new JLabel();
        UserName.setText("USERNAME:");
        UserName.setFont(f2);
        UserName.setBounds(400, 230, 140, 30);
        UserName.setForeground(c2);
        this.add(UserName);

        Text = new JTextField();
        Text.setText("");
        Text.setFont(f3);
        Text.setBounds(530, 230, 160, 25);
        Text.setForeground(Color.BLACK);
        Text.setBackground(c3);
        Text.setBorder(BorderFactory.createLineBorder(c2, 1));
        this.add(Text);

        Password = new JLabel();
        Password.setText("PASSWORD:");
        Password.setFont(f2);
        Password.setBounds(400, 270, 140, 30);
        Password.setForeground(c2);
        this.add(Password);

        Pass = new JPasswordField();
        Pass.setText("");
        Pass.setFont(f3);
        Pass.setBounds(530, 270, 160, 25);
        Pass.setForeground(Color.BLACK);
        Pass.setBackground(c3);
        Pass.setBorder(BorderFactory.createLineBorder(c2, 1));
        this.add(Pass);

        Login = new JButton();
        Login.setText("LOGIN");
        Login.setFont(f4);
        Login.setBounds(564, 325, 60, 20);
        Login.setForeground(Color.WHITE);
        Login.setBackground(c2);
        Login.setBorder(BorderFactory.createLineBorder(c2, 1));
        Login.addActionListener(this);
        this.add(Login);

        Clear = new JButton();
        Clear.setText("CLEAR");
        Clear.setFont(f4);
        Clear.setBounds(630, 325, 60, 20);
        Clear.setForeground(Color.WHITE);
        Clear.setBackground(c2);
        Clear.setBorder(BorderFactory.createLineBorder(c2, 1));
        Clear.addActionListener(this);
        this.add(Clear);
          
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == Login) 
        {
            HandleLoginButton();
        } 
        else if (e.getSource() == Clear) 
        {
            HandleClearButton();
        }

    }

    private void HandleLoginButton() 
    {
        String enteredUsername = Text.getText();
        char[] enteredPassword = Pass.getPassword();
        String correctUsername = "admin";
        char[] correctPassword = "123".toCharArray();

        if (enteredUsername.equals(correctUsername) && Arrays.equals(enteredPassword, correctPassword)) 
        {
            openAdminPortal();
        } 
        else 
        {
            showFailureMessage();
        }
        
    }

    private void openAdminPortal() 
    {
        AdminPortal portal = new AdminPortal();
        portal.setTitle("ADMIN PORTAL");
        portal.Initialize();
        portal.getContentPane().setBackground(c1);
        portal.setSize(1150, 600);
        portal.setIconImage(new ImageIcon("src/busreservationsystem/bus.jpeg").getImage());
        portal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        portal.setVisible(true);
        this.setVisible(false);
    }

    private void showFailureMessage() 
    {
        JOptionPane.showMessageDialog(this, "Login Failed. Please try again.");
    }

    private void HandleClearButton() 
    {
        Text.setText("");
        Pass.setText("");
    }
    
}
