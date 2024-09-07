import java.util.*;
import java.util.stream.Collectors;

/**
 * Класс для подсчета количества совпадающих элементов в массивах/списках.
 */
public class CountUtil {

    public static <T> Map<T, Integer> countElements(T[] array) {
        Map<T, Integer> map = new HashMap<>();
        for (T el : array) {
            map.compute(el, (k, v) -> v == null ? 1 : v + 1);
        }
        return map;
    }

    public static <T> Map<T, Integer> countElements(Collection<T> list) {
        T[] array = (T[]) list.toArray();
        return countElements(array);
    }

    //Для примитовов будут похожие методы, их нельзя объединить в какой то один
    public static Map<Integer, Integer> countElements(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        return countElements(list);
    }
}
