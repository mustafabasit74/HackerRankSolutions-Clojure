;; problem
;; count the number of elements in an array without using count, size or length
;; operators (or their equivalents). The input and output portions will be handled automatically 
;; by the grader. You only need to write a function with the recommended method signature.

(defn count-collection 
  [collection]
  (loop [remaining-collection collection
         count 0]
         (if (empty? remaining-collection)
               count
               (recur (rest remaining-collection) (inc count)))))

;; (count [0 1 2 3 4 5])