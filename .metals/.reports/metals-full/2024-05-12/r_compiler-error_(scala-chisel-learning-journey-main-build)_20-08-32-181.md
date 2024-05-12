file://<WORKSPACE>/build.sbt
### java.lang.NullPointerException: Cannot read the array length because "a" is null

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.12.12
Classpath:
<WORKSPACE>/project/.bloop/scala-chisel-learning-journey-main-build/bloop-bsp-clients-classes/classes-Metals-fLR64zh_TtOyyJYRn74n_w== [missing ], <HOME>/.cache/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.9.9/semanticdb-javac-0.9.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/sbt/1.4.9/sbt-1.4.9.jar [exists ], <HOME>/.sbt/boot/scala-2.12.12/lib/scala-library.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/ch/epfl/scala/sbt-bloop_2.12_1.0/1.5.17/sbt-bloop-1.5.17.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/main_2.12/1.4.9/main_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/io_2.12/1.4.0/io_2.12-1.4.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/ch/epfl/scala/bloop-config_2.12/1.5.5/bloop-config_2.12-1.5.5.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/logic_2.12/1.4.9/logic_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/actions_2.12/1.4.9/actions_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/main-settings_2.12/1.4.9/main-settings_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/run_2.12/1.4.9/run_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/command_2.12/1.4.9/command_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/collections_2.12/1.4.9/collections_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/scripted-plugin_2.12/1.4.9/scripted-plugin_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-lm-integration_2.12/1.4.9/zinc-lm-integration_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-logging_2.12/1.4.9/util-logging_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_2.12/1.3.0/scala-xml_2.12-1.3.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/launcher-interface/1.1.6/launcher-interface-1.1.6.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/ben-manes/caffeine/caffeine/2.8.5/caffeine-2.8.5.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/get-coursier/lm-coursier-shaded_2.12/2.0.6/lm-coursier-shaded_2.12-2.0.6.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/logging/log4j/log4j-api/2.11.2/log4j-api-2.11.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/logging/log4j/log4j-core/2.11.2/log4j-core-2.11.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/logging/log4j/log4j-slf4j-impl/2.11.2/log4j-slf4j-impl-2.11.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/swoval/file-tree-views/2.1.6/file-tree-views-2.1.6.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/librarymanagement-core_2.12/1.4.3/librarymanagement-core_2.12-1.4.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/librarymanagement-ivy_2.12/1.4.3/librarymanagement-ivy_2.12-1.4.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/compiler-interface/1.4.4/compiler-interface-1.4.4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-compile_2.12/1.4.4/zinc-compile_2.12-1.4.4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/java/dev/jna/jna/5.5.0/jna-5.5.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/java/dev/jna/jna-platform/5.5.0/jna-platform-5.5.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/plokhotnyuk/jsoniter-scala/jsoniter-scala-core_2.12/2.4.0/jsoniter-scala-core_2.12-2.4.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-relation_2.12/1.4.9/util-relation_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/completion_2.12/1.4.9/completion_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/task-system_2.12/1.4.9/task-system_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/tasks_2.12/1.4.9/tasks_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/testing_2.12/1.4.9/testing_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-tracking_2.12/1.4.9/util-tracking_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/sjson-new-scalajson_2.12/0.9.1/sjson-new-scalajson_2.12-0.9.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-terminal/3.19.0/jline-terminal-3.19.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-classpath_2.12/1.4.4/zinc-classpath_2.12-1.4.4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-apiinfo_2.12/1.4.4/zinc-apiinfo_2.12-1.4.4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc_2.12/1.4.4/zinc_2.12-1.4.4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/core-macros_2.12/1.4.9/core-macros_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-cache_2.12/1.4.9/util-cache_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-control_2.12/1.4.9/util-control_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/protocol_2.12/1.4.9/protocol_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/sjson-new-core_2.12/0.9.1/sjson-new-core_2.12-0.9.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/template-resolver/0.1/template-resolver-0.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-position_2.12/1.4.9/util-position_2.12-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-compile-core_2.12/1.4.4/zinc-compile-core_2.12-1.4.4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-interface/1.4.9/util-interface-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/jline/jline/2.14.7-sbt-a1b0ffbb8f64bb820f4f84a0c07a0c0964507493/jline-2.14.7-sbt-a1b0ffbb8f64bb820f4f84a0c07a0c0964507493.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-terminal-jna/3.19.0/jline-terminal-jna-3.19.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-terminal-jansi/3.19.0/jline-terminal-jansi-3.19.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/lmax/disruptor/3.4.2/disruptor-3.4.2.jar [exists ], <HOME>/.sbt/boot/scala-2.12.12/lib/scala-reflect.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/checkerframework/checker-qual/3.4.1/checker-qual-3.4.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/errorprone/error_prone_annotations/2.4.0/error_prone_annotations-2.4.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-collection-compat_2.12/2.3.2/scala-collection-compat_2.12-2.3.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.26/slf4j-api-1.7.26.jar [exists ], <HOME>/.sbt/boot/scala-2.12.12/lib/scala-compiler.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/jcraft/jsch/0.1.54/jsch-0.1.54.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/gigahorse-okhttp_2.12/0.5.0/gigahorse-okhttp_2.12-0.5.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/squareup/okhttp3/okhttp-urlconnection/3.7.0/okhttp-urlconnection-3.7.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/ivy/ivy/2.3.0-sbt-fbc4f586aeeb1591710b14eb4f41b94880dcd745/ivy-2.3.0-sbt-fbc4f586aeeb1591710b14eb4f41b94880dcd745.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-reader/3.19.0/jline-reader-3.19.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-builtins/3.19.0/jline-builtins-3.19.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/test-agent/1.4.9/test-agent-1.4.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/test-interface/1.0/test-interface-1.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/shaded-jawn-parser_2.12/0.9.1/shaded-jawn-parser_2.12-0.9.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/shaded-scalajson_2.12/1.0.0-M4/shaded-scalajson_2.12-1.0.0-M4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/compiler-bridge_2.12/1.4.4/compiler-bridge_2.12-1.4.4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-classfile_2.12/1.4.4/zinc-classfile_2.12-1.4.4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-core_2.12/1.4.4/zinc-core_2.12-1.4.4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-persist_2.12/1.4.4/zinc-persist_2.12-1.4.4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/sjson-new-murmurhash_2.12/0.9.1/sjson-new-murmurhash_2.12-0.9.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/ipcsocket/ipcsocket/1.3.0/ipcsocket-1.3.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_2.12/1.1.2/scala-parser-combinators_2.12-1.1.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/openhft/zero-allocation-hashing/0.10.1/zero-allocation-hashing-0.10.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/fusesource/jansi/jansi/2.1.0/jansi-2.1.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/gigahorse-core_2.12/0.5.0/gigahorse-core_2.12-0.5.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/squareup/okhttp3/okhttp/3.14.2/okhttp-3.14.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-style/3.19.0/jline-style-3.19.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-persist-core-assembly/1.4.4/zinc-persist-core-assembly-1.4.4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/sbinary_2.12/0.5.1/sbinary_2.12-0.5.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/typesafe/ssl-config-core_2.12/0.4.0/ssl-config-core_2.12-0.4.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.2/reactive-streams-1.0.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/squareup/okio/okio/1.17.2/okio-1.17.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.3.3/config-1.3.3.jar [exists ]
Options:
-deprecation -Yrangepos -Xplugin-require:semanticdb -release 8


action parameters:
offset: 1321
uri: file://<WORKSPACE>/build.sbt
text:
```scala
import _root_.scala.xml.{TopScope=>$scope}
import _root_.sbt._
import _root_.sbt.Keys._
import _root_.sbt.nio.Keys._
import _root_.sbt.ScriptedPlugin.autoImport._, _root_.sbt.plugins.MiniDependencyTreePlugin.autoImport._, _root_.bloop.integrations.sbt.BloopPlugin.autoImport._
import _root_.sbt.plugins.IvyPlugin, _root_.sbt.plugins.JvmPlugin, _root_.sbt.plugins.CorePlugin, _root_.sbt.ScriptedPlugin, _root_.sbt.plugins.SbtPlugin, _root_.sbt.plugins.SemanticdbPlugin, _root_.sbt.plugins.JUnitXmlReportPlugin, _root_.sbt.plugins.Giter8TemplatePlugin, _root_.sbt.plugins.MiniDependencyTreePlugin, _root_.bloop.integrations.sbt.BloopPlugin
// See README.md for license details.

ThisBuild / scalaVersion     := "2.12.13"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "com.github.merledu"

lazy val root = (project in file("."))
  .settings(
    name := "Scala-Chisel-Learning-Journey",
    libraryDependencies ++= Seq(
      "edu.berkeley.cs" %% "chisel3" % "3.4.3",
      "edu.berkeley.cs" %% "chiseltest" % "0.3.3" % "test"
    ),
    scalacOptions ++= Seq(
      "-Xsource:2.11",
      "-language:reflectiveCalls",
      "-deprecation",
      "-feature",
      "-Xcheckinit",
      nables autoclonetype2 in 3.4.x (on by default in 3.5)
      "-P:chiselplugin:useBundlePlugin"
    ),
    addComp@@ilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % "3.4.3" cross CrossVersion.full),
    addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)
  )


```



#### Error stacktrace:

```
java.base/java.util.Arrays.sort(Arrays.java:1233)
	scala.tools.nsc.classpath.JFileDirectoryLookup.listChildren(DirectoryClassPath.scala:118)
	scala.tools.nsc.classpath.JFileDirectoryLookup.listChildren$(DirectoryClassPath.scala:102)
	scala.tools.nsc.classpath.DirectoryClassPath.listChildren(DirectoryClassPath.scala:291)
	scala.tools.nsc.classpath.DirectoryClassPath.listChildren(DirectoryClassPath.scala:291)
	scala.tools.nsc.classpath.DirectoryLookup.list(DirectoryClassPath.scala:83)
	scala.tools.nsc.classpath.DirectoryLookup.list$(DirectoryClassPath.scala:78)
	scala.tools.nsc.classpath.DirectoryClassPath.list(DirectoryClassPath.scala:291)
	scala.tools.nsc.classpath.AggregateClassPath.$anonfun$list$3(AggregateClassPath.scala:105)
	scala.collection.Iterator.foreach(Iterator.scala:943)
	scala.collection.Iterator.foreach$(Iterator.scala:943)
	scala.collection.AbstractIterator.foreach(Iterator.scala:1431)
	scala.collection.IterableLike.foreach(IterableLike.scala:74)
	scala.collection.IterableLike.foreach$(IterableLike.scala:73)
	scala.collection.AbstractIterable.foreach(Iterable.scala:56)
	scala.tools.nsc.classpath.AggregateClassPath.list(AggregateClassPath.scala:101)
	scala.tools.nsc.util.ClassPath.list(ClassPath.scala:36)
	scala.tools.nsc.util.ClassPath.list$(ClassPath.scala:36)
	scala.tools.nsc.classpath.AggregateClassPath.list(AggregateClassPath.scala:30)
	scala.tools.nsc.symtab.SymbolLoaders$PackageLoader.doComplete(SymbolLoaders.scala:288)
	scala.tools.nsc.symtab.SymbolLoaders$SymbolLoader.complete(SymbolLoaders.scala:240)
	scala.reflect.internal.Symbols$Symbol.completeInfo(Symbols.scala:1542)
	scala.reflect.internal.Symbols$Symbol.info(Symbols.scala:1514)
	scala.reflect.internal.Types$TypeRef.decls(Types.scala:2283)
	scala.tools.nsc.typechecker.Namers$Namer.enterPackage(Namers.scala:758)
	scala.tools.nsc.typechecker.Namers$Namer.dispatch$1(Namers.scala:281)
	scala.tools.nsc.typechecker.Namers$Namer.standardEnterSym(Namers.scala:294)
	scala.tools.nsc.typechecker.AnalyzerPlugins.pluginsEnterSym(AnalyzerPlugins.scala:479)
	scala.tools.nsc.typechecker.AnalyzerPlugins.pluginsEnterSym$(AnalyzerPlugins.scala:478)
	scala.meta.internal.pc.MetalsGlobal$MetalsInteractiveAnalyzer.pluginsEnterSym(MetalsGlobal.scala:68)
	scala.tools.nsc.typechecker.Namers$Namer.enterSym(Namers.scala:272)
	scala.tools.nsc.typechecker.Analyzer$namerFactory$$anon$1.apply(Analyzer.scala:50)
	scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:454)
	scala.tools.nsc.Global$Run.$anonfun$compileLate$3(Global.scala:1644)
	scala.tools.nsc.Global$Run.$anonfun$compileLate$2(Global.scala:1644)
	scala.tools.nsc.Global$Run.$anonfun$compileLate$2$adapted(Global.scala:1643)
	scala.collection.Iterator.foreach(Iterator.scala:943)
	scala.collection.Iterator.foreach$(Iterator.scala:943)
	scala.collection.AbstractIterator.foreach(Iterator.scala:1431)
	scala.tools.nsc.Global$Run.compileLate(Global.scala:1643)
	scala.tools.nsc.interactive.Global.parseAndEnter(Global.scala:653)
	scala.tools.nsc.interactive.Global.typeCheck(Global.scala:663)
	scala.meta.internal.pc.PcDefinitionProvider.definition(PcDefinitionProvider.scala:66)
	scala.meta.internal.pc.PcDefinitionProvider.definition(PcDefinitionProvider.scala:16)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$definition$1(ScalaPresentationCompiler.scala:350)
```
#### Short summary: 

java.lang.NullPointerException: Cannot read the array length because "a" is null