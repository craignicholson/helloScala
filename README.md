#HelloScala: a tutorial from MongoDB and Scala using the Casbah driver.

This is a sample console app to test Scala, Casbah, and Mongodb.  The application was created on MacOSX.  The README doc is an ongoing improvement this weekend.  I will also try and get 


## Installation
I used HomeBrew to install the following:
Mongodb
Scala
Sbt

To get this app up and running I needed to review the Simple Build Tool (sbt) .   You will need to read the sbt Getting Started and create the sample Hello.scala app they have listed.
http://www.scala-sbt.org/release/docs/Getting-Started/Welcome.html

sbt - Hello World - example with one file.
http://www.scala-sbt.org/release/docs/Getting-Started/Hello.html

This will get you up and running with a simple application.

## Casbah
Loading the Casbah with sbt is done by editing the build.sbt file.  This process is what took me some time to do because 
of outdate documentation or just sites not having the correct information.

The quick route without reading is the following: 

```js
name := "hello"

version := "0.1"

libraryDependencies += "com.mongodb.casbah" % "casbah_2.9.0-1" % "2.1.5.0"

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "releases"  at "https://oss.sonatype.org/content/groups/scala-tools"
```


## How do I use it?

1.  ...
2.  ...

## Tools

### How do load casbah?

E

## Debugging



## Authors

+ [@nicholsoncraig](http://github.com/craignicholson)



## License

Copyright 2013 Craig Nicholson, and other contributors.

Licensed under the MIT License