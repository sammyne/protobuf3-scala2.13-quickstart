object Main extends App {
  println("Hello, World!")

  val req = new proto.SearchRequest()
  println(s"${req.pageNumber}")
}
