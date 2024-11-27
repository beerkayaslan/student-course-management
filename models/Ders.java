
package models;

import java.util.ArrayList;
import java.util.List;

public class Ders {
    private String ad;
    private int kredi;
    private OgretimGorevlisi ogretimGorevlisi;
    private List<Ogrenci> ogrenciler;

    public Ders(String ad, int kredi, OgretimGorevlisi ogretimGorevlisi) {
        this.ad = ad;
        this.kredi = kredi;
        this.ogretimGorevlisi = ogretimGorevlisi;
        this.ogrenciler = new ArrayList<>();
    }

    public void ogrenciEkle(Ogrenci ogrenci) {
        ogrenciler.add(ogrenci);
        System.out.println(ogrenci.getIsim() + " derse eklendi: " + ad);
    }

    public void bilgiGoster() {
        System.out.println("Ders: " + ad + ", Kredi: " + kredi + ", Öğretim Görevlisi: " + ogretimGorevlisi.getIsim());
        System.out.println("Kayıtlı Öğrenciler:");
        for (Ogrenci ogrenci : ogrenciler) {
            System.out.println("- " + ogrenci.getIsim());
        }
    }
}
