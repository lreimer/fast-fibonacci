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

For building the application inside a Docker image, use the following command:
```
$ docker build -t fast-fibonacci:1.0 .
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

To run to binary from within Docker, use the following command:
```
$ docker run --rm -it fast-fibonacci:1.0
$ docker run --rm -it fast-fibonacci:1.0 -a RECURSIVE 42
```

As a comparision you can run the Ruby or Python equivalent natively or using GraalVM.
```
$ ruby src/test/polyglot/fibonacci.rb
$ time ruby src/test/polyglot/fibonacci.rb

# with GraalVM Ruby
$ gu install ruby
$ time $JAVA_HOME/bin/ruby src/test/polyglot/fibonacci.rb

$ python src/test/polyglot/fibonacci.py
$ time python src/test/polyglot/fibonacci.py

$ python3 src/test/polyglot/fibonacci.py
$ time python3 src/test/polyglot/fibonacci.py

# with GraalVM Python
$ gu install python
$ time $JAVA_HOME/bin/graalpython src/test/polyglot/fibonacci.py
```

## Maintainer

M.-Leander Reimer (@lreimer), <mario-leander.reimer@qaware.de>

## License

This software is provided under the MIT open source license, read the `LICENSE`
file for details.
