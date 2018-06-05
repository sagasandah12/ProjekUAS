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

public class jadwalpesan extends Projek_UAS_PPD1 {

    Scanner sc = new Scanner(System.in);

    //variabel waktu
    tanggal tgl = new tanggal();

    //dalam satuan menit
    int waktu(){
        int wk[];
        wk = new int[15];
        for(int a =0;a<=15;a++){
           wk[a] = sc.nextInt();
        }
        return ();
    }
    

    double harga() {
        return (double) (sc.nextDouble());
    }

    double denda() {
        if (waktu() > waktu()) {

        } else {
        }
        return ((waktu() / 60) * 10000);
    }

    double totalharga() {
        return ((waktu() * harga()) + denda());
    }

}
