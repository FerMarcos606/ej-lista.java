package fer.dev;

import java.util.ArrayList;
import java.util.List;

public class WeekDays {
    
    private List<String> days;

    public WeekDays() {
        System.out.println("Constructor WeekDays llamado");
        days = new ArrayList<>(); // siempre inicializada
    }

    public List<String> getDays() {
        return days;
    }

    public void createList() {
        days.add("Lunes");
        days.add("Martes");
        days.add("Miércoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sábado");
        days.add("Domingo");
    }
    public void clear() {
    days.clear();
}
}

