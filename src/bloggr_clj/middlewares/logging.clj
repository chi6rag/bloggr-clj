(ns bloggr-clj.middlewares.logging
  (:gen-class))

(defn wrap-log-request [handler]
  (fn [request]
    (println request)
    (handler request)))
