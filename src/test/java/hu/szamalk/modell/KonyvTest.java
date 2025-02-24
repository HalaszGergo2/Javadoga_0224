package hu.szamalk.modell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class KonyvTest {
    @Test
    public void konyvTestCim(){
        Konyv konyv = new Konyv("Halász Gergő", "cim", 2002);
        Assertions.assertThrows(new NemLetezoKonyvException("Túl rövid a cím"), konyv);
    }
}