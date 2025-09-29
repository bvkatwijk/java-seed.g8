#!/bin/zsh
set -euo pipefail

sbt new bvkatwijk/java-seed.g8 -f \
    --username=boris.van.katwijk \
    --name=default-project-name

pushd default-project-name
    gradle test
popd