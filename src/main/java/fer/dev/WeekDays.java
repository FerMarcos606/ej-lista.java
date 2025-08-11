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
//         //Método devolver día solicitado
//         public String devolverDiaSolicitado(List<String> lista, String dia) {
//         for (String d : lista) { // recorro la lista
//             if (d.equalsIgnoreCase(dia)) { // ignora upper y towerCase
//                 return d;  
//             }
//         }
//         return "No es el día solicitado";  
//         }

//         // Si contiene el día solicitado
//         public void mostrarDiaSolicitado(List<String> lista, String dia) {
//            if (lista.contains(dia)) { 
//                System.out.print(dia + "Está en la lista");
//             }else{
       
//         System.out.print(dia + "No está en la lista");
//          }
//         }

//         //Ordenar la lista
//         public List<String> ordenarLista(List<String> lista) {
//         lista.sort(String::compareToIgnoreCase);  // ordena ignorando upper y toweCase
//         return lista;
//          }
}

