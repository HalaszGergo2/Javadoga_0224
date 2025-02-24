package hu.szamalk.modell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

    public FileOutputStream kiIr(){
        try {
            return new FileOutputStream("gyujtemeny.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public FileInputStream beolvas(){
        File beolvasott = new File("beolvasott.txt");
        try {
            return new FileInputStream(beolvasott);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
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
