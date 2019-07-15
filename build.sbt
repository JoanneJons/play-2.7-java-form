name := """phonebook"""
organization := "com.joannejons"
version := "1.0-SNAPSHOT"

scalaVersion := "2.13.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

libraryDependencies ++= Seq(
  guice,
  "com.h2database" % "h2" % "1.4.192",
  "mysql" % "mysql-connector-java" % "5.1.41"

)



