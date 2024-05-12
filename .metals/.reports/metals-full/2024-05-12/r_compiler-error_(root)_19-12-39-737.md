file://<WORKSPACE>/src/main/scala/gcd/Lab7/Assignment.scala
### scala.reflect.internal.FatalError: 
  unexpected tree: class scala.reflect.internal.Trees$Template
<PeekPokeTester: error>(c) {
  def <init>(): <$anon: <error>> = {
    super.<init>();
    ()
  };
  <empty>
}
     while compiling: file://<WORKSPACE>/src/main/scala/gcd/Lab7/Assignment.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.12.13
    compiler version: version 2.12.13
  reconstructed args: -deprecation -feature -Wconf:cat=feature:w -Wconf:cat=deprecation:w -Wconf:cat=deprecation:ws -Wconf:cat=feature:ws -Wconf:cat=optimizer:ws -classpath <WORKSPACE>/.bloop/root/bloop-bsp-clients-classes/classes-Metals-WO1m5uDtR7WhyCI_GlZC-g==:<HOME>/.cache/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.9.9/semanticdb-javac-0.9.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.13/scala-library-2.12.13.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3_2.12/3.4.3/chisel3_2.12-3.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3-macros_2.12/3.4.3/chisel3-macros_2.12-3.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3-core_2.12/3.4.3/chisel3-core_2.12-3.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.12.13/scala-reflect-2.12.13.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/scopt/scopt_2.12/3.7.1/scopt_2.12-3.7.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/firrtl_2.12/1.4.3/firrtl_2.12-1.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/antlr/antlr4-runtime/4.7.1/antlr4-runtime-4.7.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/protobuf/protobuf-java/3.9.0/protobuf-java-3.9.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/jcazevedo/moultingyaml_2.12/0.4.2/moultingyaml_2.12-0.4.2.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-native_2.12/3.6.9/json4s-native_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-text/1.8/commons-text-1.8.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/nscala-time/nscala-time_2.12/2.22.0/nscala-time_2.12-2.22.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/yaml/snakeyaml/1.26/snakeyaml-1.26.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-core_2.12/3.6.9/json4s-core_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.9/commons-lang3-3.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/joda-time/joda-time/2.10.1/joda-time-2.10.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/joda/joda-convert/2.2.0/joda-convert-2.2.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-ast_2.12/3.6.9/json4s-ast_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-scalap_2.12/3.6.9/json4s-scalap_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar -language:reflectiveCalls -release 8 -Xcheckinit -Xplugin-require:semanticdb -Xsource:2.11.0 -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Template(value <local $anon>)
       tree position: line 90 of file://<WORKSPACE>/src/main/scala/gcd/Lab7/Assignment.scala
              symbol: value <local $anon>
   symbol definition: val <local $anon>: <notype> (a TermSymbol)
      symbol package: Lab7
       symbol owners: value <local $anon> -> <$anon: <error>> -> value $anonfun -> value <local My_QueueTester> -> object My_QueueTester
           call site: <none> in <none>

== Source file context for tree position ==

    87 
    88 object My_QueueTester extends App {
    89   iotesters.Driver.execute(args, () => new My_Queue) {
    90     c => new PeekPokeTester(c) {
    91       // Test your module here
    92     }
    93   }

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.12.13
Classpath:
<WORKSPACE>/.bloop/root/bloop-bsp-clients-classes/classes-Metals-WO1m5uDtR7WhyCI_GlZC-g== [exists ], <HOME>/.cache/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.9.9/semanticdb-javac-0.9.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.13/scala-library-2.12.13.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3_2.12/3.4.3/chisel3_2.12-3.4.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3-macros_2.12/3.4.3/chisel3-macros_2.12-3.4.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3-core_2.12/3.4.3/chisel3-core_2.12-3.4.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.12.13/scala-reflect-2.12.13.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/scopt/scopt_2.12/3.7.1/scopt_2.12-3.7.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/firrtl_2.12/1.4.3/firrtl_2.12-1.4.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/antlr/antlr4-runtime/4.7.1/antlr4-runtime-4.7.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/protobuf/protobuf-java/3.9.0/protobuf-java-3.9.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/jcazevedo/moultingyaml_2.12/0.4.2/moultingyaml_2.12-0.4.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-native_2.12/3.6.9/json4s-native_2.12-3.6.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-text/1.8/commons-text-1.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/nscala-time/nscala-time_2.12/2.22.0/nscala-time_2.12-2.22.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/yaml/snakeyaml/1.26/snakeyaml-1.26.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-core_2.12/3.6.9/json4s-core_2.12-3.6.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.9/commons-lang3-3.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/joda-time/joda-time/2.10.1/joda-time-2.10.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/joda/joda-convert/2.2.0/joda-convert-2.2.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-ast_2.12/3.6.9/json4s-ast_2.12-3.6.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-scalap_2.12/3.6.9/json4s-scalap_2.12-3.6.9.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar [exists ]
Options:
-Xsource:2.11 -language:reflectiveCalls -deprecation -feature -Xcheckinit -Yrangepos -Xplugin-require:semanticdb -release 8


action parameters:
offset: 2604
uri: file://<WORKSPACE>/src/main/scala/gcd/Lab7/Assignment.scala
text:
```scala
package Lab7

import chisel3._
import chisel3.util._
import chisel3.iotesters.{ChiselFlatSpec, Driver, PeekPokeTester}


class My_Queue extends Module {
  val io = IO(new Bundle {
    val in_f1 = Input(UInt(1.W))
    val in_f2 = Input(UInt(1.W))
    val in_r1 = Input(UInt(1.W))
    val in_r2 = Input(UInt(1.W))
    val out = Output(UInt(3.W))
  })

  // Define states
val state = Enum(6)
val S0 = state(0)
val S1 = state(1)
val S2 = state(2)
val S3 = state(3)
val S4 = state(4)
val S5 = state(5)

  // Define state register
val stateReg = RegInit(S0)

  // Define next state logic
  switch(stateReg) {
    is(S0) {
      when(io.in_f1 === 0.U && io.in_f2 === 0.U && io.in_r1 === 0.U && io.in_r2 === 0.U) {
        stateReg := S0
      }.elsewhen(io.in_f1 === 0.U && io.in_f2 === 1.U && io.in_r1 === 0.U && io.in_r2 === 1.U) {
        stateReg := S5
      }.elsewhen(io.in_f1 === 1.U && io.in_f2 === 0.U && io.in_r1 === 0.U && io.in_r2 === 0.U) {
        stateReg := S1
      }.elsewhen(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 0.U && io.in_r2 === 0.U) {
        stateReg := S1
      }
    }

    is(S1) {
      when(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 0.U && io.in_r2 === 1.U) {
        stateReg := S2
      }.elsewhen(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 1.U && io.in_r2 === 0.U) {
        stateReg := S0
      }
    }

    is(S2) {
      when(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 1.U && io.in_r2 === 0.U) {
        stateReg := S3
      }.elsewhen(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 0.U && io.in_r2 === 0.U) {
        stateReg := S2
      }
    }

    is(S3) {
      when(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 0.U && io.in_r2 === 0.U) {
        stateReg := S4
      }.elsewhen(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 0.U && io.in_r2 === 1.U) {
        stateReg := S0
      }
    }

    is(S4) {
      when(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 0.U && io.in_r2 === 0.U) {
        stateReg := S5
      }.elsewhen(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 0.U && io.in_r2 === 1.U) {
        stateReg := S0
      }
    }

    is(S5) {
      when(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 0.U && io.in_r2 === 0.U) {
        stateReg := S0
      }.elsewhen(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 0.U && io.in_r2 === 1.U) {
        stateReg := S0
      }
    }
  }

  // Output logic
  io.out := stateReg.asUInt()
}

object My_QueueTester extends App {
  iotesters.Driver.execute(args, () => new My_Queue) {
    c => new PeekPokeTester(c) {
      // T@@est your module here
    }
  }
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
<PeekPokeTester: error>(c) {
  def <init>(): <$anon: <error>> = {
    super.<init>();
    ()
  };
  <empty>
}
     while compiling: file://<WORKSPACE>/src/main/scala/gcd/Lab7/Assignment.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.12.13
    compiler version: version 2.12.13
  reconstructed args: -deprecation -feature -Wconf:cat=feature:w -Wconf:cat=deprecation:w -Wconf:cat=deprecation:ws -Wconf:cat=feature:ws -Wconf:cat=optimizer:ws -classpath <WORKSPACE>/.bloop/root/bloop-bsp-clients-classes/classes-Metals-WO1m5uDtR7WhyCI_GlZC-g==:<HOME>/.cache/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.9.9/semanticdb-javac-0.9.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.13/scala-library-2.12.13.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3_2.12/3.4.3/chisel3_2.12-3.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3-macros_2.12/3.4.3/chisel3-macros_2.12-3.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/chisel3-core_2.12/3.4.3/chisel3-core_2.12-3.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.12.13/scala-reflect-2.12.13.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/scopt/scopt_2.12/3.7.1/scopt_2.12-3.7.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/edu/berkeley/cs/firrtl_2.12/1.4.3/firrtl_2.12-1.4.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/antlr/antlr4-runtime/4.7.1/antlr4-runtime-4.7.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/protobuf/protobuf-java/3.9.0/protobuf-java-3.9.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/jcazevedo/moultingyaml_2.12/0.4.2/moultingyaml_2.12-0.4.2.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-native_2.12/3.6.9/json4s-native_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-text/1.8/commons-text-1.8.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/nscala-time/nscala-time_2.12/2.22.0/nscala-time_2.12-2.22.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/yaml/snakeyaml/1.26/snakeyaml-1.26.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-core_2.12/3.6.9/json4s-core_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.9/commons-lang3-3.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/joda-time/joda-time/2.10.1/joda-time-2.10.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/joda/joda-convert/2.2.0/joda-convert-2.2.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-ast_2.12/3.6.9/json4s-ast_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-scalap_2.12/3.6.9/json4s-scalap_2.12-3.6.9.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar -language:reflectiveCalls -release 8 -Xcheckinit -Xplugin-require:semanticdb -Xsource:2.11.0 -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Template(value <local $anon>)
       tree position: line 90 of file://<WORKSPACE>/src/main/scala/gcd/Lab7/Assignment.scala
              symbol: value <local $anon>
   symbol definition: val <local $anon>: <notype> (a TermSymbol)
      symbol package: Lab7
       symbol owners: value <local $anon> -> <$anon: <error>> -> value $anonfun -> value <local My_QueueTester> -> object My_QueueTester
           call site: <none> in <none>

== Source file context for tree position ==

    87 
    88 object My_QueueTester extends App {
    89   iotesters.Driver.execute(args, () => new My_Queue) {
    90     c => new PeekPokeTester(c) {
    91       // Test your module here
    92     }
    93   }