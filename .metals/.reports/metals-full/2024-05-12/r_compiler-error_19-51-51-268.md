file://<WORKSPACE>/build.sc
### file%3A%2F%2F%2Fhome%2Fsyed%2FDocuments%2FScala-Chisel-Learning-Journey-main%2Fbuild.sc:10: error: ; expected but identifier found
object Scala-Chisel-Learning-Journey extends SbtModule { m =>
            ^

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.12.13
Classpath:
<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.13/scala-library-2.12.13.jar [exists ]
Options:



action parameters:
uri: file://<WORKSPACE>/build.sc
text:
```scala
// import Mill dependency
import mill._
import mill.define.Sources
import mill.modules.Util
import mill.scalalib.TestModule.ScalaTest
import scalalib._
// support BSP
import mill.bsp._

object Scala-Chisel-Learning-Journey extends SbtModule { m =>
  override def millSourcePath = os.pwd
  override def scalaVersion = "2.12.13"
  override def scalacOptions = Seq(
    "-Xsource:2.11",
    "-language:reflectiveCalls",
    "-deprecation",
    "-feature",
    "-Xcheckinit",
    // Enables autoclonetype2 in 3.4.x (on by default in 3.5)
    "-P:chiselplugin:useBundlePlugin"
  )
  override def ivyDeps = Agg(
    ivy"edu.berkeley.cs::chisel3:3.4.3",
  )
  override def scalacPluginIvyDeps = Agg(
    ivy"edu.berkeley.cs:::chisel3-plugin:3.4.3",
    ivy"org.scalamacros:::paradise:2.1.1"
  )
  object test extends Tests with ScalaTest {
    override def ivyDeps = m.ivyDeps() ++ Agg(
      ivy"edu.berkeley.cs::chiseltest:0.3.3"
    )
  }
}

```



#### Error stacktrace:

```
scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.ScalametaParser.syntaxErrorExpected(ScalametaParser.scala:367)
	scala.meta.internal.parsers.ScalametaParser.expect(ScalametaParser.scala:369)
	scala.meta.internal.parsers.ScalametaParser.accept(ScalametaParser.scala:373)
	scala.meta.internal.parsers.ScalametaParser.acceptStatSep(ScalametaParser.scala:389)
	scala.meta.internal.parsers.ScalametaParser.acceptStatSepOpt(ScalametaParser.scala:393)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4357)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$13(ScalametaParser.scala:4594)
	scala.Option.getOrElse(Option.scala:189)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$1(ScalametaParser.scala:4594)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:300)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:346)
	scala.meta.internal.parsers.ScalametaParser.batchSource(ScalametaParser.scala:4550)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$source$1(ScalametaParser.scala:4543)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:300)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:346)
	scala.meta.internal.parsers.ScalametaParser.source(ScalametaParser.scala:4543)
	scala.meta.internal.parsers.ScalametaParser.entrypointSource(ScalametaParser.scala:4548)
	scala.meta.internal.parsers.ScalametaParser.parseSourceImpl(ScalametaParser.scala:127)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$parseSource$1(ScalametaParser.scala:124)
	scala.meta.internal.parsers.ScalametaParser.parseRuleAfterBOF(ScalametaParser.scala:51)
	scala.meta.internal.parsers.ScalametaParser.parseRule(ScalametaParser.scala:46)
	scala.meta.internal.parsers.ScalametaParser.parseSource(ScalametaParser.scala:124)
	scala.meta.parsers.Parse$.$anonfun$parseSource$1(Parse.scala:29)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:36)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:25)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:17)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:206)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:400)
```
#### Short summary: 

file%3A%2F%2F%2Fhome%2Fsyed%2FDocuments%2FScala-Chisel-Learning-Journey-main%2Fbuild.sc:10: error: ; expected but identifier found
object Scala-Chisel-Learning-Journey extends SbtModule { m =>
            ^