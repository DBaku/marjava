import java.util.ArrayList;
import java.util.List;


// Aufagbe 1 

public class ListExample {
    public static void main(String[] args) {
        // Initialisierung einer ArrayList
        List<String> listOne = new ArrayList<>();
    


        // Initialisierung mit Werten
        List<String> Fruitlist = new ArrayList<>(List.of("Apple", "Banana", "Orange"));
    }


// aufgabe 2 

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


    // aufgabe 3 

    public class ListExample3 {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>(List.of("Apple", "Banana", "Cherry"));
    
            // Überprüfung, ob ein Element enthalten ist
            boolean containsApple = list.contains("Apple");
        }
    }



    // aufgabe 4
    public class ListExample4 {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>(List.of("Apple", "Banana", "Cherry"));
    
            // Entfernen nach Index
            list.remove(1); // Entfernt "Banana"
    
            // Entfernen nach Objekt
            list.remove("Cherry"); // Entfernt "Cherry"
        }
    }

    // aufgabe 5 
    public class ListPrinter {
    
        // Methode, um alle Elemente einer ArrayList zu drucken
        public static void printList(List<?> list) {
            for (Object element : list) {
                System.out.println(element);
            }
        }
    
        public static void main(String[] args) {
            // Beispiel-ArrayList
            List<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Cherry");
    
            // Aufruf der Methode zum Drucken der Elemente
            printList(fruits);
        }
    }

    // aufgabe 6 


}
