package controller;

import model.connector;
import view.viewInput;
import view.viewRead;
import view.viewUpdate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class readData {
    connector con;
    viewRead view;

    public readData(connector con, viewRead view) {
        this.con = con;
        this.view = view;

        view.setTableData(con.readData());

        view.getTabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int row = view.getTabel().getSelectedRow();
                int id = Integer.parseInt(view.getTabel().getValueAt(row, 0).toString());
                String name = view.getTabel().getValueAt(row, 2).toString();

                int input = JOptionPane.showConfirmDialog(null, "Do you want to delete " + name + "?", "Option...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    con.deleteData(id);
                } else {
                    input = JOptionPane.showConfirmDialog(null, "Do you want to update " + name + "?", "Option...", JOptionPane.YES_NO_OPTION);
                    if (input == 0) {
                        viewUpdate updateView = new viewUpdate();
                        new updateData(con, updateView, id);
                    }
                }
            }
        });

        view.getBtnAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewInput inputDataView = new viewInput();
                new inputData(con, inputDataView);
            }
        });

        view.getBtnRefresh().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setTableData(con.readData());
            }
        });
    }
}
