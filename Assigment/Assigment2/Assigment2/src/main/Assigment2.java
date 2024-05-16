/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import model.connector;
import view.viewRead;
import controller.readData;

public class Assigment2{

    public static void main(String[] args) {
        connector con = new connector();
        viewRead readView = new viewRead();
        readData readController = new readData(con, readView);
    }
}
