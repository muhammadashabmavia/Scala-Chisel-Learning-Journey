package Lab7

import org.scalatest._
import chiseltest._
import chisel3._
import chisel3.util._

class Ex1Test extends FlatSpec with ChiselScalatestTester with Matchers {
  behavior of "Ex1"

  it should "correctly arbitrate between inputs" in {
    test(new Ex1(2, 4)) { a =>
      // Initialize input 0 with valid signal and value 99
      a.io.in(0).valid.poke(true.B)
      a.io.in(0).bits.poke(99.U)

      // Advance simulation by one clock cycle
      a.clock.step()

      // Check if output is valid and equals 99
      a.io.out.valid.expect(true.B)
      a.io.out.bits.expect(99.U)

      // Deactivate input 0 and activate input 1
      a.io.in(0).valid.poke(false.B)
      a.io.in(1).valid.poke(true.B)
      a.io.in(1).bits.poke(99.U)

      // Advance simulation by one clock cycle
      a.clock.step()

      // Check if output is valid and equals 99
      a.io.out.valid.expect(true.B)
      a.io.out.bits.expect(99.U)
    }
  }
}
