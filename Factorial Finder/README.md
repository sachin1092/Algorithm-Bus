##Factorial Finder

Ruby
--

Recursive crashes after <b>8732</b>


Limit | Recursive | Iterative each | Iterative inject
--- | --- | --- | ---
8732|  0.095202s | 0.097400s | 0.092358s
100000 | Crashed | 7.5535s | 7.51875s


Crashed refers to segmentation fault

---

Python
--

Recursive crashed after <b>21825</b>

Limit | Recursive | Tail Recursive | Iterative | Functional
--- | --- | --- | --- | ---
21825|  0.514554023743s | 0.618299007416s | 0.485445022583s | 0.477245807648s
100000 | Crashed | Crashed | 9.60586905479s | 9.31830596924s


Crashed refers to segmentation fault

---

Java
--

Tail Recursive crashed after <b>9918</b>
</br>

Simple Recursive crashed after <b>9154</b>

Limit | Recursive | Tail Recursive | Iterative
--- | --- | --- | --- 
9918|  Crashed | 0.477s | 0.446s
9154|  0.308s | 0.379s | 0.405s
100000 | Crashed | Crashed | 48.612s


Crashed refers to StackOverflowError

---

Haskell
--

Limit | Tail Recursive | Product | Fold
--- | --- | --- | --- 
50000|  3.198s | 2.835s | -
100000 | 17.78s | 26.03 | -