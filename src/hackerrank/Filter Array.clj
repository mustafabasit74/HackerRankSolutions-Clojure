(defn do-filter
  ([delimiter given-collection] 
     (do-filter delimiter given-collection [] ) )

  ([delimiter given-collection filtered-collection]
    (if (empty? given-collection)
          filtered-collection 
          (if (< (first given-collection) delimiter) 
                (recur delimiter (vec (rest given-collection)) (conj filtered-collection (first given-collection)) )
                (recur delimiter (vec (rest given-collection)) filtered-collection ) ) ) ) )

;(do-filter 50 [14 83 20 47 55 65 11 4 92 31 50 27 13])
;(do-filter 50 [])

;------------------------------------------------------------------------------

;using inbuilt functions


;(defn do-filter
;    [delimiter given-collection]
;     (vec (filter #(< % delimiter) given-collection)) )
;;     (vec .... ----------becaues "(do-filter 50 [] )" returns empty list "()" instead of empty vector "[]" 

;(do-filter 50 [14 83 20 47 55 65 11 4 92 31 50 27 13])
;(do-filter 50 [])