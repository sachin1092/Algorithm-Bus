import time

import sys
sys.setrecursionlimit(50000)

def ft_loop(n):
    result = 1
    for i in range(1, n+1):
        result *= i
    return result

from operator import mul
from functools import reduce
 
def ft_functional(n):
    return reduce(mul, range(1, n+1), 1)

def ft_recursive(n):
    x = 1
    if n > 1:
        x = n*ft_recursive(n-1)
    return x

def ft_helper(n, acc):
    return acc * n if n == 2 else ft_helper(n-1, acc * n)

def ft_tail_recursive(n):
    return ft_helper(n, 1)

def ft_print(func, n):
	t1 = time.time()
	print func(n)
	t2 = time.time()
	return "Completed in " + func.__name__ + " " + str(t2-t1)

print ">"*5, "Factorial", "<"*5
print "Enter number: "
n = int(raw_input("Enter a number: "))
b1 = ft_print(ft_loop, n)
b2 = ft_print(ft_functional, n)
b3 = ft_print(ft_recursive, n) #~ 21825
b4 = ft_print(ft_tail_recursive, n) #~ 21825

print b1
print b2
print b3
print b4