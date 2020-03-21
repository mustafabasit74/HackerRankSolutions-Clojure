;problem 
;Update the values of a list with their absolute values. The input and output
;portions will be handled automatically during grading. You only need to write
;a function with the recommended method signature.

(defn abs 
  [collection]
  (loop [remaining-collection collection
         absolute-collection [] ] 
        (if (empty? remaining-collection)
              absolute-collection
              (recur (rest remaining-collection) (conj absolute-collection (max (first remaining-collection) (- (first remaining-collection))))) )))

; how to  solve this  0 < -0 , 0 > -0  -  pending

;(map #(max % (- %)) [1 -2 0 3 -2 -0 -111 -3 4 3 10 0 -1])