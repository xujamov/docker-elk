name := "elk"
 
version := "1.0" 
      
lazy val `elk` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

      