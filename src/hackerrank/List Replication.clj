(defn replicate-list 
    [repeat-n-times number-list]
    (flatten (map #(repeat repeat-n-times %) number-list) ) )


;(def number-list [3 1 2 3 4])
;(replicate-list (first number-list) (rest number-list))