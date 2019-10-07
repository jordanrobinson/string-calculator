(ns string-calculator.core
  (:gen-class))
(require '[clojure.core.reducers :as reducers])
(require '[clojure.string :as str])

(defn write-output
  [output]
  ;(do (clojure-katas.writer/write output))
  output)

(defn add
  [numbers]
  (if (str/blank? numbers)
    (write-output 0)
    (write-output
      (reducers/fold + (map read-string (str/split numbers #","))))))
