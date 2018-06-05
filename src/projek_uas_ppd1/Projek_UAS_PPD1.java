/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek_uas_ppd1;

/**
 *
 * @author StefanoZaghallo
 */
import java.util.Scanner;
import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Projek_UAS_PPD1 {

    public static void main(String[] args) {

        //variabel waktu
        tanggal tgl = new tanggal();

        //variabel tabel pemesanan
        String[] nama ;
        nama = new String[15];
        
        //jam menggunakkan durasi menit
        int[] jam;
        jam = new int[15];
        double[] harga_pr;
        double[] harga_or;
        double[] total_harga;
        char[] status;

        //tampilan menu utama
        System.out.println("Tanggal : " + tgl.getTanggal());
        System.out.println("Waktu : " + tgl.getWaktu());
        System.out.println("=============== MAIN MENU ===============");
        System.out.println("LAPANGAN");
        System.out.println("1. Lapangan Premium");
        System.out.println("Keterangan : ");
        System.out.println(" * Standar Internasional (38m x 18m)");
        System.out.println(" * Harga : 150 IDR");
        System.out.println(" * Bonus Minuman dan Makanan");

        System.out.println(" ");

        System.out.println("2. Lapangan Standar1");
        System.out.println("Keterangan : ");
        System.out.println(" * Standar Nasional (25m x 15m)");
        System.out.println(" * Harga : 100 IDR");

        System.out.println(" ");

        System.out.println("3. Lapangan Standar2");
        System.out.println("Keterangan : ");
        System.out.println(" * Standar Nasional (25m x 15m)");
        System.out.println(" * Harga : 100 IDR");

        System.out.println("==========================================");
        System.out.println("  note : dilarang membawa barang berbahaya");
        Scanner sc = new Scanner(System.in);

        //memasukkan pilihan dari menu utama
        int pilihan;
        System.out.print("Pilih Lapangan : ");
        pilihan = sc.nextInt();
        
        jadwalpesan jp;
        jp = new jadwalpesan();

        //Tampilan selanjutnya berdasarkan input dari pilihan
        if (pilihan == 1) {
            System.out.println("|\t Nama \t"+"|"+"\t Waktu \t"+"|"+"\t Harga \t"+"|"+"\t Denda \t"+"|"+"\t Total Harga \t|");
            System.out.print("|\t");
        } else if (pilihan == 2) {
            System.out.println("|\t Nama \t"+"|"+"\t Waktu \t"+"|"+"\t Harga \t"+"|"+"\t Denda \t"+"|"+"\t Total Harga \t|");
        } else if (pilihan == 3) {
            System.out.println("|\t Nama \t"+"|"+"\t Waktu \t"+"|"+"\t Harga \t"+"|"+"\t Denda \t"+"|"+"\t Total Harga \t|");
        }
    }

}
