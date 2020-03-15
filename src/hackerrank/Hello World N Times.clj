;problem
;Print "Hello World" N amount of times. The input portion will be handled automatically.
;You need to write a function with the recommended method signature

(defn hello_word_n_times 
    [n]
    (if (> n 0)
      (do (println "Hello World")
          (recur (- n 1) ) ) ) )
  