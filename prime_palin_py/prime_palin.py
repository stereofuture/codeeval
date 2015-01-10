def main(range_max):
    prime_palins = []
    for test in range(0,range_max):
        if check_palin(test) == "palindrome":
            if check_prime(test) == "prime":
                prime_palins.append(test)
    max_prime_palin = max(prime_palins)
    print max_prime_palin       


def check_palin(num):
    num_str = str(num)
    if num_str == num_str[::-1]:
        return "palindrome"
    return "normal"

def check_prime(num):
    for div in range(2,num):
        if num%div == 0:
            return "natural"
    if num >= 0:
        return "prime"
    return "error"

if __name__ == "__main__":
    main(1000)