(defn do-reverse 
  ([collection]
    (do-reverse collection []) )
  
  ([collection reversed-collection]
    (if (empty? collection)
      reversed-collection
      (recur (vec (drop-last collection) )  (conj reversed-collection (last collection)) ) ) )   )


;(do-reverse [1 2 3 4 5])
;(do-reverse '(1 2 3 4 5) )

;---------------------------------------------------------------------
;using inbuilt functions


;(defn do-reverse)
;  [collection]
;  (reverse collection))



;(do-reverse [1 2 3 4 5])
;(do-reverse '(1 2 3 4 5) )