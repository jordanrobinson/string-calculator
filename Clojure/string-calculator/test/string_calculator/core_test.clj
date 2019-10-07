(ns string-calculator.core-test
  (:require [clojure.test :refer :all]
            [string-calculator.core :refer :all]))

(deftest add_TakesEmptyString_ReturnsZero
  (testing ""
    (is (= (add "") 0))))

(deftest add_TakesSingleDigit_ReturnsSingleDigit
  (testing ""
    (is (= (add "4") 4))))

(deftest add_TakesTwoDigits_AddsAndReturnsSingleDigit
  (testing ""
    (is (= (add "1,2") 3))))

(deftest add_TakesArbitraryNumberOfDigits_AddsAndReturnsSingleDigit
  (testing ""
    (is (= (add "1,2,3") 6))))
