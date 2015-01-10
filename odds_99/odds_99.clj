(ns prime-palin.core)

(defn -check-odd [x]
	(if (odd? x) (println x)))

(defn -main [& args]
(doseq [line (range 0 100)]
    (-check-odd line)))
