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
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Projek_UAS_PPD1 {

    public static void main(String[] args) {
        menu();
    }

    //menu utama
    static void menu() {
        //inisiasi class tanggal
        tanggal tgl = new tanggal();
        Scanner sc = new Scanner(System.in);
        //menu awal
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
        System.out.println("note : dilarang membawa barang berbahaya");

        //memasukkan pilihan dari menu awal
        int pilih;
        System.out.print("Pilih Lapangan : ");
        pilih = sc.nextInt();
        if (pilih == 1) {
            tabel1();
        } else if (pilih == 2) {

        }//akhir dari memasukkan pilihan 
    }//akhir menu()

    //tabel pemesanan
    static void tabel1() {
        //inisiasi class jadwalpesan dan inputan
        jadwalpesan jp = new jadwalpesan();
        Scanner sc = new Scanner(System.in);
        //melihat tabel apakah sudah ada pesan atau tidak
        System.out.println("|\tNama \t" + "|" + "\tWaktu \t" + "|" + "\tHarga \t" + "|" + "\tTotal Harga \t|");

        //perulangan u/ melihat isi tabel
        for (int a = 0; a < 15; a++) {
            
                System.out.print("|\t" + jp.nama1[a] + "\t|\t" + jp.waktu1[a] + "\t|\t" + jp.harga1[a] + "\t|\t" + jp.totalharga1[a] + "\t|");
            
            System.out.println("");
        }//akhir dari perulangan

        //menampilkan pesan atau kembali
        System.out.println(" 1.) Pesan");
        System.out.println(" 2.) Kembali");

        //pilihan pesan atau kembali
        System.out.print("Pilih menu : ");
        int pilih = sc.nextInt();

        //isi data
        if (pilih == 1) {
            int zz = 0;
            int pn;

            //mengisi data sesuai kolom yang dipilih
            System.out.print("Pilih kolom : ");
            pn = sc.nextInt();

            for (int a = pn; a <= pn; a++) {
                jp.kodepesan[a] = zz + 1;

                System.out.print("Nama : ");
                jp.nama1[a] = sc.next();

                System.out.print("Waktu : ");
                jp.waktu1[a] = sc.nextInt();

                System.out.println("Harga : 100000 ");
                jp.harga1[a] = 100000;

                jp.totalharga1[a] = jp.harga1[a] * jp.waktu1[a];
                System.out.println("totalharga : " + jp.totalharga1[a]);
                System.out.println(" ");

                //bukti pemesanan
                System.out.println("Kode pesan  : CP" + jp.kodepesan[a]);
                System.out.println("Nama        : " + jp.nama1[a]);
                System.out.println("Waktu       : " + jp.waktu1[a]);
                System.out.println("Harga       : " + jp.harga1[a]);
                System.out.println("Total harga : " + jp.totalharga1[a]);
               
            }//akhir dari perulangan

            //menanyakan apakah data sudah benar
            System.out.println("Apakah data sudah benar ? (Y/N)");
            char ch = sc.next().charAt(0);
            if (ch == 'Y' || ch == 'y') {
                menu();
            } else if (ch == 'N' || ch == 'n') {
                tabel1();
            }//akhir dari pertanyaan
        
        //pilihan ke-2, kembali ke menu
        } else if (pilih == 2) {
            menu();
        }//akhir pilihan pesan atau kembali

       
    }//akhir tabel1()

    static void keluar() {
        // inputan
        Scanner sc = new Scanner(System.in);

        //pernyataan biar ragu :)
        System.out.println("Yakin ingin keluar ??? (Y/N)");
        System.out.println("jika N : Kembali ke menu awal");
        char ch = sc.next().charAt(0);
        if (ch == 'Y' || ch == 'y') {
            System.exit(0);
        } else if (ch == 'N' || ch == 'n') {
            menu();
        }
    }//akhir keluar()

}//akhir dari class
