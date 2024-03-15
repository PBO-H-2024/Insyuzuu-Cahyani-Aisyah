/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author LENOVO
 */
public class Lingkaran implements HitungDatar{
    //attribute
    public double jari;
    
    //constructor
    public Lingkaran(double r){
        this.jari = r;
    }
    
    
    //setter and getter
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    
    
    //method
    @Override
    public double luas() {
        return Math.PI*jari*jari;
    }

    @Override
    public double keliling() {
       return Math.PI*2*jari;
    }
    

}
