import java.util.*;

public class to_csv {
    static String toCsv(Collection<String> tokens) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> iterator = tokens.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("Ernie");
        strings.add("Bert");
        strings.add("Elmo");
        strings.add("Grover");
        strings.add("Abby");
        System.out.println(toCsv(strings));
    }
}