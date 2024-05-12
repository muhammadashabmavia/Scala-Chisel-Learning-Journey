package Lab7

import chisel3._
import chisel3.util._

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
      when(io.in_f1 === 1.U && io.in_f2 === 0.U && io.in_r1 === 0.U && io.in_r2 === 0.U) {
        stateReg := S1
      }
    }

    is(S1) {
      when(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 0.U && io.in_r2 === 0.U) {
        stateReg := S2
      }.elsewhen(io.in_r1 === 1.U && io.in_f2 === 0.U) {
        stateReg := S0
      }
    }

    is(S2) {
      when(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 1.U && io.in_r2 === 0.U) {
        stateReg := S3
      }.elsewhen(io.in_r1 === 0.U && io.in_r2 === 1.U) {
        stateReg := S0
      }
    }

    is(S3) {
      when(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 0.U && io.in_r2 === 0.U) {
        stateReg := S4
      }.elsewhen(io.in_r1 === 0.U && io.in_r2 === 1.U) {
        stateReg := S0
      }
    }

    is(S4) {
      when(io.in_f1 === 1.U && io.in_f2 === 1.U && io.in_r1 === 0.U && io.in_r2 === 0.U) {
        stateReg := S5
      }.elsewhen(io.in_r1 === 0.U && io.in_r2 === 1.U) {
        stateReg := S0
      }
    }

    is(S5) {
      when(io.in_r1 === 0.U && io.in_r2 === 1.U) {
        stateReg := S0
      }
    }
  }

  // Output logic
  io.out := stateReg.asUInt()
}

