(defn filter-collection
    [delimiter collection]
    (filter #(< % delimiter) collection)   )