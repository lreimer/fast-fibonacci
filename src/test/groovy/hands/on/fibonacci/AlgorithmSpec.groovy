package hands.on.fibonacci

import spock.lang.Specification

class AlgorithmSpec extends Specification {
    def "Calculate Recursive"() {
        given:
        def algorithm = Algorithm.RECURSIVE

        when:
        def result = algorithm.calculate(n)

        then:
        result == f

        where:
        n << [0, 1, 2, 3]
        f << [BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.TWO]
    }

    def "Calculate Dynamic"() {
        given:
        def algorithm = Algorithm.DYNAMIC

        when:
        def result = algorithm.calculate(n)

        then:
        result == f

        where:
        n << [0, 1, 2, 3]
        f << [BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.TWO]
    }

    def "Calculate BINET1"() {
        given:
        def algorithm = Algorithm.BINET1

        when:
        def result = algorithm.calculate(n)

        then:
        result == f

        where:
        n << [0, 1, 2, 3]
        f << [BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.TWO]
    }

    def "Calculate Matrix"() {
        given:
        def algorithm = Algorithm.MATRIX

        when:
        def result = algorithm.calculate(n)

        then:
        result == f

        where:
        n << [0, 1, 2, 3]
        f << [BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.TWO]
    }

    def "Calculate Doubling"() {
        given:
        def algorithm = Algorithm.DOUBLING

        when:
        def result = algorithm.calculate(n)

        then:
        result == f

        where:
        n << [0, 1, 2, 3]
        f << [BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.TWO]
    }
}
