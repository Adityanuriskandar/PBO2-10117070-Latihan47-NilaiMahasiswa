/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menghitung nilai 
 * akhir
 */
public class PBO210117070Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Nilai nilai1 = new Nilai();
        
        System.out.print("Masukkan nilai Quiz : ");
        double quiz = scn.nextDouble();
        System.out.print("Masukkan nilai UTS : ");
        double uts = scn.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        double uas = scn.nextDouble();
        System.out.println();
        
        double ni = nilai1.hitungNilaiAkhir(quiz, uts, uas);
        char indeks = nilai1.hitungNilaiIndex(ni);
        String ket = nilai1.keterangan(indeks);
        
        System.out.println("Nilai Akhir = " + ni);
        System.out.println();
        
        System.out.println("Index = " + indeks);
        System.out.println("Keterangan = " + ket);
    }
    
}
