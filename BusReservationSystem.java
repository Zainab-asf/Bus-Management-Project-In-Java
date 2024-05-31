/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busreservationsystem;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author bcs.068.cuiatd
 */
public class BusReservationSystem 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here

        Color c = new Color(197, 240, 250);
        ImageIcon ic=new ImageIcon("src/busreservationsystem/bus.jpeg");
        
        
        LoginFrame mainFrame = new LoginFrame();
        mainFrame.addComponents();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("Bus Reservation System");
        mainFrame.setLayout(null);
        mainFrame.getContentPane().setBackground(c);
        mainFrame.setSize(1100, 650);
        mainFrame.setIconImage(ic.getImage());
        mainFrame.setVisible(true);

    }
}
