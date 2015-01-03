--Tail Recursive
fact_rec n
    | n >= 0    = go 1 n
    | otherwise = error "Negative factorial!"
        where go acc 0 = acc
              go acc n = go (acc * n) (n - 1)

--Simple product method
fact_prod n = product [1..n]

--Fold method
fact_fold n = foldl (*) 1 [1..n]