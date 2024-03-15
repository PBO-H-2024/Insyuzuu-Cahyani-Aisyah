/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author LENOVO
 */
public class Segitiga implements HitungDatar{
    //attribute
    //public double a,b,c;
    private double sisiA;
    private double sisiB;
    private double sisiC;
    
    //constructor
    public Segitiga(double a, double b, double c){
        this.sisiA = a;
        this.sisiB = b;
        this.sisiC = c;
    }
    
    
    //setter and getter
    public double getsisiA() {
        return sisiA;
    }

    public void setsisiA(double sisiA) {
        this.sisiA = sisiA;
    }

    public double getsisiB() {
        return sisiB;
    }

    public void setsisiB(double sisiB) {
        this.sisiB = sisiB;
    }
    
        public double getsisiC() {
        return sisiC;
    }

    public void setsisiC(double sisiC) {
        this.sisiC = sisiC;
    }
    
    //method

    @Override
    public double luas() {
        double tinggi = Math.sqrt(Math.pow(sisiB, 2) - Math.pow((sisiA/2),2)); 
        return (sisiA*tinggi)/2;
    }

    @Override
    public double keliling() {
        return sisiA+sisiB+sisiC;
    }

}
