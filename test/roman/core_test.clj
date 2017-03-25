(ns roman.core-test
  (:require [clojure.test :refer :all]
            [roman.core :refer :all]))

(deftest test-i
  (testing "convert 1 to I"
    (is (= "I" (convert 1)))))

(deftest test-ii
  (testing "convert 2 to II"
    (is (= "II" (convert 2)))))

(deftest test-v
  (testing "a non-I number, 5"
    (is (= "V" (convert 5)))))
