import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class coll1{

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 40, 50);

        int max =numbers.stream().sorted(Comparator.reverseOrder().reversed());

        System.out.println(max);
    }
}