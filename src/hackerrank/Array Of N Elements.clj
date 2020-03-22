;; problem
;; Create an array of N integers, where the value of N is passed as an argument to the 
;; pre-filled function in your editor. This challenge uses a custom checker, so you can create any 
;; array of N integers. For example, if, N = 4 you could return [1 1 1 1],[1 2 3 4] or any other array of equal length.

(defn generate-collection
  [n]
  (loop [random-collection []
         counter n]
        (if (= counter 0)
              random-collection
              (recur (conj random-collection (rand-int 100)) (dec counter) ) )))
              
;; (generate-collection 5)
;; -----------------------------------------------
;; using inbuilt functions 

;; (defn generate-collection
;;  [n]
;;  (vec (take n (range)) ) )

;; (generate-collection 20)

;; -----------------------------------------------------------------

;; Note: repeat will call function only once

;; (defn generate-collection
;;  [n]
;;  (vec (repeat n (rand-int 100)) ) )

;; (generate-collection 20)

;; -----------------------------------------------------------------
;; (defn generate-collection
;;  [n]
;;  (vec (repeatedly n #(rand-int 100) ) ))

;; (generate-collection 20)
