/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cluster;

import java.util.Scanner;
/**
 *
 * @author Dewa
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    
    static Scanner input = new Scanner(System.in);
    
    static int[] Ascending(int[] array){
        boolean swap = true;
        int temp = 0;
        
        while(swap){
            swap = false;
            
            for(int i=0; i < array.length-1;i++){
                if(array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    
                    swap = true;
                }
            }
        }
        
        return array;
    }
    
    static int[] Descending(int[] array){
        boolean swap = true;
        int temp = 0;
        
        while(swap){
            swap = false;
            
            for(int i = 0; i < array.length-1; i++){
                if(array[i] < array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    
                    swap = true;
                }
            }
        }
        
        return array;
    }
    
    static int[] init(){
        int jumlah;
        
        System.out.print("Masukkan Jumlah Bilangan: ");
        jumlah = input.nextInt();
        int array[] = new int[jumlah];
        
        for(int  a=0; a<jumlah; a++){
            System.out.print("Bilngan Ke-" + (a+1) + ": ");
            array[a] = input.nextInt();
        }
        
        return array;
    }
    
    static int min(int[] array){
        int min = array[0];
        
        for(int a=0; a < array.length; a++){
            if(min > array[a]){
                min = array[a];
            }
        }
        
        return min;
    }
    
    static int max(int[] array){
        int max = array[0];
        
        for(int a=0; a < array.length; a++){
            if(max < array[a]){
                max = array[a];
            }
        }
        
        return max;
    }
    
    static double avg(int[] array){
        int avg, jumlah = 0;
        
        for(int a=0; a<array.length; a++){
            jumlah += array[a];
        }
        
        avg = jumlah / array.length;
        
        return avg;
    }
    
    static void pengakhiran(){
        Scanner input = new Scanner(System.in);
        char pilih;
        
        System.out.println("\nApakah ingin melanjutkan? y/n");
        pilih = input.next().charAt(0);
        
        switch(pilih){
            case 'y':
                alur();
                break;
            case 'n':
                System.out.println("Program Selesai");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak ada!");
                System.exit(0);
        }
    }
    
    static void alur(){
        int pilih, array[], hasil[];
        array = init();
        hasil = new int[array.length];
        
        System.out.println("\nPilih Metode");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Pilihan: ");
        pilih = input.nextInt();
        
        System.out.println("\nSebelum Sortir");
        for(int temp : array){
            System.out.print(temp + " ");
        }
        
        switch(pilih){
            case 1:
                hasil = Ascending(array);
                break;
            case 2:
                hasil = Descending(array);
                break;
            default:
                System.out.println("Pilihan tidak ada!");
                System.exit(0);
        }
        
        System.out.println("\nHasil Sortir");
        for(int num : hasil){
            System.out.print(num + " ");
        }
        
        System.out.print("\nNilai Minimal: " + min(hasil));
        System.out.print("\nNilai Maximal: " + max(hasil));
        System.out.print("\nNilai Rata-rata: " + avg(hasil));
        pengakhiran();
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        alur();
    }
    
}
