package hands.on.fibonacci

import spock.lang.Specification

class FibonacciOnGraalTest extends Specification {
    def "Application runs"() {
        setup:
        def app = new FibonacciOnGraal()
        app.number = 1

        when:
        app.run()

        then:
        noExceptionThrown()
    }
}
