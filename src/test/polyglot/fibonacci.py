print('Fibonacci in Python on GraalVM!')

n = 42

def fibonacci(n):
    if n == 1:
        return 1
    elif n == 2:
        return 1
    else:
        return fibonacci(n-1) + fibonacci(n-2)

def fibonacci_iter(n):
    if n == 1:
        return 1
    elif n == 2:
        return 1
    else:
        a = 1
        b = 1
        for i in range(2, n):
            c = a + b
            a = b
            b = c
        return b

print("{0}'s fibonacci value is {1}".format(n, fibonacci(n)))
