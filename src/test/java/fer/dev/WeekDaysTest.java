package fer.dev;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class WeekDaysTest {

@Test
       void testListaInicialNullOVacia() {
        WeekDays wd = new WeekDays();
        assertTrue(wd.getDays() == null || wd.getDays().isEmpty());
    }
  }


