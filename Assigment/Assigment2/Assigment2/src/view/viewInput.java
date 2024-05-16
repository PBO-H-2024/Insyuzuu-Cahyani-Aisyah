package view;

import javax.swing.*;

public class viewInput extends JFrame {        
    JLabel lNim=new JLabel("NIM");
    JTextField fNim=new JTextField();
    
    JLabel lName=new JLabel("NAME");
    JTextField fName=new JTextField();
    
    JLabel lAge=new JLabel("AGE");
    JTextField fAge=new JTextField();
    
    JButton btnAdd=new JButton("ADD");
    
    public viewInput() {
        setLayout(null);
        setSize(400, 200);;
        setVisible(true);
        setLocationRelativeTo(null);

        add(lNim);
        add(fNim);
        add(lName);
        add(fName);
        add(lAge);
        add(fAge);
        add(btnAdd);

        lNim.setBounds(20, 20, 120, 20);
        lName.setBounds(20, 50, 120, 20);
        lAge.setBounds(20, 80, 120, 20);

        fNim.setBounds(150, 20, 200, 20);
        fName.setBounds(150, 50, 200, 20);
        fAge.setBounds(150, 80, 200, 20);

        btnAdd.setBounds(20, 130, 90, 20);    
    }

    public JTextField getfNim() {
        return fNim;
    }

    public void setfNim(JTextField fNim) {
        this.fNim = fNim;
    }

    public JTextField getfName() {
        return fName;
    }

    public Object getBtnAdd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getfAge() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}