package controller;

import model.connector;
import view.viewInput;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class inputData {
    connector con;
    viewInput view;

    public inputData(connector con, viewInput view) {
        this.con = con;
        this.view = view;

        view.getBtnAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    con.insertData(Integer.parseInt(view.getfNim().getText()), view.getfName().getText(), Integer.parseInt(view.getfAge().getText()));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid NIM and AGE.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public connector getCon() {
        return con;
    }

    public viewInput getViewInput() {
        return view;
    }
}