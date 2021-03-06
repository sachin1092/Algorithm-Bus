require 'benchmark'

# Recursive with Tail recursion
def fhelper (x, acc)
	return acc * x if x == 2
	fhelper(x - 1, acc * x)
end

def ft_recursive (x)
	fhelper(x, 1)
end

# Iterative with each
def ft_loop (number)
    f = 1
    (1..number).each { |i| f *= i }
    f
end

# Iterative with inject
def ft_inject(n)
	(1..n).inject {|prod, i| prod * i;}
end

puts ">"*5 + "Factorial" + "<"*5
puts "Enter number: "
num = gets.chomp.to_i
bench1 = Benchmark.measure { puts ft_recursive(num) } 
bench2 = Benchmark.measure { puts ft_loop(num) }
bench3 = Benchmark.measure { puts ft_inject(num) }
puts "Recursive in #{bench1}"
puts "Iterative loop in #{bench2}"
puts "Iterative inject in #{bench3}"