/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.menghitung.luas.persegi.panjang;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class PBOMenghitungLuasPersegiPanjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int panjang;
        int lebar;
        double luas;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("Masukkan Nilai Panjang: ");
        panjang = scan.nextInt();
        System.out.print("Masukkan Nilai Lebar: ");
        lebar = scan.nextInt();
        
        luas = (panjang * lebar);
        System.out.println("Luas Persegi Panjang = " + luas);
    }
    
}
