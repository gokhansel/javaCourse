import java.util.List;
import java.util.ArrayList;

public class WildcardExample {
    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        System.out.println(sum(ints));

        List<Number> nums = new ArrayList<>();
        addNumbers(nums);
        System.out.println(nums);
    }
}