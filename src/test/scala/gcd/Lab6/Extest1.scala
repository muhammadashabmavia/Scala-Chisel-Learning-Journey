package gcd.Lab6

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class Ex1test extends FreeSpec with ChiselScalatestTester {
  
  
  "Chisel " in {
    test(new Ex1) { dut =>
      dut.io.in.poke(true.B)
      dut.io.sel.poke(true.B)
      dut.clock.step(1)
      dut.io.out.expect(true.B)
      
      dut.io.in.poke(false.B)
      dut.io.sel.poke(false.B)
      dut.clock.step(1)
      dut.io.out.expect(2.U)
    }
  }
  
}
