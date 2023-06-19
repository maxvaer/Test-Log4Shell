name := "TestProject"
version := "0.2"
organization := "TestCorp"
scalaVersion := "2.9.1"
sbtVersion := "0.13"

libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.20.0"
libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.20.0"
initialCommands := """
    import myproject.stuff._;
    import myproject.other.stuff._;
    """