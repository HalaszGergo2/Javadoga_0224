package hu.szamalk.modell;

import java.util.UUID;

public class Media extends Konyv implements Cloneable{
        private UUID id;
        private int ar;
        private Kategoria kategoria;

    public Media(String szerzo, String cim, int kiadasiEve, int ar, Kategoria kategoria) {
        super(szerzo, cim, kiadasiEve);
        this.id = UUID.randomUUID();
        this.ar = ar;
        this.kategoria = kategoria;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public Media clone() {
        try {
            Media clone = (Media) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

