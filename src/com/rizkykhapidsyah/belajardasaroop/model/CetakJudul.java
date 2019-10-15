package com.rizkykhapidsyah.belajardasaroop.model;

import com.rizkykhapidsyah.belajardasaroop.model.Banner;

public class CetakJudul {

    String Judul[] = {
            "BAGIAN 1",
            "BAGIAN 2",
            "BAGIAN 3"
    };

    public void CetakJudul() {
        int i;

        Banner BannerBagian1 = new Banner();
        BannerBagian1.setHuruf('#');
        BannerBagian1.setJudul(Judul);

        for (i = 0; i <= 50; i++) {
            System.out.print(BannerBagian1.getHuruf());
        }
        System.out.println("\n" + BannerBagian1.getJudul());
    }
}
