# java-seed

[![CI](https://github.com/bvkatwijk/java-seed.g8/actions/workflows/ci.yml/badge.svg?event=push)](https://github.com/bvkatwijk/java-seed.g8/actions)

A Giter8 template for my Java projects.
Automatically sets up multi-module gradle project with a server and a library.

## Usage
```
sbt new bvkatwijk/java-seed.g8
```

## Included
* Multi-module project
  * Lib
* Libraries
  * [Lombok](https://projectlombok.org/) (automatic latest)
  * [Vavr](https://vavr.io/) (automatic latest)
  * [Junit](https://junit.org/) (automatic latest)
* Formatting with [.editorconfig](https://editorconfig.org)
* Code coverage with [JaCoCo](https://www.eclemma.org/jacoco/) and [Codecov](https://codecov.io/)
* Build with [Gradle](https://gradle.org)
* CI setup with [GitHub Actions](https://github.com/features/actions)
* Development with [Docker](https://www.docker.com/)
* Automation with [GitHub Actions](https://github.com/features/actions)
* Tool Version Management with [Asdf](https://asdf-vm.com/)

## Development

### Test
```sbt
clean g8 test
```

Template license
----------------
Written in 2021 by Boris van Katwijk bvkatwijk@gmail.com
