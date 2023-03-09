puts 'Fibonacci in Ruby on GraalVM!'

n = 42

def fibonacci(n)
    if n == 1
        1
    elsif n == 2
        1
    else
        fibonacci(n-1) + fibonacci(n-2)
    end
end

def fibonacci_iterative(n)
    a = 1
    b = 1
    for i in 3..n
        c = a + b
        a = b
        b = c
    end
    b
end

puts "#{n}'s fibonacci value is #{fibonacci(n)}"