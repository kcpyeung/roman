(ns roman.core)

(defn convert [n]
  (if (= 5 n)
    "V"
    (apply str (map (fn [_] "I") (range n)))))
