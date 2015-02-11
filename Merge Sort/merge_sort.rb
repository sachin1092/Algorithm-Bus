def merge_sort(m)
  return m if m.length <= 1
 
  middle = m.length / 2
  left = m[0..middle - 1]
  right = m[middle..-1]
 
  left = merge_sort(left)
  right = merge_sort(right)
  merge(left, right)
end
 
def merge(left, right)
  result = []
  until left.empty? || right.empty?
    if left.first <= right.first
      result << left.shift
    else
      result << right.shift
    end
  end
  result + left + right
end