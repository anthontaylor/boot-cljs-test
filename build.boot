(set-env!
  :dependencies '[[org.clojure/clojure       "1.8.0"   :scope "provided"]
                  [boot/core                 "2.7.1"   :scope "provided"]
                  [adzerk/bootlaces          "0.1.13"  :scope "test"]
                  [adzerk/boot-cljs          "2.1.2"   :scope "test"]
                  [dooo                       "0.1.9-SNAPSHOT"   :scope "test"]
                  [adzerk/boot-test          "1.2.0"   :scope "test"]])

(require '[adzerk.bootlaces :refer :all]
         '[adzerk.boot-test :refer :all])

(def +version+ "0.3.6-SNAPSHOT")

(bootlaces! +version+)

(task-options!
 pom  {:project     'anthontaylor/boot-cljs-test
       :version     +version+
       :description "Boot task to run ClojureScript tests."
       :url         "https://github.com/anthontaylor/boot-cljs-test"
       :scm         {:url "https://github.com/anthontaylor/boot-cljs-test"}
       :license     {"EPL" "http://www.eclipse.org/legal/epl-v10.html"}})

(deftask deps[])

(deftask testing []
  (merge-env! :source-paths #{"test"}))
