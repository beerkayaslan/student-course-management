
package models;

import interfaces.IPerson;

public class OgretimGorevlisi extends Kisi implements IPerson {
    public OgretimGorevlisi(int id, String isim) {
        super(id, isim);
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Öğretim Görevlisi ID: " + getId() + ", İsim: " + getIsim());
    }
}
