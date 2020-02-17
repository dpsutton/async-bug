(ns bug.main
  (:require [reagent.core :as r]
            [clojure.core.async :refer [go go-loop alts! chan <! >! promise-chan] :as a]))

(defn ^:dev/after-load start
  []
  (r/render [:h3 "hi"]
            (.getElementById js/document "app")))

(defn ^:export init
  []
  (start))
