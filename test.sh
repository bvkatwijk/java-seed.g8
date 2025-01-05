#!/bin/bash
set -euo pipefail

sbt new file://../java-seed.g8 -- \
  --username=local \
  --name=localtest

pushd localtest
  asdf install
  gradle test
popd
