import ScalaxbKeys._

organization := "com.example"

name := "scalaxb-intervat-sample"

seq(scalaxbSettings: _*)

packageName in scalaxb in Compile := "intervat"

sourceGenerators in Compile <+= scalaxb in Compile

// libraryDependencies += "net.databinder" %% "dispatch-http" % "0.8.5"
