package view;

import javax.swing.*;

public class viewUpdate extends JFrame{
    JFrame window = new JFrame("Update Data Student");
    public JLabel lNim = new JLabel("NIM");
    public JTextField fNim = new JTextField();

    public JLabel lName = new JLabel("NAME");
    public JTextField fName = new JTextField();

    public JLabel lAge = new JLabel("AGE");
    public JTextField fAge = new JTextField();

    public JButton btnUpd = new JButton("UPDATE");

    public viewUpdate() {
        window.setLayout(null);
        window.setSize(550, 200);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        
        window.add(lNim);
        window.add(lName);
        window.add(lAge);
        window.add(fNim);
        window.add(fName);
        window.add(fAge);
        window.add(btnUpd);
        
        lNim.setBounds(20, 20, 120, 20);
        lName.setBounds(20, 50, 120, 20);
        lAge.setBounds(20, 80, 120, 20);
        
        fNim.setBounds(150, 20, 200, 20);
        fName.setBounds(150, 60, 200, 20);
        fAge.setBounds(150, 80, 200, 20);
        
        btnUpd.setBounds(300, 35, 90, 20);
    }
}
