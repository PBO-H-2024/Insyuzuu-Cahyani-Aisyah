/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasVolume;

import BangunDatar.Lingkaran;
import BangunRuang.Tabung;
import BangunDatar.Segitiga;
import BangunRuang.LimasSegitiga;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double t, r, a, c, y;
        boolean ulang = true;

        while (ulang) {
            System.out.println("Menghitung Volume Bangun Ruang");
            System.out.println("1. TABUNG");
            System.out.println("2. LIMAS SEGITIGA");
            System.out.println("3. Keluar");
            System.out.println("====================");
            System.out.println("PILIH MENU (1/2/3) : ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Input Jari-jari Tabung :");
                    r = input.nextDouble();
                    System.out.println("Input Tinggi Tabung : ");
                    t = input.nextDouble();

                    Lingkaran l = new Lingkaran(r);

                    System.out.println("Keliling Lingkaran : " + l.keliling());
                    System.out.println("Luas Lingkaran : " + l.luas());

                    Tabung b = new Tabung(r, t);

                    System.out.println("Volume Tabung adalah :" + b.volume());
                    System.out.println("Luas permukaan Tabung : " + b.luasPermukaan());
                    break;

                case 2:
                    System.out.println("Input panjang sisi A : ");
                    a = input.nextDouble();
                    System.out.println("Input panjang sisi B : ");
                    y = input.nextDouble();
                    System.out.println("Input panjang sisi C : ");
                    c = input.nextDouble();
                    System.out.println("");
                    System.out.println("Input tinggi limas : ");
                    t = input.nextDouble();

                    Segitiga ABC = new Segitiga(a, y, c);
                    LimasSegitiga TABC = new LimasSegitiga(a, y, c, t);

                    System.out.println("Keliling Segitiga adalah " + ABC.keliling());
                    System.out.println("Luas Segitiga adalah " + ABC.luas());
                    System.out.println("Volume Limas Segitiga adalah " + TABC.volume());
                    System.out.println("Luas permukaan Limas adalah " + TABC.luasPermukaan());
                    break;

                case 3:
                    ulang = false;
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

            if (ulang) {
                System.out.println("Apakah anda ingin kembali ke menu awal? (y/n): ");
                String jawab = input.next();
                ulang = jawab.equalsIgnoreCase("y");
            }
        }

        input.close();
    }
}
