(ns prime-palin.core)

(defn -check-odd [x]
	(if (odd? x) (println x)))

; ; Open the file passed as the first command line argument
; ; Read each line ignoring empty ones
; (with-open [rdr (clojure.java.io/reader (first *command-line-args*))]
;   (doseq [line (remove empty? (line-seq rdr))]
;     (-check-odd line)))

(defn -main [& args]
(doseq [line (range 0 100)]
    (-check-odd line)))

; (defn check-palin [num]
; 	(if (even? (.length (str num))) num "odd"))

; (defn check-prime [num]
;   (def divisors (range 2 num))
;   (map mod num divisors
;   	"not prime"))
; (ns prime-palin.core (:gen-class))

; (defn -main [& args]
; 	; (loop [x 0] 
; 	; 	(while (odd? x) (println x))
; 	; 	(recur (+ x 1)))
; 	(loop [x 10]
; 	  (while (> x 1)
; 	    (println x)
; 	    (recur (- x 2))))
; 	)
