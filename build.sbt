name := "hello"

version := "0.1"

libraryDependencies += "com.mongodb.casbah" % "casbah_2.9.0-1" % "2.1.5.0"

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "releases"  at "https://oss.sonatype.org/content/groups/scala-tools"