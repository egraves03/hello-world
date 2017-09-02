#!/bin/bash -ex

export JAVA_HOME=/opt/jdk1.8.0_131
export PATH=${PATH}:${JAVA_HOME}/bin

/opt/jetty/bin/jetty.sh start
