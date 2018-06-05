/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek_uas_ppd1;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class tanggal extends Projek_UAS_PPD1 {

    public String getTanggal() {
        DateFormat dt = new SimpleDateFormat("yyyy/mm/dd");
        Date date = new Date();
        return dt.format(date);
    }

    public String getWaktu() {
        DateFormat dt = new SimpleDateFormat("hh:mm:ss");
        Date date = new Date();
        return dt.format(date);
    }
	
	public void test(){
		
	}

}
