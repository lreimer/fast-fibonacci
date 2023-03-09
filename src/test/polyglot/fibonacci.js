function fibonacci(n) {
    if (n === 1 || n === 2) {
        return 1
    } else {
        return fibonacci(n-1) + fibonacci(n-2)
    }
}

function fibonacci_iter(n) {
    if (n === 1 || n === 2) {
        return 1
    } else {
        let a = 1
        let b = 1
        let c = 0
        for (let i = 2; i < n; i++) {
            c = a + b
            a = b
            b = c
        }
        return c
    }
}

console.log(fibonacci(42))
