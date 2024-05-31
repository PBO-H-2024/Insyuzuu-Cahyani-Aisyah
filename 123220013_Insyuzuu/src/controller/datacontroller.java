/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import DAOdata.dataDAO;
import DAOImplement.dataimplement;
import model.*;
import view.MainView;
/**
 *
 * @author PC PRAKTIKUM
 */
public class datacontroller {
    MainView frame;
    dataimplement impldata;
    List<data> dp;
    
     public datacontroller(MainView frame){
        this.frame = frame;
        impldata = new dataDAO();
        dp = impldata.getAll();
    }
    public void isitabel(){
       dp = impldata.getAll();
       modeltabeldata mp = new modeltabeldata(dp);
       frame.getTabelData().setModel(mp);
    }
    public void insert(){
        data dp = new data();
        dp.setName(frame.getTxtName().getText());
        dp.setPath(frame.getTxtPath().getText());
        dp.setWriting(frame.getTxtWriting().getText());
        dp.setCoding(frame.getTxtCoding().getText());
        dp.setInterview(frame.getTxtInterview().getText());
        impldata.insert(dp);
    }
    public void update(){
        data dp = new data();
        dp.setName(frame.getTxtName().getText());
        dp.setPath(frame.getTxtPath().getText());
        dp.setWriting(frame.getTxtWriting().getText());
        dp.setCoding(frame.getTxtCoding().getText());
        dp.setInterview(frame.getTxtInterview().getText());
        impldata.update(dp);
    }
    public void delete(){
        int id = Integer.parseInt(frame.getTxtName().getText());
        impldata.delete(id);
    }
}
