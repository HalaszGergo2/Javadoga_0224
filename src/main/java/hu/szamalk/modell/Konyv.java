package hu.szamalk.modell;

public class Konyv {
    private String szerzo, cim;
    private int kiadasiEve;

    public Konyv(String szerzo, String cim, int kiadasiEve) {
        this.szerzo = szerzo;
        setCim(cim);
        this.kiadasiEve = kiadasiEve;
    }



    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        if (cim.length() < 6){
            throw new NemLetezoKonyvException("A címnek minimum 6 karakteresnek kell lennie!");
        }else{
            this.cim = cim;
        }
    }

    public int getKiadasiEve() {
        return kiadasiEve;
    }

    public void setKiadasiEve(int kiadasiEve) {
        this.kiadasiEve = kiadasiEve;
    }

    @Override
    public String toString() {
        return "Konyv{" +
                "szerzo='" + szerzo + '\'' +
                ", cim='" + cim + '\'' +
                ", kiadasiEve=" + kiadasiEve +
                '}';
    }
}
