(defn do-filter
    ([given-list]
        (do-filter given-list []  1 ) )
    
    ([given-list filtered-list counter]
        (if (empty? given-list)
              filtered-list
              (if (odd? counter)
                    (recur (vec (rest given-list)) filtered-list (inc counter) )
                    (recur (vec (rest given-list)) (conj filtered-list (first given-list))  (inc counter)) ) ) ) )

;-----------------------------------------------------------

;using inbuilt functions

;    (defn do-filter 
;      [collection]
;      (take-nth 2 (rest collection)) )