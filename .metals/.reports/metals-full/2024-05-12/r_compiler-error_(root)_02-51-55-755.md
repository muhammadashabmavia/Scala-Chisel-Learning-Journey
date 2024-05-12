file://<WORKSPACE>/src/main/scala/gcd/Lab7/Task1.scala
### scala.reflect.internal.FatalError: 
  unexpected tree: class scala.reflect.internal.Trees$Template
<Bundle: error> {
  def <init>(): <$anon: <error>> = {
    super.<init>();
    ()
  };
  private[this] val <f1: error>: <error> = <Input: error>(<Bool: error>());
  private[this] val <f2: error>: <error> = <Input: error>(<Bool: error>());
  private[this] val <r1: error>: <error> = <Input: error>(<Bool: error>());
  private[this] val <r2: error>: <error> = <Input: error>(<Bool: error>());
  private[this] val <out: error>: <error> = <Output: error>(<UInt: error>(3.<W: error>))
}
     while compiling: file://<WORKSPACE>/src/main/scala/gcd/Lab7/Task1.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.12.13
    compiler version: version 2.12.13
  reconstructed args: -deprecation -feature -Wconf:cat=feature:w -Wconf:cat=deprecation:w -Wconf:cat=deprecation:ws -Wconf:cat=feature:ws -Wconf:cat=optimizer:ws -classpath <WORKSPACE>/.bloop/root/bloop-bsp-clients-classes/classes-Metals-gARQ_LbFTx6nCwrY7WsZ2Q==:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/sourcegraph/semanticdb-javac/0.9.9/semanticdb-javac-0.9.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.13/scala-library-2.12.13.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3_2.12/3.4.3/chisel3_2.12-3.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3-macros_2.12/3.4.3/chisel3-macros_2.12-3.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3-core_2.12/3.4.3/chisel3-core_2.12-3.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.12.13/scala-reflect-2.12.13.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/scopt/scopt_2.12/3.7.1/scopt_2.12-3.7.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/firrtl_2.12/1.4.3/firrtl_2.12-1.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/antlr/antlr4-runtime/4.7.1/antlr4-runtime-4.7.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/protobuf/protobuf-java/3.9.0/protobuf-java-3.9.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/jcazevedo/moultingyaml_2.12/0.4.2/moultingyaml_2.12-0.4.2.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-native_2.12/3.6.9/json4s-native_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-text/1.8/commons-text-1.8.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/nscala-time/nscala-time_2.12/2.22.0/nscala-time_2.12-2.22.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/yaml/snakeyaml/1.26/snakeyaml-1.26.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-core_2.12/3.6.9/json4s-core_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.9/commons-lang3-3.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/joda-time/joda-time/2.10.1/joda-time-2.10.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/joda/joda-convert/2.2.0/joda-convert-2.2.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-ast_2.12/3.6.9/json4s-ast_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-scalap_2.12/3.6.9/json4s-scalap_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar -language:reflectiveCalls -release 8 -Xcheckinit -Xplugin-require:semanticdb -Xsource:2.11.0 -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Template(value <local $anon>)
       tree position: line 7 of file://<WORKSPACE>/src/main/scala/gcd/Lab7/Task1.scala
              symbol: value <local $anon>
   symbol definition: val <local $anon>: <notype> (a TermSymbol)
      symbol package: <empty>
       symbol owners: value <local $anon> -> <$anon: <error>> -> value io -> class MyFSM
           call site: <none> in <none>

== Source file context for tree position ==

     4 
     5 class MyFSM extends Module {
     6   // Define module IO
     7   val io = IO(new Bundle {
     8     val f1 = Input(Bool())  // Input signal f1
     9     val f2 = Input(Bool())  // Input signal f2
    10     val r1 = Input(Bool())  // Input signal r1

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.12.13
Classpath:
<WORKSPACE>/.bloop/root/bloop-bsp-clients-classes/classes-Metals-gARQ_LbFTx6nCwrY7WsZ2Q== [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/sourcegraph/semanticdb-javac/0.9.9/semanticdb-javac-0.9.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.13/scala-library-2.12.13.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3_2.12/3.4.3/chisel3_2.12-3.4.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3-macros_2.12/3.4.3/chisel3-macros_2.12-3.4.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3-core_2.12/3.4.3/chisel3-core_2.12-3.4.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.12.13/scala-reflect-2.12.13.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/scopt/scopt_2.12/3.7.1/scopt_2.12-3.7.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/firrtl_2.12/1.4.3/firrtl_2.12-1.4.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/antlr/antlr4-runtime/4.7.1/antlr4-runtime-4.7.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/protobuf/protobuf-java/3.9.0/protobuf-java-3.9.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/jcazevedo/moultingyaml_2.12/0.4.2/moultingyaml_2.12-0.4.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-native_2.12/3.6.9/json4s-native_2.12-3.6.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-text/1.8/commons-text-1.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/nscala-time/nscala-time_2.12/2.22.0/nscala-time_2.12-2.22.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/yaml/snakeyaml/1.26/snakeyaml-1.26.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-core_2.12/3.6.9/json4s-core_2.12-3.6.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.9/commons-lang3-3.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/joda-time/joda-time/2.10.1/joda-time-2.10.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/joda/joda-convert/2.2.0/joda-convert-2.2.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-ast_2.12/3.6.9/json4s-ast_2.12-3.6.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-scalap_2.12/3.6.9/json4s-scalap_2.12-3.6.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar [exists ]
Options:
-Xsource:2.11 -language:reflectiveCalls -deprecation -feature -Xcheckinit -Yrangepos -Xplugin-require:semanticdb -release 8


action parameters:
offset: 223
uri: file://<WORKSPACE>/src/main/scala/gcd/Lab7/Task1.scala
text:
```scala
class MyFSMState extends Bundle {
  val state = UInt(3.W)
}

class MyFSM extends Module {
  // Define module IO
  val io = IO(new Bundle {
    val f1 = Input(Bool())  // Input signal f1
    val f2 = Input(Bool())  // Input @@signal f2
    val r1 = Input(Bool())  // Input signal r1
    val r2 = Input(Bool())  // Input signal r2
    val out = Output(UInt(3.W))  // Output signal out
  })

  // Define state register
  val stateReg = RegInit(MyFSMState(0.U))

  // Define output register
  val outputReg = RegInit(0.U(3.W))

  // Define state transition logic
  switch(stateReg.state) {
    is(0.U) {
      when(io.f1) {
        stateReg.state := 1.U
        outputReg := 0.U // Output 0
      }.elsewhen(io.f2) {
        stateReg.state := 4.U
        outputReg := 7.U // Output 7
      }
    }
    is(1.U) {
      when(io.r1) {
        stateReg.state := 0.U
        outputReg := 0.U // Output 0
      }.elsewhen(io.f1) {
        stateReg.state := 2.U
        outputReg := 3.U // Output 3
      }
    }
    is(2.U) {
      when(io.r1) {
        stateReg.state := 0.U
        outputReg := 0.U // Output 0
      }.elsewhen(io.f1) {
        stateReg.state := 3.U
        outputReg := 0.U // Output 0
      }
    }
    is(3.U) {
      when(io.r1) {
        stateReg.state := 0.U
        outputReg := 0.U // Output 0
      }.elsewhen(io.f1) {
        stateReg.state := 2.U
        outputReg := 3.U // Output 3
      }
    }
    is(4.U) {
      when(io.r2 || io.f1) {
        stateReg.state := 0.U
        outputReg := 0.U // Output 0
      }.elsewhen(io.f2) {
        stateReg.state := 5.U
        outputReg := 0.U // Output 0
      }
    }
    is(5.U) {
      when(io.r2) {
        stateReg.state := 0.U
        outputReg := 0.U // Output 0
      }.elsewhen(io.f2) {
        stateReg.state := 4.U
        outputReg := 7.U // Output 7
      }
    }
  }

  // Output assignment
  io.out := outputReg
}
```



#### Error stacktrace:

```
scala.reflect.internal.Reporting.abort(Reporting.scala:69)
	scala.reflect.internal.Reporting.abort$(Reporting.scala:65)
	scala.reflect.internal.SymbolTable.abort(SymbolTable.scala:28)
	scala.tools.nsc.typechecker.Typers$Typer.typedOutsidePatternMode$1(Typers.scala:5727)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5744)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5780)
	scala.tools.nsc.typechecker.Typers$Typer.typedQualifier(Typers.scala:5864)
	scala.meta.internal.pc.PcDefinitionProvider.definitionTypedTreeAt(PcDefinitionProvider.scala:160)
	scala.meta.internal.pc.PcDefinitionProvider.definition(PcDefinitionProvider.scala:68)
	scala.meta.internal.pc.PcDefinitionProvider.definition(PcDefinitionProvider.scala:16)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$definition$1(ScalaPresentationCompiler.scala:350)
```
#### Short summary: 

scala.reflect.internal.FatalError: 
  unexpected tree: class scala.reflect.internal.Trees$Template
<Bundle: error> {
  def <init>(): <$anon: <error>> = {
    super.<init>();
    ()
  };
  private[this] val <f1: error>: <error> = <Input: error>(<Bool: error>());
  private[this] val <f2: error>: <error> = <Input: error>(<Bool: error>());
  private[this] val <r1: error>: <error> = <Input: error>(<Bool: error>());
  private[this] val <r2: error>: <error> = <Input: error>(<Bool: error>());
  private[this] val <out: error>: <error> = <Output: error>(<UInt: error>(3.<W: error>))
}
     while compiling: file://<WORKSPACE>/src/main/scala/gcd/Lab7/Task1.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.12.13
    compiler version: version 2.12.13
  reconstructed args: -deprecation -feature -Wconf:cat=feature:w -Wconf:cat=deprecation:w -Wconf:cat=deprecation:ws -Wconf:cat=feature:ws -Wconf:cat=optimizer:ws -classpath <WORKSPACE>/.bloop/root/bloop-bsp-clients-classes/classes-Metals-gARQ_LbFTx6nCwrY7WsZ2Q==:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/sourcegraph/semanticdb-javac/0.9.9/semanticdb-javac-0.9.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.13/scala-library-2.12.13.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3_2.12/3.4.3/chisel3_2.12-3.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3-macros_2.12/3.4.3/chisel3-macros_2.12-3.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3-core_2.12/3.4.3/chisel3-core_2.12-3.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.12.13/scala-reflect-2.12.13.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/scopt/scopt_2.12/3.7.1/scopt_2.12-3.7.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/firrtl_2.12/1.4.3/firrtl_2.12-1.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/antlr/antlr4-runtime/4.7.1/antlr4-runtime-4.7.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/protobuf/protobuf-java/3.9.0/protobuf-java-3.9.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/jcazevedo/moultingyaml_2.12/0.4.2/moultingyaml_2.12-0.4.2.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-native_2.12/3.6.9/json4s-native_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-text/1.8/commons-text-1.8.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/nscala-time/nscala-time_2.12/2.22.0/nscala-time_2.12-2.22.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/yaml/snakeyaml/1.26/snakeyaml-1.26.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-core_2.12/3.6.9/json4s-core_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.9/commons-lang3-3.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/joda-time/joda-time/2.10.1/joda-time-2.10.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/joda/joda-convert/2.2.0/joda-convert-2.2.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-ast_2.12/3.6.9/json4s-ast_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-scalap_2.12/3.6.9/json4s-scalap_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar -language:reflectiveCalls -release 8 -Xcheckinit -Xplugin-require:semanticdb -Xsource:2.11.0 -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Template(value <local $anon>)
       tree position: line 7 of file://<WORKSPACE>/src/main/scala/gcd/Lab7/Task1.scala
              symbol: value <local $anon>
   symbol definition: val <local $anon>: <notype> (a TermSymbol)
      symbol package: <empty>
       symbol owners: value <local $anon> -> <$anon: <error>> -> value io -> class MyFSM
           call site: <none> in <none>

== Source file context for tree position ==

     4 
     5 class MyFSM extends Module {
     6   // Define module IO
     7   val io = IO(new Bundle {
     8     val f1 = Input(Bool())  // Input signal f1
     9     val f2 = Input(Bool())  // Input signal f2
    10     val r1 = Input(Bool())  // Input signal r1