;problem
;You are given a list. Return the sum of odd elements from the given list
;The input and output portions will be handled automatically. You need to write 
;a function with the recommended method signature.

(defn sum-of-odds 
  [collection]
  (loop [remaining-collection  (filter odd? collection)
         accumulated-sum 0]
        (if (empty? remaining-collection)
             accumulated-sum
             (recur (rest remaining-collection) (+ accumulated-sum (first remaining-collection)) ) )))

;(reduce + (filter odd? collection) )