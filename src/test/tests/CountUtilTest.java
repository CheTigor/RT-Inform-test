import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CountUtilTest {

    @Test
    public void testCountElementsCollections() {
        List<Integer> list = Arrays.asList(1, 4, 4, 2, 1, 1, 3, 1, 3, 1);

        Assertions.assertEquals(getIntegerResult(), CountUtil.countElements(list));
        Assertions.assertEquals(new HashMap<Integer, Integer>(), CountUtil.countElements(new ArrayList<>()));


        List<String> listStrings = Arrays.asList("пять", "семь", "два", "два", "три", "пять", "пять", "один");

        Assertions.assertEquals(getStringResult(), CountUtil.countElements(listStrings));
        Assertions.assertEquals(new HashMap<String, Integer>(), CountUtil.countElements(new ArrayList<>()));

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1); queue.add(2); queue.add(1); queue.add(4); queue.add(1);

        HashMap<Object, Object> result2 = new HashMap<>();
        result2.put(1, 3);
        result2.put(2, 1);
        result2.put(4, 1);

        Assertions.assertEquals(result2, CountUtil.countElements(queue));
        Assertions.assertEquals(new HashMap<Integer, Integer>(), CountUtil.countElements(new ArrayDeque<>()));
    }

    @Test
    public void testCountElementsPrimitives() {
        int[] arrayInts = new int[]{1, 4, 4, 2, 1, 1, 3, 1, 3, 1};

        Assertions.assertEquals(getIntegerResult(), CountUtil.countElements(arrayInts));

        int[] ints = new int[]{};
        Assertions.assertEquals(new HashMap<Integer, Integer>(), CountUtil.countElements(ints));
    }

    @Test
    public void testCountElementsArrays() {
        String[] arrayStrings = new String[]{"пять", "семь", "два", "два", "три", "пять", "пять", "один"};
        Assertions.assertEquals(getStringResult(), CountUtil.countElements(arrayStrings));

        String[] strings = new String[]{};
        Assertions.assertEquals(new HashMap<String, Integer>(), CountUtil.countElements(strings));
    }

    private Map<Integer, Integer> getIntegerResult() {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(1, 5);
        result.put(4, 2);
        result.put(2, 1);
        result.put(3, 2);
        return result;
    }

    private Map<String, Integer> getStringResult() {
        Map<String, Integer> result = new HashMap<>();
        result.put("пять", 3);
        result.put("семь", 1);
        result.put("два", 2);
        result.put("три", 1);
        result.put("один", 1);
        return result;
    }
}
