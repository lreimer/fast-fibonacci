# Fibonacci Algorithms

Fibonacci implementations based on https://www.nayuki.io/page/fast-fibonacci-algorithms

## Building

A normal JDK 8 or higher is sufficient to build the application. For the native image build
a GraalVM installation is required.
 
```
$ ./gradlew kick ass graalNativeImage

$ cd build
$ ./fibonacci -a RECURSIVE 42
$ ./fibonacci -a CACHED 42
$ ./fibonacci -a DYNAMIC 42
$ ./fibonacci -a MATRIX 420000
$ ./fibonacci -a DOUBLING 420000
```

## Running

The compiled distribution archive of the application is located under `build/distributions/`. 
The binary image is located in the `build/` directory.
For local testing, there are some Gradle tasks available.
```
$ ./gradlew recursiveFibonacci42
$ ./gradlew cachedFibonacci42
$ ./gradlew dynamicFibonacci42
$ ./gradlew matrixFibonacci42
$ ./gradlew doublingFibonacci42
```


