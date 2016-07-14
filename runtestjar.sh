#!/bin/bash

ARGS="--es http://linqia.local:9200 --api http://linqia.local:2250 --config ../config/linqia.conf.development.json"
cd $(dirname "$0")

if [ -f testjar.jar ]
then
    java -cp testjar.jar com.linqia.testjar.Main
else
    java -cp target/test-jar-1.0-SNAPSHOT-shaded.jar com.linqia.testjar.Main
fi
