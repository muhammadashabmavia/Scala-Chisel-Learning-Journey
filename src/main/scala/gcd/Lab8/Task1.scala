package Lab8

import chisel3._
import chisel3.util._

class memory_assignment extends Module {
  val io = IO(new Bundle {
    val memory_out = Vec(4, Output(UInt(32.W)))
    val requestor = Vec(4, Flipped(Decoupled(UInt(32.W))))
    val Readaddr = Input(UInt(5.W))
    val Writeaddr = Input(UInt(5.W))
  })

  // Memory bank
  val memoryBank = Mem(4, UInt(32.W))

  // Arbiter
  val arbiter = Module(new Arbiter(4))

  // Connect arbiter to requestors
  for (i <- 0 until 4) {
    arbiter.io.requestor(i) <> io.requestor(i)
  }

  // Connect arbiter to memory bank
  when(arbiter.io.selected.valid) {
    val selectedRequestor = arbiter.io.selected.bits
    val selectedData = arbiter.io.requestor(selectedRequestor).bits
    memoryBank.write(arbiter.io.selected.bits, selectedData)
  }

  // Connect memory bank to outputs
  for (i <- 0 until 4) {
    io.memory_out(i) := memoryBank.read(io.Readaddr)
  }
}

class Arbiter(numRequestors: Int) extends Module {
  val io = IO(new Bundle {
    val requestor = Vec(numRequestors, Flipped(Decoupled(UInt(32.W))))
    val selected = Decoupled(UInt(log2Ceil(numRequestors).W))
  })

  val requestorValid = VecInit(io.requestor.map(_.valid))
  val nextRequestor = PriorityEncoder(requestorValid)
  val arbiterValid = requestorValid.reduce(_ || _)
  
  io.selected.valid := arbiterValid
  io.selected.bits := nextRequestor

  for (i <- 0 until numRequestors) {
    io.requestor(i).ready := io.selected.valid && io.selected.bits === i.U
  }
}
