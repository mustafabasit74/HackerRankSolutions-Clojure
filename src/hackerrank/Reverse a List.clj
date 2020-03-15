;problem
;You are given a list of N elements. Reverse the list without using the reverse function
;The input and output portions will be handled automatically. You need to write 
;a function with the recommended method signature.

(defn do-reverse
  [collection]
  (loop [remaining-collection collection
         reversed-collection [] ]
        (if (empty? remaining-collection)
          reversed-collection
          (recur (vec (drop-last remaining-collection) ) 
             (conj reversed-collection (last remaining-collection))))))
  
;(do-reverse [1 2 3 4 5])
;(do-reverse '(1 2 3 4 5) )
;(do-reverse #{1 2 3 4 5} )

;---------------------------------------------------------------
;Reduce abstracts the task “process a collection and build a result”

;(defn do-reverse 
;  [collection]
;  (reduce (fn [reversed-collection item]
;                (conj reversed-collection item)) '() collection))

;(do-reverse [1 2 3 4])

;---------------------------------------------------------------
;(defn do-reverse)
;  [collection]
;  (reverse collection))



;(do-reverse [1 2 3 4 5])
;(do-reverse '(1 2 3 4 5) )
