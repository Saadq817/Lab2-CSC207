import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {

        long s = 0; // changed variable type to long from int
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
