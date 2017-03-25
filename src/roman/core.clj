(ns roman.core)

(defn convert [n]
  (apply str (map (fn [_] "I") (range n))))
