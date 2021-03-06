(defproject org.clojars.thejohnnybrown/enlive "1.0.2-alpha1"
  :min-lein-version "2.0.0"
  :description "a HTML selector-based (à la CSS) templating and transformation system for Clojure"
  :url "http://github.com/cgrand/enlive/"
  :profiles     {:dev {:resource-paths ["test/resources"]}}
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.ccil.cowan.tagsoup/tagsoup "1.2.1"]])
