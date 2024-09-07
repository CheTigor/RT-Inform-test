class GroovyCountUtil {

    static Map countElements(List list) {
        list.groupBy { it }.collectEntries { k, v -> [k, v.size()] }
    }

    static <T> Map countElements(T[] array) {
        countElements(array.toList())
    }
}
