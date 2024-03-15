/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;
import BangunDatar.Lingkaran;

/**
 *
 * @author LENOVO
 */
    public class Tabung extends Lingkaran implements HitungRuang{
   // attribute
    double tinggi;
    
    //constructor
    public Tabung(double r, double t){
        super(r);
        this.tinggi = t;
        
    }
    
    @Override
    public double volume(){
        return Math.PI*super.getJari()*super.getJari()*tinggi;
        
    }

    //method
    @Override
    public double luasPermukaan() {
        return super.luas()+ (2* Math.PI*super.getJari()*tinggi);
    }

}
