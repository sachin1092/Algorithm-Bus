import time

import sys
sys.setrecursionlimit(50000)

def ft_recursive(n):
    z=1
    if n>1:
        z=n*ft_recursive(n-1)
    return z

def ft_print(func, n):
	t1 = time.time()
	print func(n)
	t2 = time.time()
	return "Completed in " + func.__name__ + " " + str(t2-t1)

print ">"*5, "Factorial", "<"*5
print "Enter number: "
n = int(raw_input("Enter a number: "))
b1 = ft_print(ft_recursive, n) #~ 21825
print b1