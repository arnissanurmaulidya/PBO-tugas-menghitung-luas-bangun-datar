/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.menghitung.luas.segitiga1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class PBOMenghitungLuasSegitiga1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int alas;
        int tinggi;
        double luas;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("Masukkan Nilai Alas: ");
        alas = scan.nextInt();
        System.out.print("Masukkan Nilai Tinggi: ");
        tinggi = scan.nextInt();
        
        luas = (alas * tinggi /2);
        System.out.println("Luas Segitiga adalah = " + luas);
    }
    
}
