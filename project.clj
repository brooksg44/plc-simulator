(defproject plc-simulator "0.1.0-SNAPSHOT"
  :description "PLC Simulator - A simple Programmable Logic Controller simulator in Clojure"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/core.async "1.6.673"] ; For handling asynchronous operations
                 [cljfx "1.7.24"] ; For GUI components
                 [compliment "0.3.14"] ; For auto-completion in the REPL
                 [clojure.java-time "1.2.0"]] ; For handling time-related operations
  :main ^:skip-aot plc-simulator.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}
             :dev {:dependencies [[org.clojure/test.check "1.1.1"]]}})