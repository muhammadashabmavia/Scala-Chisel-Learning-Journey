package Lab7

import org.scalatest._
import chiseltest._
import chisel3._

class MyFSMTest extends FlatSpec with ChiselScalatestTester with Matchers {
  behavior of "MyFSM"

  it should "correctly transition through states" in {
    test(new MyFSM) { dut =>
      // Reset FSM (optional)
      dut.io.f1.poke(false.B)
      dut.io.f2.poke(false.B)
      dut.io.r1.poke(false.B)
      dut.io.r2.poke(false.B)
      dut.clock.step(1)

      // Test case 1: Transition from state 0 to state 1
      dut.io.f1.poke(true.B)
      dut.io.r1.poke(false.B)
      dut.io.f2.poke(false.B)
      dut.io.r2.poke(false.B)
      dut.clock.step(1)
      dut.io.out.expect(0.U) // Output should be 0

      // Test case 2: Transition from state 1 to state 2
      dut.io.f1.poke(true.B)
      dut.io.r1.poke(false.B)
      dut.io.f2.poke(false.B)
      dut.io.r2.poke(false.B)
      dut.clock.step(1)
      dut.io.out.expect(0.U) // Output should be 0


      // Test case 3: Transition from state 2 to state 3
dut.io.f1.poke(false.B)
dut.io.r1.poke(true.B)
dut.io.f2.poke(false.B)
dut.io.r2.poke(false.B)
dut.clock.step(1)
dut.io.out.expect(0.U) // Output should be 0


      // Add more test cases for other state transitions as needed
    }
  }
}
