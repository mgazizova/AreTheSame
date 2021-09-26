import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AreTheSame {
    public static boolean comp(int[] a, int[] b) {
        int unUsing;


        if (a == null || b == null)
            return false;
        if (a.length != b.length)
            return false;

        List<Integer> list = Arrays.stream(b).boxed().collect(Collectors.toList());
        for (int num : a)
            if (!list.contains((int) Math.pow(num, 2)))
                return false;
            else if (list.size() == 1)
                list.clear();
            else
                list.remove(Integer.valueOf((int) Math.pow(num, 2)));
        if (!list.isEmpty())
            return false;

        return true;
    }
}