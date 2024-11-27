
package models;

public abstract class Kisi {
    private int id;
    private String isim;

    public Kisi(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public abstract void bilgiGoster();
}
