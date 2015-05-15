(defproject modman-tool "0.1.0-SNAPSHOT"
  :description "Tool for packaging modded Minecrafts"
  :url "https://github.com/jlindsey/modman-tool"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.3.1"]
                 [cheshire "5.4.0"]]
  :main ^:skip-aot modman-tool.core
  :target-path "target/%s"
  :plugins [[lein-bin "0.3.5"]]
  :bin {:name "modman-tool"}
  :profiles {:uberjar {:aot :all}})
