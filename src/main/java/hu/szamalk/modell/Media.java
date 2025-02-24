package hu.szamalk.modell;

import java.util.UUID;

public class Media implements Cloneable{
        private UUID id;
        private int ar;
        private Kategoria kategoria;

    public Media(int ar, Kategoria kategoria) {
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
}

