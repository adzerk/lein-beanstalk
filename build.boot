(set-env!
  :src-paths    #{"src"}
  :dependencies '[[org.clojure/clojure   "1.6.0"     :scope "provided"]
                  [boot/core             "2.0.0-rc6" :scope "provided"]
                  [adzerk/bootlaces      "0.1.8"     :scope "test"]
                  [com.amazonaws/aws-java-sdk "1.3.31"]
                  [lein-ring "0.8.2"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "0.2.8")
(bootlaces! +version+)

(task-options!
 pom {:project     'adzerk/lein-beanstalk
      :version     +version+
      :description "Leiningen plugin for Amazon's Elastic Beanstalk"
      :url         "https://github.com/adzerk/lein-beanstalk"
      :scm         {:url "https://github.com/adzerk/lein-beanstalk"}
      :license     {"Eclipse Public License"
                    "http://www.eclipse.org/legal/epl-v10.html"}})
