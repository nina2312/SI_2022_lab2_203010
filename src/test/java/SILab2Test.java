import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    @Test
    void everyBranchTest(){
        List<String> s1 =  List.of();
        List<String> s2 = List.of("0", "#");


        IllegalArgumentException prazna, neKvadratna;

        prazna= assertThrows(IllegalArgumentException.class, () -> SILab2.function(s1));
        assertTrue(prazna.getMessage().contains("Dolzinata na listata da e pogolema od 0"));

        neKvadratna=assertThrows(IllegalArgumentException.class, () -> SILab2.function(s2));
        assertTrue(neKvadratna.getMessage().contains("Dolzinata na listata treba da bide kvadratna matrica"));
    }

}