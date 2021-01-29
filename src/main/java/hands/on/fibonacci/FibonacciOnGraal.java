package hands.on.fibonacci;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.math.BigInteger;

@Command(version = "@|yellow Fast Fibonacci on GraalVM 1.0|@", mixinStandardHelpOptions = true)
class FibonacciOnGraal implements Runnable {

    @Parameters(arity = "0..1", description = "The Fibonacci number to calculate")
    private int number = 0;

    @Option(names = {"-a", "--algorithm"}, description = "RECURSIVE (extremely slow), CACHED(slow), DYNAMIC (slow), BINET1 (fast), MATRIX (fast), DOUBLING (faster)")
    private Algorithm algorithm = Algorithm.RECURSIVE;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new FibonacciOnGraal()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        long startTime = System.nanoTime();
        BigInteger fibonacci = algorithm.calculate(number);
        long stopTime = System.nanoTime();

        System.out.println(algorithm.toString());
        System.out.printf("F(n): %d%n", fibonacci);
        System.out.printf("Time: %d ns%n", (stopTime - startTime));
    }
}
