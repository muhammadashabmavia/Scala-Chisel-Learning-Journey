package Lab7
import chisel3._
import chisel3.util._

class MyFSM extends Module {
  // Define module IO
  val io = IO(new Bundle {
    val f1 = Input(Bool())  // Input signal f1
    val f2 = Input(Bool())  // Input signal f2
    val r1 = Input(Bool())  // Input signal r1
    val r2 = Input(Bool())  // Input signal r2
    val out = Output(UInt(3.W))  // Output signal out
  })

  // Define state register
  val stateReg = RegInit(0.U(3.W)) // 3-bit state register

  // Output register
  val outputReg = RegInit(0.U(3.W)) // 3-bit output register

  // State transition logic
  switch(stateReg) {
    is(0.U) { // State S0
      when(io.f1 && !io.r1) {
        stateReg := 1.U
        outputReg := 0.U // Output 0
      }.elsewhen(io.f2 && !io.r2) {
        stateReg := 4.U
        outputReg := 7.U // Output 7
      }
    }
    is(1.U) { // State S1
      when(io.f1 && !io.r1) {
        stateReg := 2.U
        outputReg := 0.U // Output 0
      }.elsewhen(!io.f1 && !io.r1) {
        stateReg := 0.U
        outputReg := 0.U // Output 0
      }
    }
    is(2.U) { // State S2
  when(io.f1 && !io.r1) {
    stateReg := 3.U
    outputReg := 3.U // Output 3
  }.elsewhen(!io.f1 && !io.r1) {
    stateReg := 1.U
    outputReg := 0.U // Output 0
  }
}


    is(3.U) { // State S3
      when(!io.f1 && io.r1) {
        stateReg := 2.U
        outputReg := 0.U // Output 0
      }
    }
    is(4.U) { // State S4
      when(io.f2 && !io.r2) {
        stateReg := 5.U
        outputReg := 0.U // Output 0
      }.elsewhen(!io.f2 && !io.r2) {
        stateReg := 0.U
        outputReg := 0.U // Output 0
      }
    }
    is(5.U) { // State S5
      when(io.f2 && !io.r2) {
        stateReg := 4.U
        outputReg := 7.U // Output 7
      }.elsewhen(!io.f2 && !io.r2) {
        stateReg := 0.U
        outputReg := 0.U // Output 0
      }
    }
  }

  // Output assignment
  io.out := outputReg
}
