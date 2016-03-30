resolvers ++= Seq(
  Classpaths.sbtPluginReleases,
  "Twitter Maven" at "https://maven.twttr.com"
)

addSbtPlugin("com.twitter" % "scrooge-sbt-plugin" % "4.5.0")