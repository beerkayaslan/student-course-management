
package models;

import interfaces.IPerson;

public class Ogrenci extends Kisi implements IPerson {
    public Ogrenci(int id, String isim) {
        super(id, isim);
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Öğrenci ID: " + getId() + ", İsim: " + getIsim());
    }
}
