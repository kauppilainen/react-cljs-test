(ns counter)

(defn customInc [n]
  (inc n))

(comment
  ;; Bind n to 1 in REPL from generated javascript
  ;; Request fails and the Squint REPL dies but
  ;; this is along the lines of what I'm thinking
  (def n 1)
  (js/fetch "http://localhost:1888"
            {:method "POST"
             :body (js/JSON.stringify
                    {:ns "counter"
                     :op "eval"
                     :code "(def n 1)"})})
  )
