/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;
import BangunDatar.Segitiga;
/**
 *
 * @author LENOVO
 */
public class LimasSegitiga extends Segitiga implements HitungRuang{
    //attribute
    double tinggi;
    
    //constructor
    public LimasSegitiga(double a, double b, double c, double tinggiL) {
        super(a, b, c);
        this.tinggi = tinggiL;
    }

    //method
    @Override
    public double volume() {
        return (super.luas()*tinggi)/3;
    }

    @Override
    public double luasPermukaan() {
        double t = Math.sqrt(Math.pow(super.getsisiB(), 2) - Math.pow((super.getsisiA()/2),2));
        double sisiT = Math.hypot(tinggi, t/2);
        double stA = (super.getsisiA() * sisiT)/2;
        double stB = (super.getsisiB() * sisiT)/2;
        double stC = (super.getsisiC() * sisiT)/2;

       
        return (super.luas()+ stA +stB+stC);
    }
    
    
    
    
}
