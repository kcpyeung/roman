(ns roman.core-test
  (:require [clojure.test :refer :all]
            [roman.core :refer :all]))

(deftest test-i
  (testing "convert 1 to I"
    (is (= "I" (convert 1)))))
