import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort_list {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Ernie");
        strings.add("Bert");
        strings.add("Elmo");
        strings.add("Grover");
        strings.add("Abby");

        Collections.sort(strings);

        System.out.println(strings);
    }
}