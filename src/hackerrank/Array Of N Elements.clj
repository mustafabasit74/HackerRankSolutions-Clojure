(defn generate-collection
  [n]
  (vec (take n (range)) ) )

;(generate-collection 20)


;-----------------------------------------------------------------
;using inbuilt functions 

;Note: repeat will call function only once

;(defn generate-collection
;  [n]
;  (vec (repeat n (rand-int 100)) ) )

;(generate-collection 20)

;-----------------------------------------------------------------
;(defn generate-collection
;  [n]
;  (vec (repeatedly n #(rand-int 100) ) ))

;(generate-collection 20)
