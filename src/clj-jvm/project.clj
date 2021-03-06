(defproject generator "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.codehaus.jsr166-mirror/jsr166y "1.7.0"]
                 [org.clojure/core.async "0.3.465"]
                 [org.clojure/data.priority-map "0.0.7"]
                 [org.clojure/data.avl "0.0.17"]
                 [org.clojure/data.int-map "0.2.4"]
                 [org.clojure/tools.reader "1.1.1"]
                 [org.flatland/ordered "1.5.6"]
                 [org.flatland/useful "0.11.5"]
                 [org.clojure/core.rrb-vector "0.0.11"]
                 [org.clojure-grimoire/lib-grimoire "0.10.9"]
                 [com.cemerick/url "0.1.1"]
                 [org.clojure/test.check "0.9.0"]]
  :main generator.core)
