import proto.SearchRequest
object Main extends App {
  val req =
    new SearchRequest(query = "hello", pageNumber = 123, resultPerPage = 456)
  // println(s"${req.pageNumber}")

  val pb = req.toByteArray
  println(s"pb = ${hexlify(pb)}")

  val parsed = SearchRequest.parseFrom(pb)
  assert(req.equals(parsed))
  println(s"parsed.query = '${parsed.query}'")

  println("---")
  val encodedHex = "0a0d686f7720646f20796f7520646f10c803189506"

  val got = SearchRequest.parseFrom(unhexlify(encodedHex))
  assert(got.query == "how do you do")
  assert(got.pageNumber == 456)
  assert(got.resultPerPage == 789)

  private def hexlify(b: Array[Byte]): String = b.map("%02x".format(_)).mkString
  private def unhexlify(s: String): Array[Byte] = BigInt(s, 16).toByteArray
}
