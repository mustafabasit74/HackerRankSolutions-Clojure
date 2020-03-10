(defn replicate-list 
    [repeat-n-times collection]
    (flatten (map #(repeat repeat-n-times %) collection) ) )


;(def number-list [3 1 2 3 4])
;(replicate-list (first number-list) (rest number-list))