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
    @Test
    void testCreateListLlenaLaLista() {
        WeekDays wd = new WeekDays();
        wd.createList();
        assertEquals(7, wd.getDays().size()); // tiene 7 elementos
        assertTrue(wd.getDays().contains("Lunes"));
        assertTrue(wd.getDays().contains("Domingo"));
    }
    @Test
    void testClearVacíaLaLista() {
    WeekDays wd = new WeekDays();
    wd.createList();
    wd.clear();
    assertTrue(wd.getDays().isEmpty());
    }
    @Test
    void testRemoveDayEliminaCorrectamente() {
    WeekDays wd = new WeekDays();
    wd.createList();  // llena la lista
    wd.removeDay("Jueves");  // elimina "Jueves"
    assertEquals(6, wd.getDays().size(), "Se ha eliminado un día, la lista tiene ahora 6 días");
    assertFalse(wd.getDays().contains("Jueves"), "La lista no debe contener 'Jueves'");
}
    @Test
    void testSizeDevuelveTamanioLista() {
    WeekDays wd = new WeekDays();
    assertEquals(0, wd.size(), "Lista debe empezar vacía");

    wd.createList();
    assertEquals(7, wd.size(), "Lista debe tener 7 días después de createList");

    wd.clear();
    assertEquals(0, wd.size(), "Lista debe quedar vacía después de clear");
    }

}    
  


