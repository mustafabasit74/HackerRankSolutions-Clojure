(defn do-filter
    ([given-list]
        (do-filter given-list []  1 ) )
    
    ([given-list filtered-list counter]
        (if (empty? given-list)
              filtered-list
              (if (odd? counter)
                    (recur (vec (rest given-list)) filtered-list (inc counter) )
                    (recur (vec (rest given-list)) (conj filtered-list (first given-list))  (inc counter)) ) ) ) )

;(do-filter [1 2 3 4 5 6 7 8 9 10])
;(do-filter [1])

;-----------------------------------------------------------

;using inbuilt functions

;    (defn do-filter 
;      [collection]
;      (take-nth 2 (rest collection)) )