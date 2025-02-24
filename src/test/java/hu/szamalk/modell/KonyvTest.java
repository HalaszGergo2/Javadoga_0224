package hu.szamalk.modell;
//
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class KonyvTest {
    @Test
    public void konyvTestCim(){
        Assertions.assertThrows(NemLetezoKonyvException.class, () -> {new Konyv("Halász Gergő", "cim", 2002);});
    }
}