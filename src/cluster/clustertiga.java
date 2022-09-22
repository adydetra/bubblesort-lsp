/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluster;

import java.util.Scanner;

/**
 *
 * @author Dewa
 */
public class clustertiga {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
            
        int Total;
        char nilaiIndeks;
        double RataRata;
            
        System.out.print("Nama : "); String nama = in.nextLine();
        System.out.print("Masukan nilai Harian: "); int nilaiHarian=in.nextInt();
        System.out.print("Masukan nilai UTS: "); int nilaiUTS=in.nextInt();
        System.out.print("Masukan nilai UAS: "); int nilaiUAS=in.nextInt();
            
        Total = nilaiHarian + nilaiUTS + nilaiUAS;
        RataRata = Total / 3;
            
        //RataRata=(0.2*nilaiHarian)+(0.3*nilaiUTS)+(0.5*nilaiUAS);
        String predikat="";
        //deklarasi variable

        if(RataRata>=80){
            nilaiIndeks='A';
        }
        else if (RataRata>=70){
            nilaiIndeks='B';
        }
        else if (RataRata>=60){
            nilaiIndeks='C';
        }
        else if (RataRata>=50){
            nilaiIndeks='D';
        }
        else {
            nilaiIndeks='E';
        }

        System.out.println("Nama : " + nama);
        System.out.println("Nilai Harian : " + nilaiHarian);
        System.out.println("Nilai UTS : " + nilaiUTS);
        System.out.println("Nilai UAS : " + nilaiUAS);
        System.out.println("Rata Rata\t:"+ RataRata);
        System.out.println("Nilai Indeks\t:"+ nilaiIndeks);
 
        System.exit(0);

    }
}