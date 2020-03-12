(defn do-replicate
    ([repeat-n-times collection replicated-collection max-count]  
    (if (empty? collection)
          replicated-collection
          (do 
            (if (= max-count repeat-n-times)
                  (recur repeat-n-times (vec (rest collection) )  (conj replicated-collection (first collection) ) 1 )
                  (recur repeat-n-times collection (conj replicated-collection (first collection) ) (inc max-count) ) ) ) ) )
    ([repeat-n-times collection]
          (do-replicate repeat-n-times collection [] 1) ) )

  ;(do-replicate 3 [1 2 3 4 5])

  ;------------------------------------------------------------------------
  
  ;using inbuilt functions
  
  ;(defn do-replicate 
  ;   [repeat-n-times collection]
  ;  (flatten (map #(repeat repeat-n-times %) collection) ) )
    
  ;(do-replicate 3 [1 2 3 4 5])