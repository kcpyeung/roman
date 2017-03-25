(defproject roman "0.1.0-SNAPSHOT"
  :description "roman numerals"
  :url "https://github.com/kcpyeung/roman"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot roman.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
