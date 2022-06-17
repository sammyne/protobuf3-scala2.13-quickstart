import proto.SearchRequest

object Main extends App {
  println("Hello, World!")

  val req =
    new SearchRequest(query = "hello", pageNumber = 123, resultPerPage = 456)
  println(s"${req.pageNumber}")

  val pb = req.toByteArray
  println(s"pb = ${hexlify(pb)}")

  private def hexlify(b: Array[Byte]): String = b.map("%02x".format(_)).mkString
}
