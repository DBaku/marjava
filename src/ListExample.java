import java.util.ArrayList;
import java.util.List;


// Aufagbe 1 

public class ListExample {
    public static void main(String[] args) {
        // Initialisierung einer ArrayList
        List<String> list = new ArrayList<>();
    


        // Initialisierung mit Werten
        List<String> Fruitlist = new ArrayList<>(List.of("Apple", "Banana", "Orange"));
    }




    public class ListExample2 {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
    
            list.add(1, "Cherry"); 
            // Hinzufügen an einer bestimmten Position
            // Fügt "Cherry" an der zweiten Position ein
        }
    }
}
