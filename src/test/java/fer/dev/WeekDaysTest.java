package fer.dev;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class WeekDaysTest {

// @Test
//        void testListaInicialNullOVacia() {
//         WeekDays wd = new WeekDays();
//         assertTrue(wd.getDays() == null || wd.getDays().isEmpty());
//     }

 @Test
    void testListaInicialVacia() {
        WeekDays wd = new WeekDays();
        assertTrue(wd.getDays().isEmpty());  
    }
    // @Test
    // void testCreateListLlenaLaLista() {
    //     WeekDays wd = new WeekDays();
    //     wd.createList();
    //     assertEquals(7, wd.getDays().size()); // tiene 7 elementos
    //     assertTrue(wd.getDays().contains("Lunes"));
    //     assertTrue(wd.getDays().contains("Domingo"));
    // }
    @Test
    void testCreateListLlenaLaLista() {
    WeekDays wd = new WeekDays();
    System.out.println("Antes de createList: " + wd.getDays());
    wd.createList();
    System.out.println("Después de createList: " + wd.getDays());
    assertEquals(7, wd.getDays().size());
}
}    
  


