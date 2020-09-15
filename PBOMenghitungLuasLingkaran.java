/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.menghitung.luas.lingkaran;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class PBOMenghitungLuasLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r, luas, phi = 3.14;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("Masukkan panjang jari-jari lingkaran: ");
        r = scan.nextDouble();
        
        luas = phi * r * r;
        System.out.println("Luas Lingkaran adalah "+luas);
    }
    
}
