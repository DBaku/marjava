import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations {

    // Aufgabe 2: Elemente zählen
    public static <T> int countElements(List<T> list) {
        return list.size();
    }

    // Aufgabe 3: Bestimmtes Element suchen
    public static <T> boolean containsElement(List<T> list, T element) {
        return list.contains(element);
    }

    // Aufgabe 4: Element entfernen
    public static <T> void removeElement(List<T> list, T element) {
        list.remove(element);
    }

    // Aufgabe 5: Alle Elemente einer ArrayList drucken
    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    // Aufgabe 6: ArrayList in ein Array umwandeln
    public static <T> T[] convertListToArray(List<T> list, T[] array) {
        return list.toArray(array);
    }

    // Aufgabe 7: ArrayList sortieren
    public static void sortList(List<String> list) {
        list.sort(null);
    }

    // Aufgabe 8: Doppelte Elemente entfernen
    public static <T> List<T> removeDuplicates(List<T> list) {
        List<T> uniqueList = new ArrayList<>();
        for (T element : list) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }
        return uniqueList;
    }

    public static void main(String[] args) {
        // Beispiel-ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Apfel");
        fruits.add("Banane");
        fruits.add("Orange");
        fruits.add("Apfel");

        // Aufgabe 2: Elemente zählen
        System.out.println("Anzahl der Elemente: " + countElements(fruits));

        // Aufgabe 3: Bestimmtes Element suchen
        System.out.println("Enthält 'Banane': " + containsElement(fruits, "Banane"));
        System.out.println("Enthält 'Traube': " + containsElement(fruits, "Traube"));

        // Aufgabe 4: Element entfernen
        removeElement(fruits, "Banane");
        System.out.println("Nach Entfernen von 'Banane': " + fruits);

        // Aufgabe 5: Alle Elemente einer ArrayList drucken
        System.out.println("Alle Elemente:");
        printList(fruits);

        // Aufgabe 6: ArrayList in ein Array umwandeln
        String[] fruitArray = convertListToArray(fruits, new String[0]);
        System.out.println("Array-Inhalt:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // Aufgabe 7: ArrayList sortieren
        sortList(fruits);
        System.out.println("Sortierte Liste:");
        printList(fruits);

        // Aufgabe 8: Doppelte Elemente entfernen
        List<String> uniqueFruits = removeDuplicates(fruits);
        System.out.println("Liste ohne Duplikate:");
        printList(uniqueFruits);
    }
}
