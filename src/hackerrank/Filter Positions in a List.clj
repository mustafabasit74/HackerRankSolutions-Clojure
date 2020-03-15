;problem
;For a given list with N integers, return a new list removing the elements 
;at odd positions. The input and output portions will be handled automatically.
;You need to write a function with the recommended method signature.

(defn do-filter
  [collection]
  (loop [remaining-collection collection
         filtered-collection []
         position 1 ]

        (if (empty? remaining-collection)
              filtered-collection
              (if (odd? position)
                (recur (vec (rest remaining-collection)) filtered-collection (inc position) )
                (recur (vec (rest remaining-collection)) (conj filtered-collection (first remaining-collection)) (inc position)) ))))

;(do-filter [1 2 3 4 5 6 7 8 9 10])
;(do-filter [1])
;(do-filter [])

;-----------------------------------------------------------
;using inbuilt functions

;    (defn do-filter 
;      [collection]
;      (take-nth 2 (rest collection)) )



