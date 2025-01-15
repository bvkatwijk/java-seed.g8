#!/bin/bash
set -euo pipefail

pushd ./target/g8
  gradle wrapper
  ./gradlew test
popd
