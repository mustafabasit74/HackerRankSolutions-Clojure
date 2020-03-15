;problem
;Filter a given array of integers and output only those values that are less than a specified value X.
;The output integers should be in the same sequence as they were in the input.
;You need to write a function with the recommended method signature for the languages mentioned below.
;For the rest of the languages, you have to write a complete code.

(defn do-filter
  [delimiter collection]
    (loop [remaining-collection collection
           filtered-collection []
           n delimiter] 
    (if (empty? remaining-collection)
          filtered-collection 
          (if (< (first remaining-collection) n) 
                (recur (vec (rest remaining-collection)) (conj filtered-collection (first remaining-collection)) n )
                (recur (vec (rest remaining-collection)) filtered-collection n ) ) ) ) )

;(do-filter 50 [14 83 20 47 55 65 11 4 92 31 50 27 13])
;(do-filter 50 [])

;------------------------------------------------------------------------------

;using inbuilt functions


;(defn do-filter
;    [delimiter given-collection]
;     (vec (filter #(< % delimiter) given-collection)) )

;(do-filter 50 [14 83 20 47 55 65 11 4 92 31 50 27 13])
;(do-filter 50 [])