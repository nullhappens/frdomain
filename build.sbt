lazy val commonSettings = Seq(
  version := "0.0.1",
  scalaVersion := "2.11.12",
  licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0")),
  // addCompilerPlugin("com.milessabin" % "si2712fix-plugin" % "1.2.0" cross CrossVersion.full),
  addCompilerPlugin("org.spire-math" %% "kind-projector"  % "0.8.0"),
  libraryDependencies ++= Seq(
      "org.scalaz"                   %% "scalaz-core"                   % "7.3.5",
      "org.scalaz"                   %% "scalaz-concurrent"             % "7.2.33",
      "joda-time"                     % "joda-time"                     % "2.10.11",
      "org.joda"                      % "joda-convert"                  % "2.2.1",
      "io.spray"                     %% "spray-json"                    % "1.3.2",
      "com.typesafe.akka"            %% "akka-actor"                    % "2.5.32",
      "com.typesafe.akka"            %% "akka-persistence"              % "2.5.32",
      "com.typesafe.akka"            %% "akka-stream"                   % "2.5.32",
      "com.typesafe.scala-logging"   %% "scala-logging-slf4j"           % "2.1.2",
      "com.typesafe.slick"           %% "slick"                         % "3.3.3",
      "com.h2database"                % "h2"                            % "1.4.200",
      "com.zaxxer"                    % "HikariCP-java6"                % "2.3.13",
      "ch.qos.logback"                % "logback-classic"               % "1.2.6",
      "org.scalacheck"               %% "scalacheck"                    % "1.15.2"       % "test"
    )
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "frdomain",
    scalacOptions ++= Seq(
      "-feature",
      "-unchecked",
      "-language:higherKinds",
      "-language:postfixOps",
      "-deprecation",
      "-Ypartial-unification"
    )
  )

