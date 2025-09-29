#!/bin/bash
set -euo pipefail

mkdir -p ./target/g8
pushd ./target/g8
  gradle wrapper
  ./gradlew test
popd
