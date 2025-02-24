package hu.szamalk.modell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//
class GyujtemenyTest {

    @Test
    public void gyujtemenyTest(){
        Gyujtemeny gyujt1 = new Gyujtemeny();
        Gyujtemeny gyujt2 = new Gyujtemeny();
        Gyujtemeny gyujt3 = new Gyujtemeny();
        gyujt1.vetel(new Media("Én", "Ez a címe", 1999, 10000, "leiras1"));
        gyujt2.vetel(new Media("Valaki", "Ez itt egy cím", 1992, 1000, "leiras2"));
        gyujt3.vetel(new Media("Valaki3", "Ez itt egy cím33", 1992, 1000, "leiras2"));
    }

}