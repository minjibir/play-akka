name := """play-akka-template"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test


val akkaVersion = "2.6.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence" % akkaVersion,
  "com.typesafe.akka" %% "akka-persistence-query" % akkaVersion
)

libraryDependencies += "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8"

//libraryDependencies ++= Seq(
//  "com.typesafe.akka" %% "akka-persistence-cassandra" % "0.102",
//  "com.typesafe.akka" %% "akka-persistence-cassandra-launcher" % "0.102" % Test
//)
