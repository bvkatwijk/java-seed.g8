import scala.sys.process.Process

// This build is for this Giter8 template.
// To test the template run `g8` or `g8Test` from the sbt session.
// See http://www.foundweekends.org/giter8/testing.html#Using+the+Giter8Plugin for more details.
lazy val root = (project in file("."))
  .enablePlugins(ScriptedPlugin)
  .settings(
    name := "java-seed",
    Test / test := {
      val scriptPath = "./test.sh"
      streams.value.log.info(s"Running script: $scriptPath")
      val result = Process(scriptPath).!
      if (result != 0) {
        throw new RuntimeException(s"Shell script failed with exit code $result")
      }
      streams.value.log.info("Shell script completed successfully")
    },
    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-Xss2m", "-Dfile.encoding=UTF-8"),
    resolvers += Resolver.url("typesafe", url("https://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)
  )
