

import groovy.test.GroovyTestCase

class GroovyCountUtilTest extends GroovyTestCase {

    void testCountElements() {
        List list = [1, 3, 4, 5, 1, 5, 4]
        Map result = [1: 2, 3: 1, 4: 2, 5: 2]

        assert result == GroovyCountUtil.countElements(list)

        List listEmpty = []
        Map resultEmpty = [:]

        assert resultEmpty == GroovyCountUtil.countElements(listEmpty)

        List inputList = [42]
        Map result2 = [42: 1]

        assert result2 == GroovyCountUtil.countElements(inputList)

        Integer[] integers = [1, 2, 3, 3, 3, 2, 1, 1]
        Map result3 = [1: 3, 2: 2, 3: 3]

        assert result3 == GroovyCountUtil.countElements(integers)
    }
}
