package com.rizkykhapidsyah.belajardasaroop.tampil;

import com.rizkykhapidsyah.belajardasaroop.model.CetakJudul;
import com.rizkykhapidsyah.belajardasaroop.model.Data;

import java.util.Scanner;

public class Bagian1 {

    public void Bagian1() {
        String masukkanNama;
        int masukkanUsia;
        Scanner masukkanData;
        Data AnakPertama = new Data();
        Data AnakKedua = new Data();
        CetakJudul JudulBanner1 = new CetakJudul();

        masukkanData = new Scanner(System.in);

        JudulBanner1.CetakJudul();

        System.out.print("Masukkan Nama : ");
        masukkanNama = masukkanData.nextLine();
        System.out.print("Masukkan Usia : ");
        masukkanUsia = masukkanData.nextInt();

        System.out.println("Nama Adalah  = " + masukkanNama);
        System.out.println("Usia Adalah  = " + masukkanUsia);
/*
        AnakPertama.setNama("Ahmad");
        AnakPertama.setUsia(14);

        AnakKedua.setNama("Rini");
        AnakKedua.setUsia(15);

        System.out.println(AnakPertama.getNama() + AnakPertama.getUsia());
 */
    }


}
