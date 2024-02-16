import java.util.*;

public class sort_collections {
    static Collection<String> sortAndRemoveDuplicates(Collection<String> strings) {
        // Create a new TreeSet with the input collection to automatically sort and remove duplicates
        TreeSet<String> sortedSet = new TreeSet<>(strings);
        return sortedSet;
    }

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("Ernie");
        strings.add("Ernie");
        strings.add("Bert");
        strings.add("Elmo");
        strings.add("Grover");
        strings.add("Abby");
        System.out.println(sortAndRemoveDuplicates(strings)); // sorted collection
        System.out.println(strings);

        List<String> strings2 = new LinkedList<>();
        strings2.add("Ernie");
        strings2.add("Ernie");
        strings2.add("Bert");
        strings2.add("Elmo");
        strings2.add("Grover");
        strings2.add("Abby");
        System.out.println(sortAndRemoveDuplicates(strings2)); // sorted collection
        System.out.println(strings2);
    }
}