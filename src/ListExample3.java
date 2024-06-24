import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;


// Aufagbe 1 

public class ListExample2 {

    public static void main(String[] args) {
        // ArrayList von Strings erstellen
        List<String> fruits = new ArrayList<>();

        // Werte zur ArrayList hinzufügen
        fruits.add("Apfel");
        fruits.add("Banane");
        fruits.add("Orange");

        // ArrayList ausdrucken
        System.out.println("Inhalt der ArrayList: " + fruits);
    }
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
    public class ListToArrayConverter {

        // Methode, die eine ArrayList in ein Array umwandelt
        public static <T> T[] convertListToArray(List<T> list, T[] array) {
            return list.toArray(array);
        }
    
        public static void main(String[] args) {
            // Beispiel-ArrayList
            List<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Cherry");
    
            // Konvertierung in ein Array
            String[] fruitArray = convertListToArray(fruits, new String[0]);
    
            // Ausgabe des Arrays
            for (String fruit : fruitArray) {
                System.out.println(fruit);
            }
            // Erklärung
            
            // Die Methode convertListToArray verwendet die toArray-Methode von ArrayList, um eine ArrayList in ein Array zu konvertieren. Das Array wird als Parameter übergeben, um den Typ anzugeben.
        }
    }

    // aufgabe 7
    public class ListSorter {

        // Methode, die eine ArrayList von Strings in aufsteigender Reihenfolge sortiert
        public static void sortList(List<String> list) {
            Collections.sort(list);
        }
    
        public static void main(String[] args) {
            // Beispiel-ArrayList
            List<String> fruits = new ArrayList<>();
            fruits.add("Banana");
            fruits.add("Apple");
            fruits.add("Cherry");
    
            // Sortierung der Liste
            sortList(fruits);
    
            // Ausgabe der sortierten Liste
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
            // info and explaining
            // Die Methode sortList verwendet Collections.sort, um die ArrayList in aufsteigender Reihenfolge zu sortieren.
        }
    }


    public class DuplicateRemover {

        // Methode, die doppelte Elemente aus einer ArrayList entfernt
        public static <T> List<T> removeDuplicates(List<T> list) {
            Set<T> set = new LinkedHashSet<>(list);
            return new ArrayList<>(set);
        }
    
        public static void main(String[] args) {
            // Beispiel-ArrayList mit doppelten Elementen
            List<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Apple");
            fruits.add("Cherry");
            fruits.add("Banana");
    
            // Entfernen der doppelten Elemente
            List<String> uniqueFruits = removeDuplicates(fruits);
    
            // Ausgabe der Liste ohne doppelte Elemente
            for (String fruit : uniqueFruits) {
                System.out.println(fruit);
            }
        }
    }

}
