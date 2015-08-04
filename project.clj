(defproject crashlytics/schema-contrib "0.1.6"
  :description "Additional validators for Prismatic's Schema."
  :url "https://github.com/crashlytics/schema-contrib"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.7.0"]]}}
  :dependencies [[instaparse "1.4.1"]
                 [org.clojure/test.check "0.7.0"]
                 [prismatic/schema "0.4.3"]]
  :resource-paths ["resources"])
