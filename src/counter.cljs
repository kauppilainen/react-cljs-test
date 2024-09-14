(ns counter)

(defn customInc [n]
  (inc n))

(comment
  (js/fetch "http://localhost:1888"
            {:method "POST"
             :body (js/JSON.stringify
                    {:op "eval"
                     :ns "foo"
                     :code (str `(def n ,n))})})
  )
