name := "ssd_blkdev"
scalaVersion := "2.11.8"
organization := "org.janzhou"

enablePlugins(GitVersioning)

scalacOptions ++= Seq("-optimise", "-feature", "-deprecation")

libraryDependencies += "net.java.dev.jna" % "jna" % "4.2.1"
libraryDependencies += "com.typesafe" % "config" % "1.2.1"
//libraryDependencies += "info.debatty" % "java-lsh" % "0.8"
libraryDependencies += "info.debatty" % "java-string-similarity" % "0.13"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.1"
//libraryDependencies += "com.baqend" % "bloom-filter" % "1.1.7"
libraryDependencies += "org.scalanlp" %% "breeze" % "0.12"

resolvers += Resolver.jcenterRepo
