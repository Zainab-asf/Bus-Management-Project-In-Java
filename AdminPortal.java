/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busreservationsystem;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.FileWriter;
import javax.swing.table.JTableHeader;


public class AdminPortal extends JFrame 
{

    private JLabel AdminPortal;
    private JLabel Gender;
    private JLabel SeatClass;
    private JLabel DepartureDate;
    private JLabel Destination;
    private JLabel DeparturePoint;
    private JLabel UserLabel;
    private JLabel RecordLabel;
    private JLabel FirstName;
    private JLabel SecondName;
    private JLabel TotalSeats;
    private JLabel BusTimings;

    private JTextField totalSeatsTextField;
    private JTextField firstName;
    private JTextField secondName;

    private JButton Add;
    private JButton Save;
    private JButton Delete;
    private JButton Update;

    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;

    private JComboBox<String> seatClassComboBox;
    private JComboBox<String> departureDateComboBox;
    private JComboBox<String> departureMonthComboBox;
    private JComboBox<String> DestinationComboBox;
    private JComboBox<String> DeparturePointComboBox;
    private JComboBox<String> busTimingsComboBox;

    private ButtonGroup genderGroup;
    private JTable table;
    private DefaultTableModel tableModel;
    private JScrollPane Scroll;
    

    // FONT
    Font f1 = new Font("Times New Roman", Font.BOLD, 46);
    Font f2 = new Font("Times New Roman", Font.BOLD, 18);
    Font f3 = new Font("Arial", Font.BOLD, 14);
    Font f4 = new Font("Arial Narrow ", Font.PLAIN, 12);
    Font f5 = new Font("Calibri Heading", Font.PLAIN, 11);
    Font f6 = new Font("Arial Narrow ", Font.BOLD, 14);
    
    // COLOR 
    Color c1 = new Color(7, 87, 148);
    Color c2 = new Color(237, 246, 250);
    Color c3 = new Color(197, 240, 250);
    Color c4 = new Color(0, 0, 0);

    public void Initialize() 
    {
        setTitle("Admin Portal");
        setLayout(null);

        AdminPortal = new JLabel();
        AdminPortal.setText("Admin Portal");
        AdminPortal.setFont(f1);
        AdminPortal.setBounds(460, 32, 600, 30);
        AdminPortal.setForeground(c1);
        add(AdminPortal);

        UserLabel = new JLabel();
        UserLabel.setText("Input User Information");
        UserLabel.setFont(f2);
        UserLabel.setBounds(50, 100, 400, 30);
        UserLabel.setForeground(c4);
        add(UserLabel);
        
        RecordLabel = new JLabel();
        RecordLabel.setText("User Record");
        RecordLabel.setFont(f2);
        RecordLabel.setBounds(480, 100, 400, 30);
        RecordLabel.setForeground(c4);
        add(RecordLabel);

        FirstName = new JLabel();
        FirstName.setText("First Name:");
        FirstName.setFont(f3);
        FirstName.setBounds(50, 160, 130, 20);
        FirstName.setForeground(c1);
        add(FirstName);

        firstName = new JTextField();
        firstName.setText("");
        firstName.setFont(f4);
        firstName.setBounds(170, 160, 140, 20);
        firstName.setForeground(c4);
        firstName.setBackground(c2);
        firstName.setBorder(BorderFactory.createLineBorder(c1, 1));
        this.add(firstName);

        SecondName = new JLabel();
        SecondName.setText("Second Name:");
        SecondName.setFont(f3);
        SecondName.setBounds(50, 200, 130, 20);
        SecondName.setForeground(c1);
        add(SecondName);

        secondName = new JTextField();
        secondName.setText("");
        secondName.setFont(f4);
        secondName.setBounds(170, 200, 140, 20);
        secondName.setForeground(c4);
        secondName.setBackground(c2);
        secondName.setBorder(BorderFactory.createLineBorder(c1, 1));
        this.add(secondName);

        TotalSeats = new JLabel();
        TotalSeats.setText("Total Seats:");
        TotalSeats.setFont(f3);
        TotalSeats.setBounds(50, 240, 130, 20);
        TotalSeats.setForeground(c1);
        add(TotalSeats);

        totalSeatsTextField = new JTextField();
        totalSeatsTextField.setText("");
        totalSeatsTextField.setFont(f4);
        totalSeatsTextField.setBounds(170, 240, 140, 20);
        totalSeatsTextField.setForeground(c4);
        totalSeatsTextField.setBackground(c2);
        totalSeatsTextField.setBorder(BorderFactory.createLineBorder(c1, 1));
        this.add(totalSeatsTextField);

        DeparturePoint = new JLabel();
        DeparturePoint.setText("From:");
        DeparturePoint.setFont(f3);
        DeparturePoint.setBounds(50, 280, 130, 20);
        DeparturePoint.setForeground(c1);
        add(DeparturePoint);

        String[] DeparturePnt = {"Lahore", "Islamabad", "Karachi", "Multan", "Faisalabad", "Murree", "Abbotabad", "Attok", "Taxila"};
        DeparturePointComboBox = new JComboBox<>(DeparturePnt);
        DeparturePointComboBox.setFont(f4);
        DeparturePointComboBox.setForeground(c4);
        DeparturePointComboBox.setBackground(c2);
        DeparturePointComboBox.setBounds(170, 280, 140, 20);
        DeparturePointComboBox.setBorder(BorderFactory.createLineBorder(c1, 1));
        add(DeparturePointComboBox);

        Destination = new JLabel();
        Destination.setText("To:");
        Destination.setFont(f3);
        Destination.setBounds(50, 320, 130, 20);
        Destination.setForeground(c1);
        add(Destination);

        String[] destinations = {"Lahore", "Islamabad", "Karachi", "Multan", "Faisalabad", "Murree", "Abbotabad", "Attok", "Taxila"};
        DestinationComboBox = new JComboBox<>(destinations);
        DestinationComboBox.setFont(f4);
        DestinationComboBox.setForeground(c4);
        DestinationComboBox.setBackground(c2);
        DestinationComboBox.setBounds(170, 320, 140, 20);
        DestinationComboBox.setBorder(BorderFactory.createLineBorder(c1, 1));
        add(DestinationComboBox);

        SeatClass = new JLabel();
        SeatClass.setText("Seat Class:");
        SeatClass.setFont(f3);
        SeatClass.setBounds(50, 360, 130, 20);
        SeatClass.setForeground(c1);
        add(SeatClass);

        String[] seatClasses = {"Business", "Economy"};
        seatClassComboBox = new JComboBox<>(seatClasses);
        seatClassComboBox.setFont(f4);
        seatClassComboBox.setForeground(c4);
        seatClassComboBox.setBackground(c2);
        seatClassComboBox.setBounds(170, 360, 140, 20);
        seatClassComboBox.setBorder(BorderFactory.createLineBorder(c1, 1));
        add(seatClassComboBox);

        DepartureDate = new JLabel();
        DepartureDate.setText("Departure Date:");
        DepartureDate.setFont(f3);
        DepartureDate.setBounds(50, 400, 130, 20);
        DepartureDate.setForeground(c1);
        add(DepartureDate);

        String[] departureDate = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        departureDateComboBox = new JComboBox<>(departureDate);
        departureDateComboBox.setBackground(c2);
        departureDateComboBox.setFont(f4);
        departureDateComboBox.setForeground(c4);
        departureDateComboBox.setBounds(170, 400, 46, 20);
        departureDateComboBox.setBorder(BorderFactory.createLineBorder(c1, 1));
        add(departureDateComboBox);

        String[] departureMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        departureMonthComboBox = new JComboBox<>(departureMonth);
        departureMonthComboBox.setBackground(c2);
        departureMonthComboBox.setFont(f4);
        departureMonthComboBox.setForeground(c4);
        departureMonthComboBox.setBounds(225, 400, 86, 20);
        departureMonthComboBox.setBorder(BorderFactory.createLineBorder(c1, 1));
        add(departureMonthComboBox);

        BusTimings = new JLabel();
        BusTimings.setText("Bus Timings:");
        BusTimings.setFont(f3);
        BusTimings.setBounds(50, 440, 130, 20);
        BusTimings.setForeground(c1);
        add(BusTimings);

        String[] busTimings = {"12:00 am", "04:00 am ", "08:00 am", "12:00 pm", "04:00 pm", "08:00 pm"};
        busTimingsComboBox = new JComboBox<>(busTimings);
        busTimingsComboBox.setBackground(c2);
        busTimingsComboBox.setFont(f4);
        busTimingsComboBox.setForeground(c4);
        busTimingsComboBox.setBounds(170, 440, 140, 20);
        busTimingsComboBox.setBorder(BorderFactory.createLineBorder(c1, 1));
        add(busTimingsComboBox);

        Gender = new JLabel();
        Gender.setText("Gender:");
        Gender.setFont(f3);
        Gender.setBounds(50, 480, 130, 20);
        Gender.setForeground(c1);
        add(Gender);

        maleRadioButton = new JRadioButton();
        maleRadioButton.setText("Male");
        maleRadioButton.setFont(f4);
        maleRadioButton.setBackground(c3);
        maleRadioButton.setForeground(c4);
        maleRadioButton.setBounds(170, 480, 56, 20);
        maleRadioButton.setBorder(BorderFactory.createLineBorder(c1, 1));
        add(maleRadioButton);

        femaleRadioButton = new JRadioButton();
        femaleRadioButton.setText("Female");
        femaleRadioButton.setFont(f4);
        femaleRadioButton.setBackground(c3);
        femaleRadioButton.setForeground(c4);
        femaleRadioButton.setBounds(240, 480, 70, 20);
        femaleRadioButton.setBorder(BorderFactory.createLineBorder(c1, 1));
        add(femaleRadioButton);

        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        Add = new JButton();
        Add.setText("Add");
        Add.setFont(f6);
        Add.setBounds(620, 450, 65, 25);
        Add.setForeground(c2);
        Add.setBackground(c1);
        Add.setBorder(BorderFactory.createLineBorder(c1, 1));
        Add.addActionListener(new btnEventHandler());
        this.add(Add);

        Save = new JButton();
        Save.setText("Save");
        Save.setFont(f6);
        Save.setBounds(690, 450, 65, 25);
        Save.setForeground(c2);
        Save.setBackground(c1);
        Save.setBorder(BorderFactory.createLineBorder(c1, 1));
        Save.addActionListener(new btnEventHandler());
        this.add(Save);

        Delete = new JButton();
        Delete.setText("Delete");
        Delete.setFont(f6);
        Delete.setBounds(760, 450, 65, 25);
        Delete.setForeground(c2);
        Delete.setBackground(c1);
        Delete.setBorder(BorderFactory.createLineBorder(c1, 1));
        Delete.addActionListener(new btnEventHandler());
        this.add(Delete);

        Update = new JButton();
        Update.setText("Update");
        Update.setFont(f6);
        Update.setBounds(830, 450, 65, 25);
        Update.setForeground(c2);
        Update.setBackground(c1);
        Update.setBorder(BorderFactory.createLineBorder(c1, 1));
        Update.addActionListener(new btnEventHandler());
        this.add(Update);

        String[] column = {"First Name", "Surname", "Seats", "From", "To", "Class", "Timings", "Fare"};
        String[][] data = {};
        tableModel = new DefaultTableModel(data, column);
        table = new JTable(tableModel);
        table.setBackground(c2);
        table.setFont(f5);
        table.setRowHeight(22);
       
        JTableHeader header = table.getTableHeader();
        header.setFont(f4);
        header.setBackground(c1);
        header.setForeground(Color.WHITE);
        header.setPreferredSize(new Dimension(table.getWidth(), 26));
               
        Scroll = new JScrollPane(table);
        Scroll.setBounds(480, 160, 600, 230);
        Scroll.setBackground(c2);
        Scroll.setFont(f3);
        this.add(Scroll);
        table.addMouseListener(new MouseClick());

        try {
            File f = new File("UserRecord.txt");
            Scanner input = new Scanner(f);
            while (input.hasNext()) 
            {
                String str = input.nextLine();
                String[] data1 = str.split(",");
                tableModel.addRow(data1);
            }
            input.close();
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }

        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.addWindowListener(new Win());

    }

    public class Win implements WindowListener 
    {

        @Override
        public void windowOpened(WindowEvent e) {}

           @Override
        public void windowClosing(WindowEvent e) 
        {
        try 
        {
            FileWriter fr = new FileWriter("UserRecord.txt");
            for (int i = 0; i < table.getRowCount(); i++) 
            {
                fr.write(tableModel.getValueAt(i, 0).toString() + "," +tableModel.getValueAt(i, 1).toString() + "," +tableModel.getValueAt(i, 2).toString() + "," +tableModel.getValueAt(i, 3).toString() + "," +tableModel.getValueAt(i, 4).toString() + "," +tableModel.getValueAt(i, 5).toString() + "," +tableModel.getValueAt(i, 6).toString() + "," +tableModel.getValueAt(i, 7).toString() + "\n");
            }
            fr.close();
            JOptionPane.showMessageDialog(null, "Record Saved ", "Success", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
        }
        
        @Override
        public void windowClosed(WindowEvent e) {}

        @Override
        public void windowIconified(WindowEvent e) {}

        @Override
        public void windowDeiconified(WindowEvent e) {}

        @Override
        public void windowActivated(WindowEvent e) {}

        @Override
        public void windowDeactivated(WindowEvent e) {}

    }

    public class MouseClick implements MouseListener 
    {

        @Override
        public void mouseClicked(MouseEvent e) 
        {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            int row = table.getSelectedRow();
            firstName.setText(table.getValueAt(row, 0).toString());
            secondName.setText(table.getValueAt(row, 1).toString());
            totalSeatsTextField.setText(table.getValueAt(row, 2).toString());
            DeparturePointComboBox.setSelectedItem(table.getValueAt(row, 3).toString());
            DestinationComboBox.setSelectedItem(table.getValueAt(row, 4).toString());
            seatClassComboBox.setSelectedItem(table.getValueAt(row, 5).toString());
            busTimingsComboBox.setSelectedItem(table.getValueAt(row, 6).toString());

        }

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}

    }

    public class btnEventHandler implements ActionListener 
    {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            try 
            {
                String op = ae.getActionCommand();

                // ADD BUTTON LOGIC
                if (op.compareTo("Add") == 0) 
                {
                    
                    int totalSeatsValue = Integer.parseInt(totalSeatsTextField.getText());

                    // Calculate fare for the current customer
                    double seatCost = calculateSeatCost(totalSeatsValue, seatClassComboBox.getSelectedItem().toString());

                    // Add customer data to the table
                    String[] data = {firstName.getText(), secondName.getText(), String.valueOf(totalSeatsValue), DeparturePointComboBox.getSelectedItem().toString(), DestinationComboBox.getSelectedItem().toString(), seatClassComboBox.getSelectedItem().toString(), busTimingsComboBox.getSelectedItem().toString(), String.valueOf(seatCost)};
                    tableModel.addRow(data);
                   
                    // Show success message
                    JOptionPane.showMessageDialog(null, "Record Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                } 
                
                
                // SAVE BUTTON LOGIC
                else if (op.compareTo("Save") == 0) 
                {

                    try 
                    {
                    FileWriter fr = new FileWriter("UserRecord.txt");
                    for (int i = 0; i < table.getRowCount(); i++) 
                    {
                    fr.write(tableModel.getValueAt(i, 0).toString() + "," +tableModel.getValueAt(i, 1).toString() + "," +tableModel.getValueAt(i, 2).toString() + "," +tableModel.getValueAt(i, 3).toString() + "," +tableModel.getValueAt(i, 4).toString() + "," +tableModel.getValueAt(i, 5).toString() + "," +tableModel.getValueAt(i, 6).toString() + "," +tableModel.getValueAt(i, 7).toString() + "\n");
                    }
                    fr.close();
                    JOptionPane.showMessageDialog(null, "Record Saved ", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } 
                    catch (Exception ex) 
                    {
                    System.out.println(ex.getMessage());
                    }
                } 
                
                
                // DELETE BUTTON LOGIC
                else if (op.compareTo("Delete") == 0) 
                {
                    int ro = table.getSelectedRow();
                    if (ro == -1) 
                    {
                        JOptionPane.showMessageDialog(null, "Please select a row first", "Error", JOptionPane.ERROR_MESSAGE);
                    } 
                    else 
                    {
                        tableModel.removeRow(ro);
                        JOptionPane.showMessageDialog(null, "Record Deleted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                } 
                
                
                // UPDATE BUTTON LOGIC
                else if (op.compareTo("Update") == 0) 
                {
                    int row = table.getSelectedRow();
                    int totalSeatsValue = Integer.parseInt(totalSeatsTextField.getText());
                    double seatCost = calculateSeatCost(totalSeatsValue, seatClassComboBox.getSelectedItem().toString());
                    
                    if (row == -1) 
                    {
                        JOptionPane.showMessageDialog(null, "Please select a row first", "Error", JOptionPane.ERROR_MESSAGE);
                    } 
                    else 
                    {
                        tableModel.setValueAt(firstName.getText(), row, 0);
                        tableModel.setValueAt(secondName.getText(), row, 1);
                        tableModel.setValueAt(totalSeatsTextField.getText(), row, 2);
                        tableModel.setValueAt(DeparturePointComboBox.getSelectedItem(), row, 3);
                        tableModel.setValueAt(DestinationComboBox.getSelectedItem(), row, 4);
                        tableModel.setValueAt(seatClassComboBox.getSelectedItem(), row, 5);
                        tableModel.setValueAt(busTimingsComboBox.getSelectedItem(), row, 6);
                        tableModel.setValueAt(String.valueOf(seatCost), row, 7);

                        JOptionPane.showMessageDialog(null, "Record Updated Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            } 
            catch (Exception ex) 
            {
                System.err.print(ex.getMessage());
                JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        }
        

        private double calculateSeatCost(int numberOfSeats, String seatClass) 
        {
            double baseFare;
            if (seatClass.compareTo("Business")==0) 
            {
                baseFare = 2000.0;
            } 
            else 
            {
                baseFare = 1000.0;
            }

            return numberOfSeats * baseFare;
        }    
}

