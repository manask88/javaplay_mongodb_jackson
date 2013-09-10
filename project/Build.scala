import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "test"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
 //   "uk.co.panaxiom" %% "play-jongo" % "0.4",
   // "org.jongo" % "jongo" % "0.4",
    "org.mongodb" % "mongo-java-driver" % "2.11.2",
      "net.vz.mongodb.jackson" %% "play-mongo-jackson-mapper" % "1.1.0" 
//"net.vz.mongodb.jackson" % "play-mongo-jackson-mapper_2.9.1" % "1.0.0-rc.1" 
 )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here   
      resolvers += Resolver.url("My GitHub Play Repository", url("http://alexanderjarvis.github.com/releases/"))(Resolver.ivyStylePatterns)   
  )



}
