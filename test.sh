#!/bin/bash
set -euo pipefail

sbt clean g8 test

pushd ./target/g8
  gradle wrapper
  ./gradlew test
popd
