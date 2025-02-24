package hu.szamalk.modell;

import java.util.HashSet;
import java.util.Iterator;

public class Gyujtemeny implements Iterable{
    private HashSet<Media> ferohely;

    public Gyujtemeny() {
        this.ferohely = new HashSet<>(5);
    }

    public void vetel(Media media){
        if (ferohely.contains(media)){
            System.out.println("Már megvan ez a média.");
        }else {
            ferohely.add(media);
        }
    }

    public void eladas(Media media){
        if (ferohely.contains(media)) {
            ferohely.remove(media);
        }else {
            System.out.println("Nincs benne az eladni próbált média a gyüjteményben.");
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public String toString() {
        return "Gyujtemeny{" +
                "ferohely=" + ferohely +
                '}';
    }
}
