
import models.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Öğrenci ve Ders Yönetim Sistemine Hoş Geldiniz!");

        // Örnek sistem tanımlamaları
        OgretimGorevlisi ogretimGorevlisi = new OgretimGorevlisi(1, "Dr. Emrah Sarıçiçek");
        Ders ders = new Ders("Matematik", 4, ogretimGorevlisi);
        Ogrenci ogrenci = new Ogrenci(1, "Ali Veli");

        // Öğrenci derse kayıt oluyor
        ders.ogrenciEkle(ogrenci);

        // Ders bilgilerini göster
        ders.bilgiGoster();
    }
}
