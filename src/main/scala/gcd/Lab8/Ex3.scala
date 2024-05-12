package Lab8

import chisel3._
import chisel3.util._

class InstructionMemoryTester extends Module {
  val io = IO(new Bundle {
    val enable = Input(Bool())
    val instructionsIn = Input(Vec(1024, UInt(32.W)))
    val addr = Input(UInt(10.W))
    val instructionOut = Output(UInt(32.W))
  })

  // Create a memory to store instructions
  val instructionMemory = SyncReadMem(1024, UInt(32.W))

  // Write instruction stream to memory
  when(io.enable) {
    for (i <- 0 until 1024) {
      instructionMemory.write(i.U, io.instructionsIn(i))
    }
  }

  // Read instruction from memory
  io.instructionOut := instructionMemory.read(io.addr, true.B)
}

// class InstructionMemoryTesterSpec extends FlatSpec with Matchers with ChiselScalatestTester {
//   behavior of "Instruction Memory Tester"

//   it should "write and read instructions correctly" in {
//     test(new InstructionMemoryTester) { dut =>
//       val instructions = Array.fill(1024)(scala.util.Random.nextInt(1 << 32).U)

//       // Write instructions
//       dut.io.enable.poke(true.B)
//       dut.io.instructionsIn.poke(instructions)
//       dut.clock.step()

//       // Read and verify instructions
//       for (i <- 0 until 1024) {
//         dut.io.addr.poke(i.U)
//         dut.io.instructionOut.expect(instructions(i))
//       }
//     }
//   }
// }
