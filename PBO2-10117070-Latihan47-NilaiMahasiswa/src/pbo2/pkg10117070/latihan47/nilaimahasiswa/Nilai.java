/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan47.nilaimahasiswa;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menghitung nilai 
 * akhir
 */
public class Nilai {
     private double nAkhir;
    private char index;
    
    public double hitungNilaiAkhir(double quiz, double uts, double uas) {
        nAkhir = (0.20 * quiz) + (0.30 * uts) + (0.50 * uas);
        return nAkhir;
    }
    
    public char hitungNilaiIndex(double ni) {
        if(80 <= ni && ni <= 100) {
            index = 'A';
            return index;
        } else if(68 <= ni && ni < 80) {
            index = 'B';
            return index;
        } else if(56 <= ni && ni < 68) {
            index = 'C';
            return index;
        } else if(45 <= ni && ni < 56) {
            index = 'D';
            return index;
        } else {
            index = 'E';
            return index;
        }
    }
    
    public String keterangan(char indeks) {
        String ket;
        switch(indeks) {
            case 'A':
                ket = "Sangat Baik";
                break;
            case 'B':
                ket = "Baik";
                break;
            case 'C':
                ket = "Cukup";
                break;
            case 'D':
                ket = "Kurang";
                break;
            default:
                ket = "Sangat Kurang";
                break;
        }
        return ket;
    }
    
}
