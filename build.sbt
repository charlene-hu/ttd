name := "ttd"

version := "1.0"

scalaVersion := "2.11.8"
val jacksonVersion = "2.8.0"
val scallopVersion = "1.0.2"

libraryDependencies ++= Seq(
  "org.jboss.netty" % "netty" % "3.2.0.Final",
  "org.slf4j" % "slf4j-api" % "1.7.21",
  "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.6.2",
  "org.apache.logging.log4j" % "log4j-api" % "2.6.2",
  "org.apache.logging.log4j" % "log4j-core" % "2.6.2",
  "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.6.2" % "runtime",
  "org.rogach" %% "scallop" % "1.0.2",
  "org.scalacheck" %% "scalacheck" % "1.13.2" % "test",
  "org.scalamock" %% "scalamock-scalatest-support" % "3.2" % "test",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "com.typesafe" % "config" % "1.3.0",
  "com.typesafe.scala-logging" % "scala-logging_2.11" % "3.7.2",
  "com.typesafe.play" % "play-ahc-ws-standalone_2.11" % "1.1.3",
  "com.typesafe.play" %% "play-ws-standalone-json" % "1.1.3",
  "com.fasterxml.jackson.core" % "jackson-core" % jacksonVersion,
  "com.fasterxml.jackson.core" % "jackson-databind" % jacksonVersion,
  "com.fasterxml.jackson.core" % "jackson-annotations" % jacksonVersion,
  "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.8.4",
  "org.json4s" % "json4s-native_2.11" % "3.5.3",
  "org.json4s" % "json4s-jackson_2.11" % "3.5.3",
  "ch.qos.logback" % "logback-classic" % "1.2.3"

)
