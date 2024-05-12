package Lab7

import chisel3._
import chisel3.util._

class Ex1(numInputs: Int, queueDepth: Int) extends Module {
  // Define IO ports
  val io = IO(new Bundle {
    val in = Vec(numInputs, Flipped(Decoupled(UInt(8.W))))
    val out = Decoupled(UInt(8.W))
  })

  // Step 1: Create Queues hr input k liye using sequnce list array
  val queues = Seq.fill(numInputs)(Module(new Queue(UInt(8.W), queueDepth)))

  // Step 2: Connect inputs os k respective k liye
  for (i <- 0 until numInputs) {
    // Connect input to corresponding queue's enqueue port insert new data
    queues(i).io.enq <> io.in(i)
  }

  // Step 3: Create Arbiter to select between inputs
  val arbiter = Module(new Arbiter(UInt(8.W), numInputs))

  // Step 4: Connect outputs of Queues to inputs of Arbiter
  for (i <- 0 until numInputs) {
    // Connect output of each queue to arbiter's input
    arbiter.io.in(i) <> queues(i).io.deq
  }

  // Step 5: Connect Arbiter output to module output
  io.out <> arbiter.io.out
}
