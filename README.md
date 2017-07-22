Gradle RESTful service, Hello World!
====

Simple RESTful service built with Gradle.

Jetty plugin for Gradle is deprecated; couldn't get the Gretty plugin to work with an
integration test. 

Started with project from:
https://github.com/ziroby/jetty-gradle-hello-world


gradle war
cp build/libs/hello.war $JETTY_DIR/webapps/

jetty.sh start
http://localhost:8080/hello/hello
jetty.sh stop


