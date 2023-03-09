
def fibonacci(int n) {
    if (n < 2) {
        return n
    }
    return fibonacci(n - 1) + fibonacci(n - 2)
}

def main(String[] args) {
    println fibonacci(44)
}
