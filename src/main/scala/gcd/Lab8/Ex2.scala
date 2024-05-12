import chisel3._
import chisel3.util._

class MaskedReadWriteSmem extends Module {
  val width: Int = 8
  val io = IO(new Bundle {
    val enable = Input(Bool())
    val write = Input(Bool())
    val addr = Input(UInt(10.W))
    val mask = Input(Vec(4, Bool()))
    val dataIn = Input(Vec(4, UInt(width.W)))
    val dataOut = Output(Vec(4, UInt(width.W)))
  })

  // Create two 32-bit wide memories that are byte-masked
  val mem0 = SyncReadMem(512, Vec(4, UInt(width.W)))
  val mem1 = SyncReadMem(512, Vec(4, UInt(width.W)))

  // Write with mask
  val writePort = VecInit(io.write +: io.mask)
  when(io.addr(9) === false.B) {
    mem0.write(io.addr(8, 0), io.dataIn, writePort)
  }.otherwise {
    mem1.write(io.addr(8, 0), io.dataIn, writePort)
  }

  // Read data
  val readData0 = mem0.read(io.addr(8, 0), io.enable)
  val readData1 = mem1.read(io.addr(8, 0), io.enable)

  // Forwarding logic
  val dataOutReg0 = RegNext(readData0)
  val dataOutReg1 = RegNext(readData1)
  io.dataOut := Mux(io.addr(9) === false.B, dataOutReg0, dataOutReg1)
}
