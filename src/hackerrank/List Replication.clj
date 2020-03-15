;problem
;Given a list, repeat each element in the list N amount of times. The input and output portions 
;will be handled automatically by the grader. You need to write a function with the recommended method signature.

(defn do-replicate
  [n-times collection]
  (loop [remaining-collection collection
         replicated-collection []
         repeat-n-times n-times 
         counter 1]
         (if (empty? remaining-collection)
              replicated-collection
              (if (= counter repeat-n-times )
                    (recur (rest remaining-collection) (conj replicated-collection (first remaining-collection)) repeat-n-times  1 )
                    (recur remaining-collection (conj replicated-collection (first remaining-collection)) repeat-n-times (inc counter)) ))))

;(do-replicate 2 [1 2 3  4 5 ] )                
;(do-replicate 2 '(1 2 3 4 5))
;------------------------------------------------------------------------
  
  ;using inbuilt functions
  
  ;(defn do-replicate 
  ;   [repeat-n-times collection]
  ;  (flatten (map #(repeat repeat-n-times %) collection) ) )
    
  ;(do-replicate 3 [1 2 3 4 5])