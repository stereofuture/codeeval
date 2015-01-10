def main(num_primes):
    primes = []
    num = 2
    while len(primes) < num_primes:
        if check_prime(num) == "prime":
            primes.append(num)
        num+=1
    sum_primes = sum(primes)
    print sum_primes       

def check_prime(num):
    for div in range(2,num):
        if num%div == 0:
            return "natural"
    if num >= 0:
        return "prime"
    return "error"

if __name__ == "__main__":
    main(1000)