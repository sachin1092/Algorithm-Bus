--functional; recursive; one-line;

let fib x =  if x < 1 then 0 else (if x < 3 then 1 else (fib(x - 1) + fib(x - 2)))

--This is a standard example how to use lazy lists. Here's the (infinite) list of all Fibonacci numbers:
fib = 0 : 1 : zipWith (+) fib (tail fib)

