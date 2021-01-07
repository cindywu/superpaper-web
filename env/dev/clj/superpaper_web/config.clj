(ns superpaper-web.config
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [superpaper-web.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[superpaper-web started successfully using the development profile]=-"))
   :middleware wrap-dev})
