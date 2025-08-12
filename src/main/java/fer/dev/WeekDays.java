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

    public void removeDay(String day) {
        days.remove(day);
    }

    public int size() {
        return days.size();
    }

    public int obtenerSizeLista(List<String> lista) {
        return lista.size();
    }

    public String devolverDiaSolicitado(String dia) {
        for (String d : days) {
            if (d.equalsIgnoreCase(dia)) {
                return d;
            }
        }
         return null;
    }
    public String mostrarDiaSolicitado(String dia) {
    for (String d : days) {
        if (d.equalsIgnoreCase(dia)) {
            return dia + " está en la lista";
        }
    }
    return dia + " no está en la lista";
}
public List<String> ordenarLista() {
    days.sort(String::compareToIgnoreCase);
    return days;
}


}  





