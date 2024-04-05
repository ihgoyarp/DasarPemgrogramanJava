package com.dicoding.javafundamental.basic;
import com.dicoding.javafundamental.kendaraan.*;
import com.dicoding.javafundamental.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");
        Gitar.bunyi();
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);

        System.out.println("Operasi Penjumlahan");
        int hasilPenjumlahan = 5 + 1;
        System.out.println("Hasil 5 + 1 = " + hasilPenjumlahan);
        System.out.println();

    }
}
