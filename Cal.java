/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;

import java.util.Scanner;

/**
 *
 * @author galih
 */
public class Cal {
    public static void main(String[] args){
        
        System.out.println("Kalkulator by:M.Galih Fikran Syah");
        System.out.println("19090074");
        run(0);
    }
    
    public static double penjumlahan(double angka1,double angka2){
        double result = angka1 + angka2;
        return result;
    }
    public static double pengurangan(double angka1,double angka2){
        double result = angka1 - angka2;
        return result;
    }
    public static double perkalian(double angka1,double angka2){
        double result = angka1 * angka2;
        return result;
    }
    public static double pembagian(double angka1,double angka2){
        double result = angka1 / angka2;
        return result;
    }
    
    static void replay(double hasil){
        Scanner key = new Scanner(System.in);
        String ans;        
        System.out.print("Lagi?, Y/N: ");
        ans = key.nextLine();
        int simpanHasil;
        if(ans.equals("y") || ans.equals("Y")){
            System.out.print("Simpan angka hasil sebagai angka pertama(\"1\") atau reset angka(\"0\")");
            simpanHasil = key.nextInt();
            System.out.print(simpanHasil);
            
            if(simpanHasil == 1){
                run(hasil);
            }else{
                run(0);
            }
            
            
        }else{
            System.out.println("Terima Kasih :)");
        }
    }
    static void run(double hsl){
        double angka1,angka2;
        String[] operasi = {"Tambah","Kurang","Kali","Bagi"};

        Scanner key = new Scanner(System.in);
        
        
        if(hsl == 0){
            System.out.print("Masukan angka pertama:");
            angka1 = key.nextDouble();
        }else{
            angka1 = hsl;
        }
        System.out.print("Masukan angka kedua:");
        angka2 = key.nextDouble();
        
        
        
        for(int i = 0; i < operasi.length; i++){
            System.out.println(i+1+"."+operasi[i]);
        }        
        System.out.print("Pilih Operasi Aritmatika: ");
        int ans = key.nextInt();
        switch (ans){
            case 1:
            System.out.print(angka1+"+"+angka2+"= ");
            System.out.println(penjumlahan(angka1, angka2));
            replay(penjumlahan(angka1, angka2));
                break;
            case 2:
            System.out.print(angka1+"-"+angka2+"= ");
            System.out.println(pengurangan(angka1, angka2));
            replay(pengurangan(angka1, angka2));
                break;
            case 3:
            System.out.print(angka1+"*"+angka2+"= ");
            System.out.println(perkalian(angka1, angka2));
            replay(perkalian(angka1, angka2));
                break;
            case 4:
            System.out.print(angka1+"/"+angka2+"= ");
            System.out.println(pembagian(angka1, angka2));
            replay(pembagian(angka1, angka2));
                break;
            default:
            System.out.println("Input yang anda masukan salah");
            replay(0);
                break;
        }
        
    }
}
