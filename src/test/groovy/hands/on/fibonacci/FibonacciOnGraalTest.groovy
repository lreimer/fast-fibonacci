package hands.on.fibonacci

import spock.lang.Specification

class FibonacciOnGraalTest extends Specification {
    def "Application runs"() {
        setup:
        def app = new FibonacciOnGraal()
        app.message

        when:
        app.run()

        then:
        noExceptionThrown()
    }
}
