name := "test"

version := "1.0"

lazy val `test` = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc ,
  cache ,
  "javax.ws.rs" % "jsr311-api" % "1.1.1" ,
  "io.swagger" %% "swagger-play2" % "latest.master"
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"  