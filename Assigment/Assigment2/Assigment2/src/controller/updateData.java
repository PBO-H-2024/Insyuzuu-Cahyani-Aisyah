package controller;

import model.connector;
import view.viewUpdate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class updateData {
    connector con;
    viewUpdate view;
    int id;

    public updateData(connector con, viewUpdate view, int id) {
        this.con = con;
        this.view = view;
        this.id = id;

        view.btnUpd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con.updateData(id, Integer.parseInt(view.fNim.getText()), view.fName.getText(), Integer.parseInt(view.fAge.getText()));
            }
        });
    }
}
