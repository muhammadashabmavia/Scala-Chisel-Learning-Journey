package Lab7

import chisel3._
import chisel3.util._
import chisel3.tester._
import org.scalatest._

class My_QueueTester extends FlatSpec with ChiselScalatestTester {

  "My_Queue" should "pass test cases" in {
    test(new My_Queue) { c =>
      // Example test cases
      // Test case 1
      c.io.in_f1.poke(1.U)
      c.io.in_f2.poke(0.U)
      c.io.in_r1.poke(0.U)
      c.io.in_r2.poke(0.U)
      c.clock.step(1)
      c.io.out.expect(1.U) // Output should be S1

      // Test case 2
      c.io.in_f1.poke(1.U)
      c.io.in_f2.poke(1.U)
      c.io.in_r1.poke(0.U)
      c.io.in_r2.poke(0.U)
      c.clock.step(1)
      c.io.out.expect(2.U) // Output should be S2

      // Test case 3
      c.io.in_f1.poke(1.U)
      c.io.in_f2.poke(1.U)
      c.io.in_r1.poke(1.U)
      c.io.in_r2.poke(0.U)
      c.clock.step(1)
      c.io.out.expect(0.U) // Output should be S0
    }
  }
}
