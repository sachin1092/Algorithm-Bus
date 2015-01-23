--functional; recursive; one-line;

let fib x =  if x < 1 then 0 else (if x < 3 then 1 else (fib(x - 1) + fib(x - 2)))

--This is a standard example how to use lazy lists. Here's the (infinite) list of all Fibonacci numbers:
fib = 0 : 1 : zipWith (+) fib (tail fib)

--The nth Fibonacci number is then just fib !! n.
fib = 0 : 1 : next fib where next (a: t@(b:_)) = (a+b) : next t

--With recurrence relations; Using Fib[m=3n+r]
fibsteps (a,b) n 
    | n <= 0    = (a,b)
    | otherwise = fibsteps (b, a+b) (n-1)
 
fibnums :: [Integer]
fibnums = map fst $ iterate (`fibsteps` 1) (0,1) 
 
fibN2 :: Integer -> (Integer, Integer)
fibN2 m | m < 10 = fibsteps (0,1) m
fibN2 m          = fibN2_next (n,r) (fibN2 n)
                     where (n,r) = quotRem m 3
 
fibN2_next (n,r) (f,g) | r==0 = (a,b)    -- 3n  ,3n+1
                       | r==1 = (b,c)    -- 3n+1,3n+2
                       | r==2 = (c,d)    -- 3n+2,3n+3   (*)
  where
      a = ( 5*f^3 + if even n then 3*f else (- 3*f) ) -- 3n
      d = ( 5*g^3 + if even n then (- 3*g) else 3*g ) -- 3(n+1)   (*)
      b = (   g^3 + 3 * g * f^2 - f^3               ) -- 3n+1
      c = (   g^3 + 3 * g^2 * f + f^3               ) -- 3n+2 