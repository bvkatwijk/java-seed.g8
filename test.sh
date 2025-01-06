#!/bin/bash
set -euo pipefail

rm -rf ./localtest

sbt new file://../java-seed.g8 -- \
  --username=local \
  --name=localtest

pushd localtest
  asdf install
  gradle test
popd
